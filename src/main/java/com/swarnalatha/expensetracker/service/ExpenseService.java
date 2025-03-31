package com.swarnalatha.expensetracker.service;


import com.swarnalatha.expensetracker.entity.Expense;
import com.swarnalatha.expensetracker.entity.User;
import com.swarnalatha.expensetracker.repository.ExpenseRepository;
import com.swarnalatha.expensetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private UserRepository userRepository;

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getExpensesByUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.map(expenseRepository::findByUser).orElse(List.of());
    }

    public List<Expense> getExpensesByUserAndDateRange(Long userId, LocalDate from, LocalDate to) {
        Optional<User> user = userRepository.findById(userId);
        return user.map(u -> expenseRepository.findByUserAndDateBetween(u, from, to)).orElse(List.of());
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}