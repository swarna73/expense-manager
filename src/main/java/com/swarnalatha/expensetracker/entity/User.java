package com.swarnalatha.expensetracker.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data // Lombok annotation - includes getters, setters, toString, equals, hashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;
}
