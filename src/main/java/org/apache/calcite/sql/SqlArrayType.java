package org.apache.calcite.sql;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.sql.parser.SqlParserPos;
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.calcite.sql.validate.SqlValidator;
import org.apache.calcite.util.Litmus;

import static org.apache.calcite.sql.type.SqlTypeName.ARRAY;

/**
 * @author quxiucheng
 * @date 2019-11-02 16:39:00
 */
public class SqlArrayType extends SqlTypeNameSpec {

    private final SqlTypeNameSpec elementTypeName;

    public SqlArrayType(SqlParserPos pos, SqlTypeNameSpec elementType) {
        super(new SqlIdentifier(SqlTypeName.ARRAY.getName(), pos), pos);
        this.elementTypeName = elementType;
    }

    public SqlTypeNameSpec getElementTypeName() {
        return elementTypeName;
    }

    @Override
    public RelDataType deriveType(SqlValidator validator) {
        return validator.getTypeFactory()
                .createArrayType(elementTypeName.deriveType(validator), -1);
    }

    @Override
    public void unparse(SqlWriter writer, int leftPrec, int rightPrec) {
        writer.keyword(ARRAY.name());
        SqlWriter.Frame frame = writer.startList(SqlWriter.FrameTypeEnum.FUN_CALL, "<", ">");
        elementTypeName.unparse(writer, leftPrec, rightPrec);
        writer.keyword("NOT NULL");
        writer.endList(frame);
    }

    @Override
    public boolean equalsDeep(SqlTypeNameSpec spec, Litmus litmus) {
        if (!(spec instanceof SqlArrayType)) {
            return litmus.fail("{} != {}", this, spec);
        }
        SqlArrayType that = (SqlArrayType) spec;
        if (!this.elementTypeName.equalsDeep(that.elementTypeName, litmus)) {
            return litmus.fail("{} != {}", this, spec);
        }
        return litmus.succeed();
    }
}
