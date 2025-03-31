package com.swarnalatha.expensetracker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swarnalatha.expensetracker.entity.Category;
import com.swarnalatha.expensetracker.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	
	    @Autowired
	    private CategoryService categoryService;

	    // POST /api/category
	    @PostMapping
	    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
	    	Category savedCategory = categoryService.saveCategory(category);
	        return ResponseEntity.ok(savedCategory);
	    }

	    // GET /api/category
	    @GetMapping
	    public ResponseEntity<List<Category>> getAllCategories() {
	        return ResponseEntity.ok(categoryService.getAllCategories());
	    }

	    // GET /api/category/{id}
	    @GetMapping("/{id}")
	    public ResponseEntity<Category> getCategoryrById(@PathVariable Long id) {
	        Optional<Category> category = categoryService.getCetgoryById(id);
	        return category.map(ResponseEntity::ok)
	                   .orElse(ResponseEntity.notFound().build());
	    }

	    // DELETE /api/category/{id}
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
	    	categoryService.deleteCategory(id);
	        return ResponseEntity.noContent().build();
	    }
	
}
