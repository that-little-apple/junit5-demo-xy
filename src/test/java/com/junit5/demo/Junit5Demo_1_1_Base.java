package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

public class Junit5Demo_1_1_Base {
    @Test
    public void addTest(){
        int result = Calculator.add(4,2);
        System.out.println(result);
    }
    @Test
    public void subTractTest(){
        int result = Calculator.subtract(4,2);
        System.out.println(result);
    }
    @Test
    public void multiplyTest(){
        int result = Calculator.multiply(4,2);
        System.out.println(result);
    }
    @Test
    public void divideTest(){
        int result = Calculator.divide(4,2);
        System.out.println(result);
    }
    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
    }
}