/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.business;

import com.codideep.entity.Person;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author KAAF0
 */
public class PersonBusiness {
    public PersonBusiness() {}
    
    public void insert(List<Person> listPerson) {
        Scanner scanner = new Scanner(System.in);
        
        String firstName, surName, dni;
        boolean gender;
        
        System.out.print("Ingrese el nombre de la persona: ");
        firstName = scanner.nextLine();
        
        System.out.print("Ingrese el apellido de la persona: ");
        surName = scanner.nextLine();
        
        System.out.print("Ingrese el DNI de la persona: ");
        dni = scanner.nextLine();
        
        System.out.print("Ingrese el género de la persona: ");
        gender = scanner.nextLine().equals("M");
        
        Person person = new Person(firstName, surName, dni, gender);
        
        listPerson.add(person);
    }
    
    public void showListPerson(List<Person> listPerson) {
//        for(int i = 0; i < listPerson.size(); i++) {
//            System.out.println("Nombre: " + listPerson.get(i).getFirstName());
//            System.out.println("Apellido: " + listPerson.get(i).getSurName());
//            System.out.println("DNI: " + listPerson.get(i).getDni());
//            
//            /*if(listPerson.get(i).isGender()) {
//                System.out.println("Género: Masculino");
//            } else {
//                System.out.println("Género: Femenino");
//            }*/
//            
//            System.out.println("Género: " + (listPerson.get(i).isGender() ? "Masculino" : "Femenino"));
//            
//            System.out.println("---");
//        }

        for(Person item: listPerson) {
            System.out.println("Nombre: " + item.getFirstName());
            System.out.println("Apellido: " + item.getSurName());
            System.out.println("DNI: " + item.getDni());
            
            System.out.println("Género: " + (item.isGender() ? "Masculino" : "Femenino"));
            
            System.out.println("---");
        }
    }
}
