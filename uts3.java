package com.program;

import javax.swing.JOptionPane;
import javax.swing.event.SwingPropertyChangeSupport;

public class uts3 {
    public static void main(String[]args){
        int nilai;
        String a;

        a = JOptionPane.showInputDialog("Masukkan Nilai: ");
        nilai = Integer.parseInt(a);

        if(nilai > 0){
            JOptionPane.showMessageDialog(null, +nilai+ " Merupakan Bilangan Positif");
        }
        else if(nilai > -1 && nilai < 1){
            JOptionPane.showMessageDialog(null, +nilai+ " Merupakan Bilangan Netral");
        }
        else{
            JOptionPane.showMessageDialog(null, +nilai+ " Merupakan Bilangan Negatif");
        }
    }   
}