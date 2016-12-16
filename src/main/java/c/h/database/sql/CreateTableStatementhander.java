/*
 * Copyright (c) 2016.
 * changhong@uestc
 */

package c.h.database.sql;

import c.h.database.interfacs.DBoperation;
import c.h.database.model.TableFiled;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public class CreateTableStatementhander extends SQLhanderAdapter{
    public CreateTableStatementhander(DBoperation dBoperation) {
        super(dBoperation);
    }
    @Override
    public void hander(SQLStatement sqlStatement) {
        MySqlSchemaStatVisitor sqlSchemaStatVisitor = new MySqlSchemaStatVisitor();
        sqlStatement.accept(sqlSchemaStatVisitor);
        String tablename = sqlSchemaStatVisitor.getTables().keySet().toArray()[0].toString();
        List<TableFiled> fileds = new ArrayList<>();
        sqlSchemaStatVisitor.getColumns().stream().forEach(a->{
            TableFiled filed = new TableFiled(a.getName(), a.getDataType());
            fileds.add(filed);
        });
        dBoperation.createtable(tablename, fileds);
    }
}
