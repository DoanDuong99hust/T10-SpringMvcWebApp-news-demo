package com.doanduong.news.entity;

import com.doanduong.news.common.AppConfig;

import java.sql.*;

public class MyConnection {
    public static Connection connection = null;
    /**
     * Các bước kết nối đến database
     * B1: kiểm tra driver jdbc đã tồn tại hay chưa bằng hàm driverTest()
     * B2: thực hiện kết nối với db bằng hàm connectDb cần có các tham số đầu vào : url, username, password
     * B3: Dùng prepare() và prepareUpdate() để thực hiện các câu lệnh thao tác với db
     *      Có hai loại lệnh khi thao tác với db:
     *      + prepare : loại 1 là câu lệnh lấy ra bản ghi : select
     *      + prepareUpdate : loại 2 là các câu lệnh thay đổi dữ liệu : insert update
     * B4: Đóng kết nối bằng hàm closeConnection()
     */

    public void driverTest() throws ClassNotFoundException {
        try {
            Class.forName(AppConfig.DRIVER);
        } catch (ClassNotFoundException exception) {
            throw new ClassNotFoundException("JDBC Driver not found !");
        }
    }

    public Connection connectDB() throws ClassNotFoundException, SQLException {
        driverTest();
        try {
            connection = DriverManager.getConnection(AppConfig.URL_DATABASE, AppConfig.USERNAME, AppConfig.PASSWORD);
            if (connection != null) {
                System.out.println("Connection successfully !");
            }
        } catch (SQLException throwables) {
            throw new SQLException("Connection to DB fail !" + throwables.getMessage());
        }
        return connection;
    }

    public PreparedStatement prepare(String sql) {
        System.out.println(">> " + sql);
        try {
            return connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    public PreparedStatement prepareUpdate(String sql) {
        System.out.println(">> " + sql);
        try {
            return connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    public void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            System.out.println("Connection is closed");
        }
    }
}

