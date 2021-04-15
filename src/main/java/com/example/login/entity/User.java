package com.example.login.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Username")
    @NotBlank
    private String username;
    @Column(name = "Password")
    @NotBlank
    private String password;
}
