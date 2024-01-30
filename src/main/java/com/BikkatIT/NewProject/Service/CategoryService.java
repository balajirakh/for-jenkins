package com.BikkatIT.NewProject.Service;

import java.util.List;

import com.BikkatIT.NewProject.Payloads.CategoryDto;

public interface CategoryService {

	public CategoryDto createCategory(CategoryDto categoryDto);
	
	public CategoryDto updateCategoryById(CategoryDto categoryDto,Integer categoryId);
	
	public CategoryDto getCategoryById(Integer categoryId);
	
	public List<CategoryDto> getAllCategory();
	
	public void deleteCategoryById(Integer categoryId);
	
	
	
}
