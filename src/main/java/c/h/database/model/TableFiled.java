/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.model;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public class TableFiled {
    private boolean pkey;
    private String name;
    private String types;

    public TableFiled(String name, String types) {
        this.name = name;
        this.types = types;
    }

    public boolean isPkey() {
        return pkey;
    }

    public void setPkey(boolean pkey) {
        this.pkey = pkey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }
}
