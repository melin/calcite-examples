package org.calcite.example.parser.sample.statement;

import org.apache.calcite.sql.parser.SqlParseException;
import org.calcite.example.parser.sample.AbstractSample;

/**
 * @author quxiucheng
 * @date 2019-04-25 11:18:00
 */
public class IntervalLiteralSample extends AbstractSample {
    public static void main(String[] args) throws SqlParseException {
        System.out.println(parser.parseQuery("interval_literal_sample INTERVAL - '1' SECOND").getClass());
        System.out.println(parser.parseQuery("interval_literal_sample INTERVAL + '1' SECOND").getClass());
    }
}
