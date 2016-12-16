/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.sql;

import c.h.database.interfacs.DBoperation;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public abstract class SQLhanderAdapter implements sqlhander {
   protected DBoperation dBoperation;
    public SQLhanderAdapter(DBoperation dBoperation) {
        this.dBoperation = dBoperation;
    }
}
