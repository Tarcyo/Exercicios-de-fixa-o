/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jornal.desportivo;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Tarcyo
 */
public interface IntTecnico {
    default ArrayList<Jogador> selecionaJogadores(){
        ArrayList <Jogador> jogadores = new  ArrayList<Jogador>();
        Random r=new Random();
        for(int i=0;i<11;i++){
            
            jogadores.add(new Jogador());
        }
        return jogadores;
        
        
       
   }
    
    
}
