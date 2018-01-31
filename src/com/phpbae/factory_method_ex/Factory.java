package com.phpbae.factory_method_ex;

import com.phpbae.factory_method_ex.food.Food;
import com.phpbae.factory_method_ex.product.Product;

public abstract class Factory {

    abstract public Product createProduct(String name);

    abstract public Product createProduct2(String name);

    abstract public Food createFood(String name);

    abstract public Food createFood2(String name);
}
