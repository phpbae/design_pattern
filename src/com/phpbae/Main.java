package com.phpbae;

import com.phpbae.factory_ex.Factory;
import com.phpbae.factory_ex.FoodFactory;
import com.phpbae.factory_ex.food.Food;
import com.phpbae.factory_ex.product.CellPhone;
import com.phpbae.factory_ex.product.Computer;
import com.phpbae.factory_ex.product.Product;
import com.phpbae.factory_ex.ProductFactory;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();
        CellPhone cellPhone = new CellPhone();

        Factory productFactory = new ProductFactory();
        Product product1 = productFactory.createProduct("컴퓨터");
        Product product2 = productFactory.createProduct("휴대폰");

        System.out.println(product1.getProductName());
        System.out.println(product2.getProductName());


        Product product3 = productFactory.createProduct2("Computer");
        Product product4 = productFactory.createProduct2("CellPhone");

        System.out.println(product3.getProductName());
        System.out.println(product4.getProductName());


        Factory foodFactory = new FoodFactory();
        Food food1 = foodFactory.createFood("라면");
        Food food2 = foodFactory.createFood("피자");

        System.out.println(food1.getFoodName());
        System.out.println(food2.getFoodName());

    }
}
