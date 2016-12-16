/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.model;

import c.h.database.Constant;
import c.h.jdbm.DB;
import c.h.jdbm.DBMaker;

import java.io.File;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public class Database {
    private String name;
    private String filename;
    private DB jdbm;

    public void close() {
        if (jdbm != null) {
            jdbm.close();

        }
    }
    private static String getfilename(String name) {
        StringBuilder builder = new StringBuilder();
        builder.append(Constant.db_dir + "/");
//        builder.append(name + "/");
        builder.append(name);
        return builder.toString();
    }

    public Database(String name) {
        this.name = name;
        init();
        jdbm = DBMaker.openFile(filename).make();
//        jdbm.createTreeMap("tree");
    }

    public void init() {
        File file = new File(Constant.db_dir + "/" + name);
        if (!file.exists()) {
            file.mkdirs();
        }
        System.out.println(file.getAbsoluteFile());
        StringBuilder builder = new StringBuilder();
        builder.append(Constant.db_dir + "/");
        builder.append(name + "/");
        builder.append(name);
        filename = builder.toString();

    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
