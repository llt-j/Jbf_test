package cn.jbf.factory;

import cn.jbf.food.Food;
import cn.jbf.food.Orge;

public class OrgeFactory implements  Factory{
    @Override
    public Food Create() {

        Orge orge = new Orge();
        return orge;
    }
}
