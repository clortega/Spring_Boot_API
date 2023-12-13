package com.example.demo.Repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.Model.Restaurant;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
    @Query("{borough: '?0'}")
    List<Restaurant> FindByBorough(String Borough);
    

}
