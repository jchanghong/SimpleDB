/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.orientdb;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public interface Log {
    default void info(Object info) {
        System.out.println(info);
    }
}
