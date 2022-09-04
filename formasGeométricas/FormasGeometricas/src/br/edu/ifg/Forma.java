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
public  class Forma {

    @Override
    public String toString() {
        return "Forma{" + "nome=" + nome + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    private String nome;
    private double area;
    private double perimetro;
    
    public Forma(String nome, double area, double perimetro) {
        this.nome = nome;
        this.area = area;
        this.perimetro = perimetro;
    }

  
    public double calculaArea(){
        return this.area;
    }
    
    public double calculaPerimetro(){
        return this.perimetro;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
   
    
    
            
    
}
