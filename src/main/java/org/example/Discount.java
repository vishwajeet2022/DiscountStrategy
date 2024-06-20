package org.example;

public class Discount {
    double price;
    DiscountStrategy discountStrategy;

    public void setPrice(double price){
        this.price=price;
    }
    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }
    public double getPriceAfterDiscount(){
        return this.price-discountStrategy.calculateDiscount(this.price);
    }
}
