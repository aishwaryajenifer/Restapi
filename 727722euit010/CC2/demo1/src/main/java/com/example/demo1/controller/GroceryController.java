package com.example.demo1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.Grocery;
import com.example.demo1.service.GroceryService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class GroceryController {
    @Autowired
    GroceryService groceryService;

    @PostMapping("/grocery")
    public Grocery addGrocery(@RequestBody Grocery grocery)
    {
         return groceryService.addGrocery(grocery);
    }
    @GetMapping("/grocery")
    public List<Grocery> getGrocery()
    {
        return groceryService.getGrocery();
    }
    @GetMapping("/grocery/{id}")
    public Optional<Grocery> f2 (@PathVariable Long id ) {
        return groceryService.f2(id);
    }
    @DeleteMapping("/grocery/{id}")
    public String deleteGrocery(@PathVariable Long id)
    {
        return groceryService.deleteGrocery(id);
    }
    @PutMapping("/grocery/{id}")
    public Grocery editGrocery(@PathVariable Long id, @RequestBody Grocery grocery) {
            
        return groceryService.editGrocery(id,grocery);
    }

}
