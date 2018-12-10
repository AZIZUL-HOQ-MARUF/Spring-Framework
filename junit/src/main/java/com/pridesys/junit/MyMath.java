/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pridesys.junit;

/**
 *
 * @author Maruf
 */
public class MyMath {
    public int sum (int numbers []){
        int sum =0;
        for (int number : numbers) {
            sum += number;
            
        }
        return sum;
    }

     
}
