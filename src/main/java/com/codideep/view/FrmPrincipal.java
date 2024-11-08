/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.view;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author KAAF0
 */
public class FrmPrincipal extends JFrame {
    
    private JTextField txtNumberOne;
    private JTextField txtNumberTwo;
    private JTextField txtResult;
    private JButton btnProcess;
    
    public FrmPrincipal() {
        init();
    }
    
    private void init() {
        setTitle("Programa principal");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        txtNumberOne = new JTextField();
        
        txtNumberOne.setBounds(10, 10, 100, 30);
        
        getContentPane().add(txtNumberOne);
        
        txtNumberTwo = new JTextField();
        
        txtNumberTwo.setBounds(120, 10, 100, 30);
        
        getContentPane().add(txtNumberTwo);
        
        txtResult = new JTextField();
        
        txtResult.setBounds(230, 10, 100, 30);
        txtResult.setEditable(false);
        
        getContentPane().add(txtResult);
        
        btnProcess = new JButton();
        
        btnProcess.setText("Calcular");
        btnProcess.setBounds(400, 10, 100, 30);
        
        getContentPane().add(btnProcess);
        
        initEvents();
    }
    
    private void initEvents() {
        btnProcess.addActionListener((ActionEvent e) -> {
            int numberOne, numberTwo, result;
            
            numberOne = Integer.parseInt(txtNumberOne.getText());
            numberTwo = Integer.parseInt(txtNumberTwo.getText());
            
            result = numberOne + numberTwo;
            
            txtResult.setText(String.valueOf(result));
        });
    }
}
