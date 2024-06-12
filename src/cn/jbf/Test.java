package cn.jbf;


import cn.jbf.food.Apple;
import cn.jbf.food.Mango;
import cn.jbf.food.Orge;

public class Test {

   private static Apple apple  = new Apple();
   private static Orge orge  = new Orge();
   private  static Mango mango = new Mango();

    public static void main(String[] args) {

        double  sum = discount(1, 1, 1, "草莓", 0.8);
        double price = price(1, 1, 1);

    }

/*
appleWeight apple重量
str 打折商品
discount 折扣
 */
    private static double  discount(double appleWeight,
                                    double  orgeWeight,
                                    double  mangoWeight,
                                    String str,
                                    double discount){

        if (appleWeight<0 ||orgeWeight<0  || mangoWeight<0){
            return 0;

        }

        //折扣金额
        double  Z_applePrice =0;
        double  Z_orgePrice = 0;
        double  Z_mangoPrice =0;

        if (str == "苹果" ){
            Z_applePrice = apple.discount_Amount(apple.getPrice(),appleWeight,discount);
            return  Z_applePrice
                    + orge.Original_Amount(orge.getPrice(),appleWeight)
                    + mango.Original_Amount(mango.getPrice(),appleWeight);
        }
        if (str == "草莓" ){
            Z_orgePrice = orge.discount_Amount(orge.getPrice(),appleWeight,discount);
            return  Z_orgePrice
                    + apple.Original_Amount(apple.getPrice(),appleWeight)
                    + mango.Original_Amount(mango.getPrice(),appleWeight);
        }
        if (str == "芒果" ){
            Z_mangoPrice= mango.discount_Amount(mango.getPrice(),appleWeight,discount);
            return Z_mangoPrice
                    + apple.Original_Amount(apple.getPrice(),appleWeight)
                    + orge.Original_Amount(orge.getPrice(),appleWeight);
        }else {
            return apple.Original_Amount(apple.getPrice(),appleWeight)
                    + orge.Original_Amount(orge.getPrice(),appleWeight)
                    +  mango.Original_Amount(mango.getPrice(),appleWeight);
        }

    }
    /*
   原价商品
     */
    private static double  price(double appleWeight,
                                 double  orgeWeight,
                                 double  mangoWeight){

        if (appleWeight<0 ||orgeWeight<0  || mangoWeight<0){
            return 0;

        }

        return     orge.Original_Amount(orge.getPrice(),appleWeight)
                +  mango.Original_Amount(mango.getPrice(),appleWeight)
                +  apple.Original_Amount(apple.getPrice(),appleWeight);

    }

   /*
   满减
    */
    private static double  manprice(double appleWeight,
                                 double  orgeWeight,
                                 double  mangoWeight){

        if (appleWeight<0 ||orgeWeight<0  || mangoWeight<0){
            return 0;

        }

        double sum =     orge.Original_Amount(orge.getPrice(),appleWeight)
                +  mango.Original_Amount(mango.getPrice(),appleWeight)
                +  apple.Original_Amount(apple.getPrice(),appleWeight);

        if (sum >= 100){
            return sum -10;
        }
        return sum;


    }



}
