/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.entity;

/**
 *
 * @author KAAF0
 */
public class Person {
    private String firstName;
    private String surName;
    private String dni;
    private boolean gender;
    
    public Person() {}
    
    public Person(String firstName, String surName, String dni, boolean gender) {
        this.firstName = firstName;
        this.surName = surName;
        this.dni = dni;
        this.gender = gender;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return this.dni;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isGender() {
        return this.gender;
    }
}
