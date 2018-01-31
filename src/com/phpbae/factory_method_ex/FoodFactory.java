package com.phpbae.factory_method_ex;

import com.phpbae.factory_method_ex.food.Food;
import com.phpbae.factory_method_ex.food.Pizza;
import com.phpbae.factory_method_ex.food.Ramen;
import com.phpbae.factory_method_ex.product.Product;

public class FoodFactory extends Factory {
    @Override
    public Product createProduct(String name) {
        return null;
    }

    @Override
    public Product createProduct2(String name) {
        return null;
    }

    @Override
    public Food createFood(String name) {
        switch (name) {
            case "피자":
                return new Pizza();

            case "라면":
                return new Ramen();

            default:
                return null;
        }
    }

    @Override
    public Food createFood2(String name) {
        final String PACKAGE_PATH = "com.phpbae.factory_method_ex.food.";

        try {
            return (Food) Class.forName(PACKAGE_PATH + name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
