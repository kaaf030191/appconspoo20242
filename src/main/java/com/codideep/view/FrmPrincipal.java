/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.view;

import java.awt.event.ActionEvent;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author KAAF0
 */
public class FrmPrincipal extends JFrame {

    private JTextField txtNumberOne;
    private JTextField txtNumberTwo;
    private JTextField txtResult;
    private JButton btnProcess;
    private JList lstHistorialOne;
    private JList lstHistorialTwo;
    private DefaultListModel<String> dlmLstHistorial;
    private JButton btnGetDataLstHistorialOne;
    private JLabel lblLstHistorialOne;
    private JButton btnRemoveElementLstHistorialTwo;

    public FrmPrincipal() {
        init();
    }

    private void init() {
        setTitle("Programa principal");
        setSize(465, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

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
        btnProcess.setBounds(340, 10, 100, 30);
        getContentPane().add(btnProcess);

        dlmLstHistorial = new DefaultListModel<>();

        lstHistorialOne = new JList(dlmLstHistorial);
        lstHistorialOne.setBounds(10, 50, 210, 170);
        getContentPane().add(lstHistorialOne);

        lstHistorialTwo = new JList(dlmLstHistorial);
        lstHistorialTwo.setBounds(230, 50, 210, 170);
        getContentPane().add(lstHistorialTwo);

        btnGetDataLstHistorialOne = new JButton();
        btnGetDataLstHistorialOne.setText("Obtener datos");
        btnGetDataLstHistorialOne.setBounds(10, 230, 210, 30);
        getContentPane().add(btnGetDataLstHistorialOne);

        lblLstHistorialOne = new JLabel();
        lblLstHistorialOne.setText("---");
        lblLstHistorialOne.setHorizontalAlignment(SwingConstants.CENTER);
        lblLstHistorialOne.setBounds(10, 270, 210, 30);
        getContentPane().add(lblLstHistorialOne);
        
        btnRemoveElementLstHistorialTwo = new JButton();
        btnRemoveElementLstHistorialTwo.setText("Remover elemento");
        btnRemoveElementLstHistorialTwo.setBounds(230, 230, 210, 30);
        getContentPane().add(btnRemoveElementLstHistorialTwo);

        initEvents();
    }

    private void initEvents() {
        btnProcess.addActionListener((ActionEvent e) -> {
            float numberOne, numberTwo, result;
            
            Pattern pattern = Pattern.compile("^\\-?[0-9]+(\\.[0-9]*)?$");
            
            if(!pattern.matcher(txtNumberOne.getText()).matches() || !pattern.matcher(txtNumberTwo.getText()).matches()) {
                JOptionPane.showMessageDialog(this, "Ingrese datos correctos para la operación suma.");
                
                return;
            }

            numberOne = Float.parseFloat(txtNumberOne.getText());
            numberTwo = Float.parseFloat(txtNumberTwo.getText());

            result = numberOne + numberTwo;

            txtResult.setText(String.valueOf(result));

            dlmLstHistorial.addElement(numberOne + " + " + numberTwo + " = " + result);
        });

        btnGetDataLstHistorialOne.addActionListener((ActionEvent e) -> {
            if (lstHistorialOne.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una opción de la lista 1.");
                
                return;
            }

            String textTemp = lstHistorialOne.getSelectedValue().toString();

            lblLstHistorialOne.setText(textTemp);
        });
        
        btnRemoveElementLstHistorialTwo.addActionListener((ActionEvent e) -> {
            int selectedIndexTemp = lstHistorialTwo.getSelectedIndex();
            
            if (selectedIndexTemp == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una opción de la lista 2.");
                
                return;
            }

            dlmLstHistorial.remove(selectedIndexTemp);
        });
    }
}
