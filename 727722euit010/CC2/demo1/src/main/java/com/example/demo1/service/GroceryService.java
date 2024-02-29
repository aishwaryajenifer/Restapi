package com.example.demo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.Grocery;
import com.example.demo1.repository.GroceryRepo;

@Service
public class GroceryService {
   @Autowired
   GroceryRepo groceryRepo;

   public Grocery addGrocery(Grocery grocery)
   {
    return groceryRepo.save(grocery);
   }
   public List<Grocery> getGrocery()
   {
    return groceryRepo.findAll();
   }
   public Optional<Grocery> f2(Long id)
   {
    return groceryRepo.findById(id);
   }
   public String deleteGrocery(Long id)
   {
      groceryRepo.deleteById(id);
       return(" Successfully Deleted");
   }
   public Grocery editGrocery(Long id,Grocery grocery)
    {
      Grocery GroceryAvail = groceryRepo.findById(id).orElse(null);
        if(GroceryAvail !=null)
        {    
         GroceryAvail.setCategory(grocery.getCategory());
         GroceryAvail.setProductName(grocery.getProductName());
         GroceryAvail.setQuantity(grocery.getQuantity());
         GroceryAvail.setQuality(grocery.getQuality());
         GroceryAvail.setPrice(grocery.getPrice());
         return groceryRepo.saveAndFlush(GroceryAvail);
        }
        else
        return null;
    }
}

