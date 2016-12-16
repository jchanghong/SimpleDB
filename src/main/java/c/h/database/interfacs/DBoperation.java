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
public interface DBoperation {
    Database createDB(String dbname);

    boolean dropdb(String dbname);

    Database get(String dbname);

    List<Database> listall();

    boolean dropall();

    //table
    List<Table> listtables();

    Table findtable(String tablename);

    Table createtable(String tablename);

    boolean droptable(String tablename);

}
