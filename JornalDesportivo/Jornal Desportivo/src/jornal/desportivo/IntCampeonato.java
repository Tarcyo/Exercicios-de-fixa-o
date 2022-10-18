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
public interface IntCampeonato {
    default void mostraCampea(ArrayList<Equipe> equipes){
        for(Equipe e:equipes){
            if(e.getStatus().equals("Campeã")){
                System.out.print("A equipe: "+e.getNome()+" foi a campeã!");
                return;
            }
            
        }
        
    }
    
}
