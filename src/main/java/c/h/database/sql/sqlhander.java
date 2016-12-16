/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.sql;

import com.alibaba.druid.sql.ast.SQLStatement;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public interface sqlhander {
    void hander(SQLStatement sqlStatement);
}
