package com.phpbae.factory_method_ex;

import com.phpbae.factory_method_ex.food.Food;
import com.phpbae.factory_method_ex.product.CellPhone;
import com.phpbae.factory_method_ex.product.Computer;
import com.phpbae.factory_method_ex.product.Product;

public class ProductFactory extends Factory {

    @Override
    public Product createProduct(String name) {

        switch (name) {
            case "컴퓨터":
                return new Computer();

            case "휴대폰":
                return new CellPhone();

            default:
                return null;
        }

    }

    @Override
    public Product createProduct2(String name) {
        final String PACKAGE_PATH = "com.phpbae.factory_method_ex.product.";

        try {
            return (Product) Class.forName(PACKAGE_PATH + name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;

    }

    @Override
    public Food createFood(String name) {
        return null;
    }

    @Override
    public Food createFood2(String name) {
        return null;
    }
}
