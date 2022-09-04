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
public class Cubo extends FormaDeTresDimensoes{
    private double altura, largura,comprimento;
    public Cubo( double eixoX, double eixoY, double eixoZ, double volume, String nome, double area, double perimetro) {
        super(eixoX, eixoY, eixoZ, volume, nome, area, perimetro);
        this.altura = eixoX;
        this.largura =eixoY;
        this.comprimento = eixoZ;
        this.setVolume(this.calculaVolume(this.getAltura(),this.getLargura(),this.getComprimento()));
        this.setArea(this.calculaArea(this.getComprimento()));
        this.setNome("Cubo");
        
    }
    private double calculaArea(double comprimento){
        return 6*comprimento*comprimento;
    }
    private double calculaVolume(double altura,double largura,double comprimento){
        return altura*largura*comprimento;
        
    }

    public String toString() {
        return "Cubo{" + "altura: " + altura+ " largura: " + this.getLargura() + " comprimento: " + this.getComprimento()+ " Area da superficie: " + this.getArea()+ " volume: " + this.getVolume()+ '}';
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
  



   
  
   
    
}

