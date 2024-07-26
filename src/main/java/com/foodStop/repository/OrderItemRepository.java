package com.foodStop.repository;

import com.foodStop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<Item,Long> {

}
