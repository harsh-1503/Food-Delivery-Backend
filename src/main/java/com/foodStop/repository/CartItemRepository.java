package com.foodStop.repository;

import com.foodStop.model.Cart;
import com.foodStop.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {

}
