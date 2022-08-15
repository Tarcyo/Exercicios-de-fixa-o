/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios.de.fixação;

import java.util.Scanner;

/**
 *
 * @author Tarcyo
 */
public class Exercicio4 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String nome1, cpf1, email1;
        String nome2, cpf2, email2;
        String nome3, cpf3, email3;

        System.out.print("Digite o nome do usuario 1");
        nome1 = s.nextLine();
        System.out.print("Digite o cpf do usuario 1");
        cpf1 = s.nextLine();
        System.out.print("Digite o email do usuario 1");
        email1 = s.nextLine();

        System.out.print("Digite o nome do usuario 2");
        nome2 = s.nextLine();
        System.out.print("Digite o cpf do usuario 2");
        cpf2 = s.nextLine();
        System.out.print("Digite o email do usuario 2");
        email2 = s.nextLine();

        System.out.print("Digite o nome do usuario 3");
        nome3 = s.nextLine();
        System.out.print("Digite o cpf do usuario 3");
        cpf3 = s.nextLine();
        System.out.print("Digite o email do usuario 3");
        email3 = s.nextLine();

        System.out.print("Digite o cpf a buscar");
        String cpfAbuscar = s.nextLine();

        if (cpfAbuscar.equals(cpf1))
        {
            System.out.print("Dados do usuário\nCpf: " + cpfAbuscar + "\nNome: " + nome1 + "\nEmail:" + email1);
            return;
        }
        if (cpfAbuscar.equals(cpf2))
        {
            System.out.print("Dados do usuário\nCpf: " + cpfAbuscar + "\nNome: " + nome2 + "\nEmail:" + email2);
            return;
        }
        if (cpfAbuscar.equals(cpf3))
        {
            System.out.print("Dados do usuário\nCpf: " + cpfAbuscar + "\nNome: " + nome3 + "\nEmail:" + email3);
            return;
        }

    }
}
