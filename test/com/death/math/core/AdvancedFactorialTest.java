/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.death.math.core;

import static com.death.math.core.MathUtil.factorial;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
/**
 *
 * @author DELL
 */

// Dùng kỹ thuật Data Driven Testing/ Parameterized Testing => Tách data test và câu lệnh test  
//bộ data có thể để ở file rời, db
@RunWith( value = Parameterized.class)
public class AdvancedFactorialTest {
    
    @Parameters
    public static Object [][] initData() {
        return new Integer[][]{
            {1,1},
            {0,1},
            {3,6},
            {5,120},
            {6,720},
            {7,720*7}
        };
    }
    //End Parameters
    
    @Parameter(value = 0)
    public int n; //to get factorial(n);
    
    @Parameter(value = 1)
    public long expected; //
    
    @Test
    public void checkFactorialGivenRightReturnRight() {              
        assertEquals(expected, factorial(n));            
    }
}
