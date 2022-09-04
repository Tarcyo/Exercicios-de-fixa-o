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
public class Tetraedro extends FormaDeTresDimensoes{
    private double altura, largura,comprimento,aresta;

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    public Tetraedro(double aresta,double eixoX, double eixoY, double eixoZ, double volume, String nome, double area, double perimetro) {
        super(eixoX, eixoY, eixoZ, volume, nome, area, perimetro);
        this.altura = eixoX;
        this.largura =eixoY;
        this.comprimento = eixoZ;
        this.aresta=aresta;
        this.setVolume(aresta);
        this.setArea(this.calculaArea(this.getComprimento()));
        
    }
    private double calculaArea(double aresta){
        return aresta*aresta*1.73205;
    }
    private double calculaVolume(double aresta){
        return (aresta*aresta*aresta*1.41421)/12;
        
    }

    public String toString() {
        return "Tetraedro{" + " aresta: " + altura+ " altura: " + altura+ " largura: " + this.getLargura() + " comprimento: " + this.getComprimento()+ " Area da superficie:: " + this.getArea()+ " volume: " + this.getVolume()+ '}';
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

