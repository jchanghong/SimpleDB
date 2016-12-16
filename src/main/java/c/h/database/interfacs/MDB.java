/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.interfacs;

import c.h.database.model.Database;
import c.h.database.model.Table;
import c.h.database.model.TableFiled;
import c.h.database.model.TableRow;
import c.h.database.sql.CreateTableStatementhander;
import c.h.database.sql.SQLhanderAdapter;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;

import java.util.List;
import java.util.Map;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public class MDB implements DBoperation {
    Database database;
    public MDB() {
    }

    public MDB(Database database) {
        this.database = database;
    }
    public Database createDB(String dbname) {
        return null;
    }

    public boolean dropdb(String dbname) {
        return false;
    }

    public Database get(String dbname) {
        return null;
    }

    public List<Database> listall() {
        return null;
    }

    public boolean dropall() {
        return false;
    }

    public List<Table> listtables() {
        return null;
    }

    public Table findtable(String tablename) {
        return null;
    }

    @Override
    public Table createtable(String tablename, List<TableFiled> tableFileds) {
        if (database == null) {
            return null;
        }
        Map<String, Object> map = database.jdbm.createTreeMap(tablename);

        return null;
    }


    public boolean droptable(String tablename) {
        return false;
    }

    @Override
    public boolean exesqlupdate(String sql) {
        MySqlStatementParser parser = new MySqlStatementParser(sql);
        List<SQLStatement> statements = parser.parseStatementList();
        statements.stream().forEach(a->update(a));
        return false;
    }

    private void update(SQLStatement a) {
        SQLhanderAdapter sqLhanderAdapter = null;
        if (a instanceof MySqlCreateTableStatement) {
            sqLhanderAdapter = new CreateTableStatementhander(this);
        }
        sqLhanderAdapter.hander(a);
    }

    @Override
    public List<TableRow> exequery(String sql) {
        return null;
    }
}
