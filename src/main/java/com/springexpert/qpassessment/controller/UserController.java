package com.springexpert.qpassessment.controller;

import com.springexpert.qpassessment.model.GroceryItem;
import com.springexpert.qpassessment.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groceries")
public class UserController {

    @Autowired
    private GroceryService groceryService;

    @GetMapping
    public ResponseEntity<List<GroceryItem>> getAvailableGroceries() {
        return ResponseEntity.ok(groceryService.getAllItems());
    }
}
