package cn.jbf.factory;

import cn.jbf.food.Apple;
import cn.jbf.food.Food;

public class AppleFactory implements Factory{
    @Override
    public Food Create() {
        Apple apple = new Apple();
        return apple;
    }
}
