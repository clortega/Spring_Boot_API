package com.example.demo.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("restaurants")
public class Restaurant {
    @Id
    public String Id;
    public String Borough;
    public String Cuisine;
    public String Name;
    
    public Restaurant(String Id, String Borough, String Cuisine, String Name) {
        super();
        this.Id = Id;
        this.Borough = Borough;
        this.Cuisine = Cuisine;
        this.Name = Name;

    }
}
