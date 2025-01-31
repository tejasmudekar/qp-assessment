package com.springexpert.qpassessment.service;

import com.springexpert.qpassessment.model.GroceryItem;
import com.springexpert.qpassessment.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryService {

    @Autowired
    private GroceryItemRepository repository;

    public List<GroceryItem> getAllItems() {
        return repository.findAll();
    }

    public GroceryItem addItem(GroceryItem item) {
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        repository.deleteById(id);
    }

    public GroceryItem updateItem(Long id, GroceryItem item) {
        item.setId(id);
        return repository.save(item);
    }
}
