package cn.jbf.food;

public interface Food {
    // 价格
    double price =0 ;
    //重量
     double  weight = 0;
    //折扣
    double discount = 1;
    //无折扣
     double  Original_Amount(double  price,double  weight);

     //包含折扣
   double  discount_Amount(double  price,double  weight, double discount);
}
