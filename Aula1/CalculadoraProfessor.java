/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprofessor;

/**
 *
 * @author vgramolini
 */
public class CalculadoraProfessor {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        System.out.println("Area double: "+circulo.calcularArea());
        System.out.println("Area int: "+circulo.calcularAreaInteiro());
        System.out.println("Area double: "+circulo.calcularArea(true));
        System.out.println("Area int: "+circulo.calcularAreaInteiro(true));
        System.out.println("Area double: "+circulo.calcularArea(false));
        System.out.println("Area int: "+circulo.calcularAreaInteiro(false));
    }
    
}
