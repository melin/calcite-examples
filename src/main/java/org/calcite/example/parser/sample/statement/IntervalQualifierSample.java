package org.calcite.example.parser.sample.statement;

import org.apache.calcite.sql.parser.SqlParseException;
import org.calcite.example.parser.sample.AbstractSample;

/**
 * @author quxiucheng
 * @date 2019-04-25 11:19:00
 */
public class IntervalQualifierSample extends AbstractSample {
    public static void main(String[] args) throws SqlParseException {
        System.out.println(parser.parseQuery("interval_qualifier_sample MONTH").getClass());
    }
}
