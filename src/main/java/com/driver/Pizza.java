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

    public String getBill(){
        // your code goes here
        String s="";
        s +="Base Price Of The Pizza: "+this.price+"\n";
        if(extraCheeseAdded){
            s+="Extra Cheese Added: 80\n";
        }
        if(extraToppingsAdded){
            if(isVeg){
                s+="Extra Toppings Added: 70\n";
            }
            else {
                s+="Extra Toppings Added: 120\n";
            }
        }
        if(taken)
            s+="Paperbag Added: 20\n";
        s+="Total Price: "+this.bill+"\n";
        return s;
    }
}
