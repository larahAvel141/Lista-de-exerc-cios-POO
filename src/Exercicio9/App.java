package Exercicio9;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
    /*Faça um programa que receba uma frase qualquer e mostre-a invertida */

    String aux = JOptionPane.showInputDialog("Insira a frase");    
    String resp = "";  
    
    for(int i= (aux.length() -1); i>=0; i--) { 
        resp += aux.charAt(i);
    }     
    JOptionPane.showMessageDialog(null, resp);
    }
}
