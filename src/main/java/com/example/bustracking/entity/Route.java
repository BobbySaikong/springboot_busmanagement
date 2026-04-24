package com.example.bustracking.entity;

import jakarta.persistence.*;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long route_id;

    private String route_name;
    private String description;

    // getters and setters
}

