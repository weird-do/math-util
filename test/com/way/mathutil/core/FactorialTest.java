/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.way.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
/**
 *
 * @author FPT SHOP
 */
public class FactorialTest {
    
    @Test   // biến 1 hàm đi kèm cái Annotation này thành hàm main()
    public void checkFactorialGivenRightArgumentReturnWell(){
        long expected = 120; //tui kì vọng 120 trả về
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);
    }
    
}
