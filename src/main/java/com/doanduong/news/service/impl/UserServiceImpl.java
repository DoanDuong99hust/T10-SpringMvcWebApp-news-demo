package com.doanduong.news.service.impl;

import com.doanduong.news.entity.data.Users;
import com.doanduong.news.service.UserService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<Users> findAll() throws SQLException {
        return null;
    }

    @Override
    public Users findById(int id) throws SQLException {
        return null;
    }

    @Override
    public Users insert(Users i) throws SQLException {
        return null;
    }

    @Override
    public boolean update(Users users) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }
}
