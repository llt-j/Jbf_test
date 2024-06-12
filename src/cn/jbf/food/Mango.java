package cn.jbf.food;


public class Mango implements  Food {

    double  price = 20;
    double  weight ;
    double  discount;


    @Override
    public double Original_Amount(double price,double weight) {
        return price*weight;
    }

    @Override
    public double  discount_Amount(double  price,double  weight,double discount) {
        return  price*weight*discount;
    }

    public double getPrice() {
        return  price;
    }
}
