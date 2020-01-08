package org.calcite.example.parser.sample.statement;

import org.apache.calcite.sql.parser.SqlParseException;
import org.calcite.example.parser.sample.AbstractSample;

/**
 * @author quxiucheng
 * @date 2019-04-25 11:15:00
 */
public class StringLiteralSample extends AbstractSample {
    public static void main(String[] args) throws SqlParseException {
        System.out.println(parser.parseQuery("string_literal_sample '123'").getClass());
    }
}
