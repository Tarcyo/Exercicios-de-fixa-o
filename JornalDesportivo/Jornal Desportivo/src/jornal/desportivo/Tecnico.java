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
public class Tecnico implements IntTecnico{
    private int codTecnico;
    private String nome;
    public Tecnico(){
        
    }
    public Tecnico(String nome) {
        Random r=new Random();
        this.codTecnico = r.nextInt(999999);
        this.nome = nome;
    }
   

    @Override
    public String toString() {
        return "Tecnico{" + "codTecnico=" + codTecnico + ", nome=" + nome + '}';
    }
    public int getCodTecnico() {
        return codTecnico;
    }

    public void setCodTecnico(int codTecnico) {
        this.codTecnico = codTecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
   
    
    
}
