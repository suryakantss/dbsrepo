package com.dbs.jdbcpromaven;

import java.sql.*;

public class JDBCApp {
    public static void main(String[] args) {
    findbyid();

    }
    private static void findbyid() {
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String url="jdbc:mysql://localhost/dbsdb";
        String sql = "select * from products where id=?";
        try {
            con = DriverManager.getConnection(url,"root","root");
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"P3");
            rs = pstmt.executeQuery();
            if (rs.next())
            {
                System.out.println(rs.getString("id") + ", " + rs.getString("name") + ", " + rs.getInt("price"));
            }

            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
