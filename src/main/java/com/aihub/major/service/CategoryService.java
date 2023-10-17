package com.aihub.major.service;

import com.aihub.major.model.Category;
import com.aihub.major.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Category>getAllCategory(){
        return categoryRepository.findAll();
    }
    public void addCategory(Category category)
    {
        categoryRepository.save(category);
    }
    public void removeCategoryById(int id){
        categoryRepository.deleteById(id);
    }
    public Optional<Category> getcategoryById(int id){return categoryRepository.findById(id);}
}