/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jornal.desportivo;



/**
 *
 * @author Tarcyo
 */
public interface IntJogo {
  default String selecionaJogadores(Equipe equipe1,Equipe equipe2){
        if(equipe1.getGolsNoJogo()>equipe2.getGolsNoJogo()){
            return "A equipe "+equipe1.getNome()+" venceu a equipe"+ equipe2.getNome()+"Por "+equipe1.getGolsNoJogo()+" a "+equipe2.getGolsNoJogo();
        }
        if(equipe1.getGolsNoJogo()<equipe2.getGolsNoJogo()){
            return "A equipe "+equipe2.getNome()+" venceu a equipe"+ equipe1.getNome()+"Por "+equipe2.getGolsNoJogo()+" a "+equipe1.getGolsNoJogo();
        }
        return "Deu empate! "+"Por "+ equipe2.getGolsNoJogo()+" a "+equipe1.getGolsNoJogo();
        
        
   }
    
}
