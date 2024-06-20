package org.example;

public class SeniorCitizenDiscountStrategy implements DiscountStrategy{
    @Override
    public Double calculateDiscount(double price) {
        return 0.5*price;
    }
}
