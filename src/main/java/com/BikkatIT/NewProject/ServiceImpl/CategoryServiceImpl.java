package com.BikkatIT.NewProject.ServiceImpl;

import java.util.List;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.BikkatIT.NewProject.Payloads.CategoryDto;
import com.BikkatIT.NewProject.Service.CategoryService;
import com.BikkatIT.NewProject.entity.Category;
import com.BikkatIT.NewProject.exceptions.ResourceNotFoundException;
import com.BikkatIT.NewProject.repository.CategoryRepo;


@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {

		Category category = this.modelMapper.map(categoryDto, Category.class);

		Category save = this.categoryRepo.save(category);

		CategoryDto map = modelMapper.map(save, CategoryDto.class);

		return map;
	}

	

	

	@Override
	public void deleteCategoryById(Integer categoryId) {

		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("catogory", "categoryid", categoryId));
		
		this.categoryRepo.delete(category);

	}





	@Override
	public CategoryDto updateCategoryById(CategoryDto categoryDto, Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public CategoryDto getCategoryById(Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public List<CategoryDto> getAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
