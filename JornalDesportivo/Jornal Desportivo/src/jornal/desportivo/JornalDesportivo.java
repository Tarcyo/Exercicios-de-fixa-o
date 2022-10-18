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
public class JornalDesportivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tecnico tecnico=new Tecnico("Pereira");
        Jogador jogador =new Jogador("Pablo","Meio-Campo",true);
        jogador.marcaGol();
        jogador.levaFalta();
        jogador.levaFalta();
        jogador.levaCartaoAmarelo();
        jogador.levaCartaoAmarelo();
        jogador.levaCartaoAmarelo();
        jogador.levaCartaoAmarelo();
        jogador.levaCartaoVermelho();
        System.out.print(tecnico);
        
    }
    
}
