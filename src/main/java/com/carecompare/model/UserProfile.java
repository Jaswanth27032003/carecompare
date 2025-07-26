package com.carecompare.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_profile")
@Data
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Default constructor (required by JPA)
    public UserProfile() {}
}