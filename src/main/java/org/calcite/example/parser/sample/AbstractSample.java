package org.calcite.example.parser.sample;

import org.apache.calcite.config.Lex;
import org.apache.calcite.sql.parser.SqlParser;
import org.calcite.example.parser.CustomSqlParserImpl;

/**
 * @author quxiucheng
 * @date 2019-04-24 15:47:00
 */
public abstract class AbstractSample {
    public static SqlParser.Config mysqlConfig = SqlParser.configBuilder()
            // 定义解析工厂
            .setParserFactory(CustomSqlParserImpl.FACTORY)
            .setLex(Lex.MYSQL)
            .build();
    public static SqlParser parser = SqlParser.create("", mysqlConfig);

}
