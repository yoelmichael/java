

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PenjualanApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Michael
 */
public class koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null) {
                String url = "jdbc:mysql://localhost:3306/penjualan_rumah";
                String user = "root";
                String password = ""; // Sesuaikan jika ada password
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return conn;
    }
}

