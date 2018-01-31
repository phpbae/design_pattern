package com.phpbae.template_method_ex;

public class Cal1 extends Calculator {
    @Override
    protected void add() {
        System.out.println("Cal1의 add()");
    }

    @Override
    protected void subtraction() {
        System.out.println("Cal1의 subtraction()");
    }
}
