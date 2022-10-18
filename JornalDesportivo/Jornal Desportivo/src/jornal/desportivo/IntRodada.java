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
public interface IntRodada {
    default ArrayList <Equipe> promoveEquipes(ArrayList <Equipe> equipes){
        ArrayList<Equipe> equipesPromovidas=new ArrayList<Equipe>();
        for(Equipe equipe:equipes){
            if(equipe.getStatus().equals("Vencedor")){
                equipe.setNumeroRodada(equipe.getNumeroRodada()+1);
                equipesPromovidas.add(equipe);
            }
            
        }
        return equipesPromovidas;
    }
    
}
