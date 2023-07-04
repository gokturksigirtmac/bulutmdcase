package com.example.demo.retail;

import jakarta.persistence.*;

@Entity
@Table(name = "retailApplication")
public class ApplicationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
}
