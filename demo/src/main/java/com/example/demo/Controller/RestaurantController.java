package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//localhost:8080/api/restaurants

import com.example.demo.Model.Restaurant;
import com.example.demo.Repository.RestaurantRepository;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;  //new RestaurantRepository...we usually have to add this. But not for Spring boot.

    @GetMapping("/{borough}")
    public ResponseEntity<List<Restaurant>> FindRestaurantByBorough(@PathVariable(value = "borough") String borough){
        List<Restaurant> restaurants = restaurantRepository.FindByBorough(borough);

        if(restaurants != null) {
            return ResponseEntity.ok(restaurants);
        }else {
            return ResponseEntity.notFound().build();
        }
        

    }

}
