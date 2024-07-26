package com.foodStop.Service;

import com.foodStop.model.Category;

import java.util.List;

public interface CategoryService {
    public Category createCategory(String name, Long userid) throws Exception;

    public List<Category> findCategoryByRestaurantId(Long id) throws Exception;

    public Category findByCategoryId(Long id) throws Exception;

}
