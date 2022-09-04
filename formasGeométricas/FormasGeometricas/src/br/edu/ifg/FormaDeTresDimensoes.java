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
public class FormaDeTresDimensoes extends Forma {

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    private double eixoX,eixoY,eixoZ,volume;

    public FormaDeTresDimensoes(double eixoX, double eixoY, double eixoZ, double volume, String nome, double area, double perimetro) {
        super(nome, area, perimetro);
        this.eixoX = eixoX;
        this.eixoY = eixoY;
        this.eixoZ = eixoZ;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "FormaDeTresDimensoes{" + "eixoX=" + eixoX + ", eixoY=" + eixoY + ", eixoZ=" + eixoZ + '}';
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

    public double getEixoZ() {
        return eixoZ;
    }

    public void setEixoZ(double eixoZ) {
        this.eixoZ = eixoZ;
    }
    
    
}
