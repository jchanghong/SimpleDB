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
public class MTable implements TableOperation {
    public MTable() {
    }
    public TableRow findrow(String pkey) {
        return null;
    }

    public List<TableRow> findrows(String... keys) {
        return null;
    }

    public boolean droprow(String key) {
        return false;
    }

    public boolean droprows(String... key) {
        return false;
    }

    public boolean insertrow(String key, TableRow row) {
        return false;
    }

    public Database getdb() {
        return null;
    }
}
