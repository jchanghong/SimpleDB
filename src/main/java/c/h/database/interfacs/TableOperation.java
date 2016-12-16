/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.interfacs;

import c.h.database.model.Database;
import c.h.database.model.Table;
import c.h.database.model.TableRow;

import java.util.List;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public interface TableOperation {
    TableRow findrow(Table table, String pkey);

    List<TableRow> findrows(Table table,String... keys);

    boolean droprow(Table table,String key);

    boolean droprows(Table table,String... key);

    boolean insertrow(Table table,String key, TableRow row);

    Database getdb();

}
