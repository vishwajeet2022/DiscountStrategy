package org.example;

public class WomenDiscountStrategy implements DiscountStrategy{
    @Override
    public Double calculateDiscount(double price) {
        return 1*price;
    }
}
