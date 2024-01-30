package com.BikkatIT.NewProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkatIT.NewProject.Payloads.CategoryDto;
import com.BikkatIT.NewProject.Service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class CategoryController {
@Autowired
	private CategoryService categoryService;

@PostMapping("/")
public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto){
	
	CategoryDto createCategory = this.categoryService.createCategory(categoryDto);
	
	
	return new ResponseEntity<CategoryDto>(createCategory,HttpStatus.CREATED);
	
	
	
	
}
@DeleteMapping("/{categoryId}")
public void  deletecategory(@PathVariable Integer categoryId) {
	
	this.categoryService.deleteCategoryById(categoryId);
	
	 
	
	
	
	
}
	
}
