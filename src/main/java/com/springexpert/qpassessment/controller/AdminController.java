package com.springexpert.qpassessment.controller;

import com.springexpert.qpassessment.model.GroceryItem;
import com.springexpert.qpassessment.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/groceries")
public class AdminController {

    @Autowired
    private GroceryService groceryService;

    @PostMapping
    public ResponseEntity<GroceryItem> addGrocery(@RequestBody GroceryItem item) {
        return ResponseEntity.ok(groceryService.addItem(item));
    }

    @GetMapping
    public ResponseEntity<List<GroceryItem>> getAllGroceries() {
        return ResponseEntity.ok(groceryService.getAllItems());
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroceryItem> updateGrocery(@PathVariable Long id, @RequestBody GroceryItem item) {
        return ResponseEntity.ok(groceryService.updateItem(id, item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrocery(@PathVariable Long id) {
        groceryService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
}
