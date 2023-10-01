package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int bill;

    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean taken = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price = 300;
        else this.price =400;
        this.extraCheeseAdded=false;
        this.extraToppingsAdded = false;
        this.bill=this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded){
            this.bill += 80;
            extraCheeseAdded =true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded){
            if(isVeg){
                this.bill+=70;
            }
            else {
                this.bill += 120;
            }
            extraToppingsAdded = true;
        }

    }

    public final void addTakeaway(){
        // your code goes here
        if(!taken){
            this.bill+=20;
            taken = true;
        }

    }

    public int getBill(){
        // your code goes here
        System.out.println("Base Price Of The Pizza: "+this.price);
        if(extraCheeseAdded){
            System.out.println("Extra Cheese Added: 80");
        }
        if(extraToppingsAdded){
            if(isVeg){
                System.out.println("Extra Toppings Added: 70");
            }
            else {
                System.out.println("Extra Toppings Added: 120");
            }
        }
        if(taken)
            System.out.println("Paperbag Added: 20");
        System.out.println("Total Price: "+this.bill);
        return this.bill;
    }
}
