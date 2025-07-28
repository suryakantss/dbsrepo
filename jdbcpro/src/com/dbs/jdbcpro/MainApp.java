package com.dbs.jdbcpro;

import java.sql.*;

public class MainApp {

    public static void main(String[] args) {
        // select();
       // insert();
       // delete();
       // update();
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

    private static void select() {
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String url="jdbc:mysql://localhost/dbsdb";
        String sql = "select * from products";
        try {
            con = DriverManager.getConnection(url,"root","root");
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next())
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

    private static void insert() {
        Connection con=null;
        PreparedStatement pstmt=null;
        String url="jdbc:mysql://localhost/dbsdb";
        String sql = "insert into products(id,name,price) values(?,?,?)";
        try {
            con = DriverManager.getConnection(url,"root","root");
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"P3");
            pstmt.setString(2,"Pen");
            pstmt.setInt(3,100);

            int n  = pstmt.executeUpdate();
            System.out.println(n + " record(s) inserted...");
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void delete() {
        Connection con=null;
        PreparedStatement pstmt=null;
        String url="jdbc:mysql://localhost/dbsdb";
        String sql = "delete from products where id =?";
        try {
            con = DriverManager.getConnection(url,"root","root");
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"P1");
            int n  = pstmt.executeUpdate();
            System.out.println(n + " record(s) deleted...");
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void update() {
        Connection con=null;
        PreparedStatement pstmt=null;
        String url="jdbc:mysql://localhost/dbsdb";
        String sql = "update products set price=? where id =?";
        try {
            con = DriverManager.getConnection(url,"root","root");
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,500);
            pstmt.setString(2,"P3");
            int n  = pstmt.executeUpdate();
            System.out.println(n + " record(s) updated...");
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
