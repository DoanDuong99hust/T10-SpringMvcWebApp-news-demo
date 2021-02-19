package com.doanduong.news.repository.impl;

import com.doanduong.news.service.CommentService;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class CommentRepositoryImpl implements CommentService {
    @Override
    public List findAll() throws SQLException {
        return null;
    }

    @Override
    public Object findById(int id) throws SQLException {
        return null;
    }

    @Override
    public Object insert(Object i) throws SQLException {
        return null;
    }

    @Override
    public boolean update(Object o) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }
}
