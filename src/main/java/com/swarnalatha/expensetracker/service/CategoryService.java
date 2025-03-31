package com.swarnalatha.expensetracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swarnalatha.expensetracker.entity.Category;
import com.swarnalatha.expensetracker.repository.CategoryRepository;

@Service
public class CategoryService {

	
	 @Autowired
	    private CategoryRepository categoryRepository;

	    // Create or update user
	    public Category saveCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    // Get all users
	    public List<Category> getAllCategories() {
	        return categoryRepository.findAll();
	    }

	    // Get user by ID
	    public Optional<Category> getCetgoryById(Long id) {
	        return categoryRepository.findById(id);
	    }

	    // Delete user by ID
	    public void deleteCategory(Long id) {
	    	categoryRepository.deleteById(id);
	    }

	

}
