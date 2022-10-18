/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jornal.desportivo;

import java.util.Date;

/**
 *
 * @author Tarcyo
 */
public class Jogo implements IntJogo {
    private Date data;
    private Arbitro arbitro;
    private Equipe equipeVisitada;
    private Equipe equipeVisitante;
    private String resultado;
    private Equipe vencedor;
    private int codJogo;
    private int hora;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
    public int getCodJogo() {
        return codJogo;
    }

    public void setCodJogo(int codJogo) {
        this.codJogo = codJogo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Equipe getEquipeVisitada() {
        return equipeVisitada;
    }

    public void setEquipeVisitada(Equipe equipeVisitada) {
        this.equipeVisitada = equipeVisitada;
    }

    public Equipe getEquipeVisitante() {
        return equipeVisitante;
    }

    public void setEquipeVisitante(Equipe equipeVisitante) {
        this.equipeVisitante = equipeVisitante;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Equipe getVencedor() {
        return vencedor;
    }

    public void setVencedor(Equipe vencedor) {
        this.vencedor = vencedor;
    }
   
    
    
    
}
