package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }

    @Override
    public String getBill(){
        // your code goes here
        String s="";
        s +="Base Price Of The Pizza: "+this.price+"\n";
        if(taken)
            s+="Paperbag Added: 20\n";
        s+="Total Price: "+this.bill+"\n";
        return s;
    }
}
