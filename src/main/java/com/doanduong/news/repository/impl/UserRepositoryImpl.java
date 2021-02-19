package com.doanduong.news.repository.impl;

import com.doanduong.news.entity.data.Users;
import com.doanduong.news.repository.UsersRepository;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UsersRepository {
    @Override
    public Users getObject(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public List<Users> getList(ResultSet resultSet) throws SQLException {
        return null;
    }

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
