package org.calcite.example.parser.sample.statement;

import org.apache.calcite.sql.parser.SqlParseException;
import org.calcite.example.parser.sample.AbstractSample;

/**
 * @author quxiucheng
 * @date 2019-04-25 11:36:00
 */
public class CompoundIdentifierSample extends AbstractSample {
    public static void main(String[] args) throws SqlParseException {
        System.out.println(parser.parseQuery("compound_identifier_sample aa").getClass());
        System.out.println(parser.parseQuery("compound_identifier_sample hr.aa").getClass());
    }
}
