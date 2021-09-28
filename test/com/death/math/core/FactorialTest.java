/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.death.math.core;

import static com.death.math.core.MathUtil.factorial;
import org.junit.Assert;
import org.junit.Test; //JUnit 4


/**
 *
 * @author DELL
 */
public class FactorialTest {
    
    @Test //annotation biến hàm đi kèm thành main
    public void checkFactorialGivenRightReturnRight() {
        long expected = 120; // kỳ vọng kq trả về
        long actual = factorial(5); // kiểm tra thực tế 
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(1, factorial(0));
        
        Assert.assertEquals(6, factorial(3));
        
        Assert.assertEquals(120, factorial(5));
        
        Assert.assertEquals(362880, factorial(9));
        
        
    }
    
    @Test(expected = IllegalArgumentException.class)       
    //Test xem hàm có ném về Exception như ngoại lệ hay k
    //JUnit 4 coi Exception k phải giá trị nên k dùng assertEquals được
    public void checkFactorialGivenWrongThrowsException() {
        factorial(-69);
    }
    
}
