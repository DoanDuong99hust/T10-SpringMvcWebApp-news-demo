package com.doanduong.news.entity.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "comments")
@Data
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "commentable_id", nullable = false)
    private String commentableId;

    @Column(name = "commentable_type", nullable = false)
    private String commentableType;

    @Column(name = "commented_id", nullable = false)
    private String commentedId;

    @Column(name = "commented_type", nullable = false)
    private String commentedType;

    @Column(name = "comment")
    private String comment;

    @Column(name = "parent_id", nullable = false)
    private Integer parentId;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

}
