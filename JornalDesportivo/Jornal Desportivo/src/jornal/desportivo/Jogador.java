/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jornal.desportivo;

import java.util.Random;

/**
 *
 * @author Tarcyo
 */
public class Jogador implements IntJogador{

    
    private int codJogador;
    private String funcao;
    private int golsMarcados;
    private int faltas;
    private int cartoesVermelhos;
    private int cartoesAmarelos;
    private String nome;
    private boolean titular;
   
    public Jogador(){
        
    }
    public Jogador( String nome,String funcao, boolean titular) {
        Random r=new Random();
        this.codJogador= r.nextInt(9999999);
        this.funcao = funcao;
        this.nome = nome;
        this.titular = titular;
    }
     @Override
    public String toString() {
        return "Jogador{" + "codJogador=" + codJogador + ", nome=" + nome + ", titular=" + titular + ", funcao=" + funcao + ", golsMarcados=" + golsMarcados + ", faltas=" + faltas +", cartoesAmarelos=" + cartoesAmarelos  +  ", cartoesVermelhos=" + cartoesVermelhos + '}';
    }
    
    
    public int getCodJogador() {
        return codJogador;
    }

    public void setCodJogador(int codJogador) {
        this.codJogador = codJogador;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public void setCartoesVermelhos(int cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
  
    
    @Override
    public void marcaGol(){
        this.golsMarcados++;
        System.out.print("GOL!!!!!!!!!!!!!\ndo jogador: "+this.getNome()+"\n");
    } 
    @Override
    public void levaFalta(){
        this.faltas++;
        System.out.print("Jogador "+this.nome+" Levou falta!\n");
    } 
    @Override
    public void levaCartaoVermelho(){
        this.cartoesVermelhos++;
        System.out.print("Jogador "+this.nome+" Levou cartão vermelho!\n");
    } 
    @Override
    public void levaCartaoAmarelo(){
        this.cartoesAmarelos++;
        System.out.print("Jogador "+this.nome+" Levou cartão amarelo!\n");
    } 
    
    
    
}
