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
public class FormaDeDuasDimensoes extends Forma {
    private double eixoX, eixoY;
    public FormaDeDuasDimensoes(double eixoX, double eixoY, String nome, double area, double perimetro) {
        super(nome, area, perimetro);
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }
   
    

    @Override
    public String toString() {
        return "FormaDeDuasDimensoes{" + "eixoX=" + eixoX + ", eixoY=" + eixoY + '}';
    }
    
    public double getEixoX() {
        return eixoX;
    }

    public void setEixoX(double eixoX) {
        this.eixoX = eixoX;
    }

    public double getEixoY() {
        return eixoY;
    }

    public void setEixoY(double eixoY) {
        this.eixoY = eixoY;
    }
      
  
    
   
    
}
