package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean addExtraCheese;
    private Boolean addExtraToppings;
    private Boolean addedPaperBag;
    private String bill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isVeg = isVeg;
        this.price = (isVeg)?300:400;
        this.addExtraCheese = false;
        this.addExtraToppings = false;
        this.addedPaperBag = false;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!addExtraCheese) {
            this.price += 80;
            this.addExtraCheese = true;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addExtraToppings){
            int value = (isVeg) ? 70 : 120;
            this.price += value;
            this.addExtraToppings = true;
            this.bill += "Extra Toppings Added: "+value+"\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!addedPaperBag){
            this.price += 20;
            this.addedPaperBag = true;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill + "Total Price: "+this.price+"\n";
    }
}
