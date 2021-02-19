package com.doanduong.news.repository.impl;

import com.doanduong.news.entity.data.Posts;
import com.doanduong.news.repository.PostsRepository;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostRepositoryImpl implements PostsRepository {
    @Override
    public Posts getObject(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public List<Posts> getList(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public List<Posts> findAll() throws SQLException {
        return null;
    }

    @Override
    public Posts findById(int id) throws SQLException {
        return null;
    }

    @Override
    public Posts insert(Posts i) throws SQLException {
        return null;
    }

    @Override
    public boolean update(Posts posts) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }
}
