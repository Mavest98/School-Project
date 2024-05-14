package com.Movies.demo.entity;//package com.Movies.demo.entity;
//
//public class User {
//}

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User(String username, String password, String role) {
    }

    // getters and setters
}
