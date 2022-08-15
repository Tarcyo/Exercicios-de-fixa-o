/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios.de.fixação;

import javax.swing.JOptionPane;

/**
 *
 * @author Tarcyo
 */
public class exercicio2 {
    public static void main(String[] args) {
        String s;
        s=JOptionPane.showInputDialog(null, "Digite  valor da base menor");
        int baseMenor= Integer.parseInt(s);
        s=JOptionPane.showInputDialog(null, "Digite  valor da base maior ");
        int baseMaior= Integer.parseInt(s);
        s=JOptionPane.showInputDialog(null, "Digite  valor da altura");
        int altura= Integer.parseInt(s);
        double area= (double)((baseMaior+baseMenor)/2)*altura;
        JOptionPane.showMessageDialog(null, "A area é: "+area);
    }
}
