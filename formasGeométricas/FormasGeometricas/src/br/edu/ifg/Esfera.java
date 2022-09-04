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
public class Esfera extends FormaDeTresDimensoes{
    private double raio;
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
   
    public Esfera( double eixoX, double eixoY, double eixoZ, double volume, String nome, double area, double perimetro) {
        super(eixoX, eixoY, eixoZ, volume, nome, area, perimetro);
        this.raio = eixoX;
         if(this.getEixoX()!=this.getEixoY()||this.getEixoY()!=this.getEixoZ()){
            System.out.println("Os eixos devem ser iguais");
            this.setEixoY(eixoX);
            this.setEixoZ(eixoX);
        }
         this.setNome("Esfera");
         this.setVolume(this.calculaVolume(this.getRaio()));
         this.setArea(this.calculaArea(this.getRaio()));
       
         
    }

    @Override
    public String toString() {
        return "Esfera{" + "raio: " + raio+ " Area da superficie: " + this.getArea() + " Volume: " + this.getVolume()+ '}';
    }
    
    private double calculaVolume(double raio){
        return (4*(3.14*raio*raio*raio))/3;
    }
    private double calculaArea(double raio){
        return 4*3.14*raio*raio;
        
    }
   
  
   
    
}
