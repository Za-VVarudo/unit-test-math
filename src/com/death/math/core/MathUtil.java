/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.death.math.core;

/**
 *
 * @author DELL
 */
public class MathUtil {

    public static long factorial (int n) {
        if (n <0 || n >20)  
            throw new IllegalArgumentException("n must be in [0,20]");
        else {
            if (n == 0 || n == 1) 
                return 1;        
            else
                return n*factorial(n-1);
        }
    }
}
