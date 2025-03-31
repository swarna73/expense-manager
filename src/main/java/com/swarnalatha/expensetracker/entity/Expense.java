package com.swarnalatha.expensetracker.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "expenses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private BigDecimal amount;

    private LocalDate date;

    // Each expense belongs to a user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Each expense is categorized
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}