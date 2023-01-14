/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.course4.operators;

/**
 * 
 * @author via
 * 
 * @date 28 Nov 2022
 */
public class ArithmeticOperators {

    public static void main(String[] args) {

        // Addition
        int num1 = 20, num2 = 10, result;
        result = num1 + num2;
        System.out.println("num1 + num2 = " + result);

        // Subtraction
        double num_1 = 20D, num_2 = 10D, sub_result;
        sub_result = num_1 - num_2;
        System.out.println("num_1 - num_2 = " + sub_result);

        // Multiplication
        float num_01 = 20F, num_02 = 10F, mul_result;
        mul_result = num_01 * num_02;
        System.out.println("num_01 * num_02 = " + mul_result);

        // Division
        long _num1 = 20L, _num2 = 10, div_result;
        div_result = _num1 / _num2;
        System.out.println("_num1 / _num2 = " + div_result);

    }
}
