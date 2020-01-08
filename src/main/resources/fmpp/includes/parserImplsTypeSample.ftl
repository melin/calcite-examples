/**
* 解析Array类型 - 自定义
*/
SqlTypeNameSpec SqlArrayType() :
{
    SqlParserPos pos;
    SqlTypeNameSpec elementType;
    boolean nullable = true;
}
{
    <ARRAY> { pos = getPos(); }
    <LT>
    elementType = TypeName()
    <GT>
    {
        return new SqlArrayType(pos, elementType);
    }
}