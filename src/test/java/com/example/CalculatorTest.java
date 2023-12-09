package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
    Calculator calculator = new Calculator();
     int a = 5;
     int b = 10;
    int result = calculator.add(a,b);
        Assert.assertEquals(15,result);
    }

    @Test
    public void testAdd1() {
        Calculator calculator = new Calculator();
        int a = 105;
        int b = 10;
        int result = calculator.add(a,b);
        Assert.assertEquals(15,result);
    }

    @Test
    public void testSubtract () {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 10;
        int result = calculator.subtract(a,b);
        Assert.assertEquals(0,result);
    }

    @Test
    public void testSubtract1 () {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 10;
        int result = calculator.subtract(a,b);
        Assert.assertEquals(0,result);
    }

    @Test
    public void testSubtract2 () {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 10;
        int result = calculator.subtract(a,b);
        Assert.assertEquals(0,result);
    }





}
