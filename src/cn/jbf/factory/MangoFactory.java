package cn.jbf.factory;

import cn.jbf.food.Food;
import cn.jbf.food.Mango;

public class MangoFactory implements  Factory {
    @Override
    public Food Create() {

        Mango mango = new Mango();
        return mango;
    }
}
