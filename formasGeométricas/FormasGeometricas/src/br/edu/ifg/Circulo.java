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
public class Circulo extends FormaDeDuasDimensoes{
    private double raio;
    public Circulo( double eixoX, double eixoY, String nome, double area, double perimetro) {
        
        super(eixoX, eixoY, nome, area, perimetro);
        if(this.getEixoX()!=this.getEixoY()){
            System.out.print("O eixo x deve ser igual ao y");
            this.setEixoY(eixoX);
        }
        
        this.raio =eixoX;
        this.setNome("Circulo");
        this.setArea(this.calculaArea(this.raio));
        this.setPerimetro(this.calculaPerimetro(this.getRaio()));
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio: " + raio + " area: "+this.getArea()+" Perimetro: "+this.getPerimetro()+'}';
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    
    private double calculaArea(double raio){
        return (raio*raio)*3.14;
        
    }
    
    private double calculaPerimetro(double raio){
        return 2*3.14*raio;
    }
    
    
}
