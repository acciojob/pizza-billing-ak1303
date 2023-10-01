package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if (isVeg) {
            this.price=390;
            // Base price for a veg deluxe pizza
        } else {
            this.price =500;
                 // Base price for a non-veg deluxe pizza
        }
        extraCheeseAdded=true;
        extraToppingsAdded=true;
        this.bill=this.price;
    }

}
