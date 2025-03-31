package com.swarnalatha.expensetracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swarnalatha.expensetracker.entity.Category;

@Repository
	public interface CategoryRepository extends JpaRepository<Category, Long> {
	    // You can add custom queries here if needed
	    // findById(Long id); // Optional: for login/check
	
}
