package com.springexpert.qpassessment.repository;

import com.springexpert.qpassessment.model.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}
