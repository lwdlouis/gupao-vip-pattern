package com.gupao.vip.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

public abstract class JdbcTemplate {

    private DataSource dataSource;


    private JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper rowMapper, Object[] values) throws Exception {

        //1. 获取连接
        Connection conn = this.getConnection(dataSource);

        //2.创建语句集


        //3。执行语句集


        //4。处理结果集


        //5。关闭结果集


        //6。关闭语句集


        //7。关闭连接
        this.closeConnection(conn);

        //8。返回结果
        return null;
    }

    protected Connection getConnection(DataSource dataSource) throws Exception {
        return dataSource.getConnection();
    }


    protected void closeConnection(Connection conn) throws Exception {
        //可以被覆盖，
        conn.close();

    }

}
