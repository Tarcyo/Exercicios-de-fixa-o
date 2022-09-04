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
public class Triangulo extends FormaDeDuasDimensoes{
    
    private double base,altura,ladoEsquerdo,ladoDireito;
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoEsquerdo() {
        return ladoEsquerdo;
    }

    public void setLadoEsquerdo(double ladoEsquerdo) {
        this.ladoEsquerdo = ladoEsquerdo;
    }

    public double getLadoDireito() {
        return ladoDireito;
    }

    public void setLadoDireito(double ladoDireito) {
        this.ladoDireito = ladoDireito;
    }
    
    public Triangulo( double eixoX, double eixoY,double ladoEsquerdo,double ladoDireito, String nome, double area, double perimetro) {
        
        super(eixoX, eixoY, nome, area, perimetro);
      
        this.base =eixoX;
        this.altura=eixoY;
        this.ladoEsquerdo=ladoEsquerdo;
        this.ladoDireito=ladoDireito;
        this.setNome("Triangulo");
        this.setArea(this.calculaArea(this.base,this.altura));
        this.setPerimetro(this.calculaPerimetro(this.base,this.ladoDireito,this.ladoEsquerdo));
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado 1: " +this.ladoEsquerdo + " lado 2: " +this.ladoDireito+ "lado 3: " +this.base+ " Altura " +this.altura+ " area: "+this.getArea()+" Perimetro: "+this.getPerimetro()+'}';
    }



    
    private double calculaArea(double base,double altura){
        return base *altura;
        
    }
    
    private double calculaPerimetro(double lado1,double lado2, double lado3){
        return lado1+lado2+lado3;
    }
    
    
}