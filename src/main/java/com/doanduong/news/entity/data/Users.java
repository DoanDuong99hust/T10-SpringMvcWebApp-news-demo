package com.doanduong.news.entity.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "username")
    private String username;

    @Column(name = "address")
    private String address;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

}
