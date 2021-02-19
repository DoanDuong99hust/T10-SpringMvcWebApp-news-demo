package com.doanduong.news.service.impl;

import com.doanduong.news.entity.data.Posts;
import com.doanduong.news.service.PostService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
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
