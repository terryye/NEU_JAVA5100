package edu.neu.mgen.HW13;

import java.sql.*;

/**
 * Connect to the database from your Java program and read anyone record from
 * it,
 * Modify the record in the Java program.
 * Update the appropriate record in the database.
 * Make sure you restore (rollback) the previous information in the database to
 * continue your database class assignments
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // connect to mysql
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://briefly.terryye.com:3306/briefly", "briefly",
                    "briefly123");

            ResultSet rs = execQuery(con, "SELECT id,title,pub_date,view_count FROM articles where id = 2");
            print(rs);

            execUpdate(con,
                    "UPDATE articles SET title = 'hello',pub_date='2024-11-25',view_count=view_count+1 WHERE id = 2");
            ResultSet rs2 = execQuery(con, "SELECT id,title,pub_date,view_count FROM articles where id = 2");
            print(rs2);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static ResultSet execQuery(Connection con, String sql) {
        ResultSet rs2 = null;
        try {
            Statement stmt3 = con.createStatement();
            rs2 = stmt3.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs2;
    }

    private static int execUpdate(Connection con, String sql) {
        int ret = 0;
        try {
            Statement stmt3 = con.createStatement();
            ret = stmt3.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ret;
    }

    private static void print(ResultSet rs) {
        try {
            while (rs.next()) {
                System.out.println(rs.getInt(1) +
                        " " + rs.getString(2) +
                        " " + rs.getString(3) +
                        " " + rs.getString(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
