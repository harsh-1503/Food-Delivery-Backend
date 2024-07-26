package com.foodStop.Service;

import com.foodStop.model.Category;
import com.foodStop.model.Food;
import com.foodStop.model.Restaurant;
import com.foodStop.request.CreateFoodRequest;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FoodService {
    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;
    public List<Food> getRestaurantFood(Long restaurantId , boolean isVegetarian, boolean isNonVeg, boolean isSeasonal, String foodCategory);

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws Exception;

    public Food updateAvailabilityStatus(Long foodId) throws Exception;

}
