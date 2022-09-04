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
public class Quadrado extends FormaDeDuasDimensoes{
    private double lado;
    public Quadrado( double eixoX, double eixoY, String nome, double area, double perimetro) {
        
        super(eixoX, eixoY, nome, area, perimetro);
        if(this.getEixoX()!=this.getEixoY()){
            System.out.print("O eixo x deve ser igual ao y");
            this.setEixoY(eixoX);
        }
        
        this.lado =eixoX;
        this.setNome("Quadrado");
        this.setArea(this.calculaArea(this.lado));
        this.setPerimetro(this.calculaPerimetro(this.getLado()));
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado: " + lado + " area: "+this.getArea()+" perimetro: "+this.getPerimetro()+'}';
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    
    private double calculaArea(double lado){
        return lado*lado ;
        
    }
    
    private double calculaPerimetro(double raio){
        return 4*lado;
    }
    
    
}