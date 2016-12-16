/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.interfacs;

import c.h.database.model.Database;
import c.h.database.model.TableRow;

import java.util.List;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public interface TableOperation {
    TableRow findrow(String pkey);

    List<TableRow> findrows(String... keys);

    boolean droprow(String key);

    boolean droprows(String... key);

    boolean insertrow(String key, TableRow row);

    Database getdb();

}
