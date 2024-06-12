package cn.jbf.food;

import cn.jbf.food.Food;

public class Apple implements Food {

    double price = 8;
    double  weight ;
    double  discount;


    @Override
    public double  Original_Amount(double  price,double  weight) {
        return price*weight;
    }

    @Override
    public double  discount_Amount(double  price,double  weight,double discount) {
        return price*weight*discount;
    }

    public double  getPrice() {
        return price;
    }
}
