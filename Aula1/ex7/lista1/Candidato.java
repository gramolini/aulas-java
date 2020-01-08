/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7.lista1;

/**
 *
 * @author vgramolini
 */
public class Candidato {
    private String nome;
    private int numVotos;

    public Candidato(String nome) {
        this.nome = nome;
        this.numVotos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }
    
    /**
     * Este método retorna void e incrementa o número de votos do candidato em 1 unidade.
     */
    public void incrementarVoto(){
        this.numVotos += 1;
    }
}
