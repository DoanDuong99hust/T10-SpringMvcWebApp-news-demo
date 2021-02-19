package com.doanduong.news.service.impl;

import com.doanduong.news.service.CommentService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
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
