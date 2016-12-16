/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.jdbm;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.MySqlKey;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitorAdapter;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlOutputVisitor;
import com.alibaba.druid.sql.visitor.SQLASTVisitor;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public class druidtest {
    private String sql;

    @Before
    public void setUp() throws Exception {
        sql = "SELECT * FROM T";
        sql = "SELECT ID, NAME, AGE FROM USER WHERE ID = ?";

//        sql = Utils.readFromResource("benchmark/sql/ob_sql.txt");
    }
@Test
    public void test_pert() throws Exception {

            sql = "SELECT ID, NAME, AGE FROM USER WHERE ID = ?";
            execMySql();
        sql = "show variables";
        execMySql();

    }


//    @Test
    public void execMySql() {
        StringBuilder out = new StringBuilder();
        MySqlOutputVisitor visitor = new MySqlOutputVisitor(out);
        myvistpor myvistpor = new myvistpor();
        MySqlStatementParser parser = new MySqlStatementParser(sql);
        List<SQLStatement> statementList = parser.parseStatementList();


         for (SQLStatement statement : statementList) {
             if (statement instanceof SQLSelectStatement) {
                 SQLSelectStatement sqlSelectStatement = (SQLSelectStatement) statement;
//                 System.out.println(sqlSelectStatement.getSelect().getQuery());
             }
//             System.out.println(statement.getClass().getName());
             statement.accept(myvistpor);
         visitor.println();
         }
//         System.out.println(out.toString());
//        return out.toString();
    }

    static class myvistpor extends MySqlASTVisitorAdapter {
        @Override
        public boolean visit(MySqlKey x) {
             super.visit(x);
            System.out.println(x.getClass().getName());
            return true;
        }

    }
}
