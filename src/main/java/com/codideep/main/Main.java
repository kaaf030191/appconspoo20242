/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.codideep.main;

import com.codideep.business.Operation;

/**
 *
 * @author KAAF0
 */
public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();
        
        float result = operation.sum(7, 5);
        
        System.out.println("El resultado de la suma es: " + result);
    }
}