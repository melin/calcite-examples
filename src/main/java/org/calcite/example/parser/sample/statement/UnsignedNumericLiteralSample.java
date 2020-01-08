package org.calcite.example.parser.sample.statement;

import org.apache.calcite.sql.parser.SqlParseException;
import org.calcite.example.parser.sample.AbstractSample;

/**
 * @author quxiucheng
 * @date 2019-04-24 15:46:00
 */
public class UnsignedNumericLiteralSample extends AbstractSample {

    public static void main(String[] args) throws SqlParseException {
        System.out.println(parser.parseQuery("unsigned_numeric_literal_sample 123").getClass());
    }

}
