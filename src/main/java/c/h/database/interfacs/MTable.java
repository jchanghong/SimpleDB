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
public class MTable implements TableOperation {
    public MTable() {
    }

    @Override
    public TableRow findrow(Table table, String pkey) {
        return null;
    }

    @Override
    public List<TableRow> findrows(Table table, String... keys) {
        return null;
    }

    @Override
    public boolean droprow(Table table, String key) {
        return false;
    }

    @Override
    public boolean droprows(Table table, String... key) {
        return false;
    }

    @Override
    public boolean insertrow(Table table, String key, TableRow row) {
        return false;
    }

    @Override
    public Database getdb() {
        return null;
    }
}
