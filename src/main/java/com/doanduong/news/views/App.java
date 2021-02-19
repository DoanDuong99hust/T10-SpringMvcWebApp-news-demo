package com.doanduong.news.views;

import com.doanduong.news.entity.MyConnection;
import org.springframework.stereotype.Component;

@Component
public class App {
    public static void main(String[] args) {
        MyConnection myConnection = new MyConnection();
        try {
            myConnection.connectDB();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
