/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7.lista1;

import java.util.Scanner;

/**
 *
 * @author vgramolini
 */
public class Ex7Lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("Zezinho");
        Scanner scan = new Scanner(System.in);
        String voto;
        do {
            System.out.println("Informe o nome do candidato: ");
            voto = scan.next();
            if (voto.equals(candidato1.getNome())) {
                candidato1.incrementarVoto();
            }
        } while (!voto.equals("SAIR"));
        System.out.println("O candidato " + candidato1.getNome() + " tem " + candidato1.getNumVotos() + " voto(s)");
    }

}
