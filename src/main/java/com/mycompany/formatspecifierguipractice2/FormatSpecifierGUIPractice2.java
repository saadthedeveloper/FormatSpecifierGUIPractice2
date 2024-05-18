/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formatspecifierguipractice2;
import javax.swing.JOptionPane;
/**
 *
 * This is a practice program to learn how Dialog boxes can work with String.format method directly
 */
public class FormatSpecifierGUIPractice2 {

    public static void main(String[] args) {
         
        double monthlyPay = 5000.0;
        double annualPay = monthlyPay * 12;

        JOptionPane.showMessageDialog(null, String.format("Your annual salary is %,.2f", annualPay));
    }
}
