/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.codideep.main;

import com.codideep.business.PersonBusiness;
import com.codideep.entity.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KAAF0
 */
public class Main {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        
        PersonBusiness personBusiness = new PersonBusiness();
        
        personBusiness.insert(listPerson);
        System.out.println("");
        personBusiness.insert(listPerson);
        
        System.out.println("----------------------------");
        personBusiness.showListPerson(listPerson);
    }
}