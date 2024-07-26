package com.foodStop.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.foodStop.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String full_name;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;


    private USER_ROLE role;

    @JsonIgnore  //So that whenever we fetch the user data the order list is not always required
    @OneToMany (cascade = CascadeType.ALL,mappedBy = "customer")  //One user can make many orders

    //By providing mappedBy = "customer " we tell spring boot that don't create a separate table for this mapping and rather use order table for mapping
    private List<Order> orders= new ArrayList<>();

    @ElementCollection
    private List<RestaurantDto>favourites = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    //Whenever we delete this user all the addresses related to this user should be deleted
    private List<Address> addresses = new ArrayList<>();
}
