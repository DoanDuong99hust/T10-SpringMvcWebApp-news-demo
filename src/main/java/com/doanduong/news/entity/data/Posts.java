package com.doanduong.news.entity.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "posts")
@Data
public class Posts implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "content")
    private String content;

    @Column(name = "status")
    private String status;

    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "author_type")
    private String authorType;

    @Column(name = "images")
    private String images;

    @Column(name = "format_type")
    private String formatType;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

}
