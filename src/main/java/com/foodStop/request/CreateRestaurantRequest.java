package com.foodStop.request;


import com.foodStop.model.Address;
import com.foodStop.model.ContactInformation;
import lombok.Data;

import java.util.List;

@Data

public class CreateRestaurantRequest {
//    private Long id;
    private String name;
    private String description;
    private String cuisineType;
    private Address address;
    private ContactInformation contactInformation;
    private String openingHours;
    private List<String> images;
}
