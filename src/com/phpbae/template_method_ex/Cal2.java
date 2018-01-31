package com.phpbae.template_method_ex;

public class Cal2 extends Calculator {
    @Override
    protected void add() {
        System.out.println("Cal2의 add()");
    }

    @Override
    protected void subtraction() {
        System.out.println("Cal2의 subtraction()");
    }
}
