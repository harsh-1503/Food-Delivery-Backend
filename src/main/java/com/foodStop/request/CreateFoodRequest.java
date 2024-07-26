package com.foodStop.request;


import com.foodStop.model.Category;
import com.foodStop.model.IngredientsItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {
    private String name;
    private String description;;
    private Long price;

    private Category category;

    private List<String> images;
    private boolean vegetarian;
    private boolean seasonal;
    private List<IngredientsItem> ingredients;
    private Long restaurantId;

}
