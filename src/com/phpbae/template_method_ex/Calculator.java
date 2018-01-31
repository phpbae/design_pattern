package com.phpbae.template_method_ex;

public abstract class Calculator {

    public void execute(){
        add();
        subtraction();
    }

    abstract protected void add();
    abstract protected void subtraction();

}
