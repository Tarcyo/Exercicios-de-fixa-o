/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

/**
 *
 * @author Tarcyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo circulo;
       Cubo cubo;
       Esfera esfera;
       Quadrado quadrado;
       Tetraedro tetraedro;
       Triangulo triangulo;
       circulo=new Circulo(25,25,null,0,0);
       System.out.println(circulo);
       cubo=new Cubo(10,10,10,0,null,0,0);
       System.out.println(cubo);
       esfera=new Esfera(10, 20, 30, 0, null, 0, 0);
       System.out.println(esfera);
       quadrado= new Quadrado(10, 10, null, 0, 0);
       System.out.println(quadrado);
       tetraedro=new Tetraedro(10, 20, 30, 40, 0, null, 0, 0);
       System.out.println(tetraedro);
       triangulo=new Triangulo(10, 20, 30,40, null, 0, 0);
       System.out.print(triangulo);
       
       
       
    }
    
}
