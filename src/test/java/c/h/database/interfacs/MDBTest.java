/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.interfacs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public class MDBTest {
    @Test
    public void exesqlupdate() throws Exception {

        MDB.getDboperation().exesqlupdate("create table ta(id int)");
    }

    @Test
    public void exequery() throws Exception {

    }

}