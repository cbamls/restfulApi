package com.idoc.common.utils;
import java.sql.*;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-parent
 * Comments:
 * Author:cbam
 * Create Date:2016/11/27
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */



public class DbUtil {
    public static final String url = "jdbc:mysql://139.129.24.100:3306/autoAC?useUnicode=true&characterEncoding=utf8";
    public static final String name = "acm";
    public static final String password = "123456";
    private static Connection conn = null;
    private static DbUtil dbUtil = null;
    private static PreparedStatement ps = null;
    public static DbUtil getInitJDBCUtil() {
        if (dbUtil == null) {
            synchronized (DbUtil.class) {
                if (dbUtil == null) {
                    dbUtil = new DbUtil();
                }
            }
        }
        return dbUtil;
    }
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");// 推荐使用方式
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获得连接
    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection(url,name,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }

    // 关闭连接
    public void closeConnection(ResultSet rs, Statement statement, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void insert(String sql) {
        conn = this.getInitJDBCUtil().getConnection();
        try {
            ps=conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ResultSet select(String sql) {
        ResultSet rs = null;
        conn = this.getInitJDBCUtil().getConnection();
        try {
            ps=conn.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    public static void main(String[] args) {
       Object object = new DbUtil().getInitJDBCUtil().getConnection();
        if(object == null) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        //new DbUtil().dfs(0);
    }
    private static int cock, hen, chicken;
    public void dfs(int k) {
        if(cock < 0 || hen < 0 || chicken < 0) {
            return ;
        }
        if(k == 0) {
            if(cock++ * 5 + hen * 3 + chicken > 100) {
                cock -= 2;
                return ;
            }
            //cock++;
        } else if(k == 1) {
            if(cock * 5 + hen++ * 3 + chicken > 100) {
                hen -= 2;
                return ;
            }
            //hen--;
        } else {
            if(cock * 5 + hen * 3 + chicken++ > 100) {
                chicken -= 2;
                return ;
            }
            //chicken++;
        }
        if(cock * 5 + hen * 3 + chicken == 100) {
            System.out.println("cock => " + cock + " hen => " + hen + " chicken => " + chicken);
        }
        for(int i = 0; i < 3; i++) {
            dfs(i);
        }
    }

}
