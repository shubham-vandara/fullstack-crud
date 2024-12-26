package com.example.frontcrud.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "front_user")
public class FrontUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;
}
