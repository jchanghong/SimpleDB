/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.interfacs;

import c.h.database.model.Database;
import c.h.database.model.Table;

import java.util.List;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public class MDB implements DBoperation {
    static MDB mdb;
    static MTable mTable;
    public static DBoperation getDboperation() {
        if (mdb == null) {
            mdb = new MDB();
        }
        return mdb;
    }

    public MDB() {
    }
    public static TableOperation gettableoperation() {
        if (mTable == null) {
            mTable = new MTable();
        }
        return mTable;
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

    public Table createtable(String tablename) {
        return null;
    }

    public boolean droptable(String tablename) {
        return false;
    }
}
