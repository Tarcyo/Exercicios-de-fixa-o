/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jornal.desportivo;

import java.util.ArrayList;

/**
 *
 * @author Tarcyo
 */
public class Equipe implements IntEquipe{

    
    
    private int NumeroRodada;
    private String nome;
    private ArrayList <Jogador> jogadores = new  ArrayList<Jogador>();
    private int codEquipe;
    private Tecnico tecnico;
    private int golsNoJogo=0;
    private String status;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
  
    public int getNumeroRodada() {
        return NumeroRodada;
    }

    public void setNumeroRodada(int NumeroRodada) {
        this.NumeroRodada = NumeroRodada;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    
    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public int getCodEquipe() {
        return codEquipe;
    }

    public void setCodEquipe(int codEquipe) {
        this.codEquipe = codEquipe;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public int getGolsNoJogo() {
        return golsNoJogo;
    }

    public void setGolsNoJogo(int golsNoJogo) {
        this.golsNoJogo = golsNoJogo;
    }
   
   
   @Override
   public void marcaGol(){
       this.golsNoJogo++;
       System.out.print("GOL!!!!!\n");
   }
   
   
}
