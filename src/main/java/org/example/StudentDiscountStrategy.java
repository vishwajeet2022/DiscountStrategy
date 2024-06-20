package org.example;

public class StudentDiscountStrategy implements DiscountStrategy{
    @Override
    public Double calculateDiscount(double price) {
        return 0.3*price;
    }
}
