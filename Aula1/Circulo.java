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
public class Circulo {

    static double PI = 3.14;
    private double raio;

    public static double getPI() {
        return PI;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return (raio * raio) * PI;
    }

    public int calcularAreaInteiro() {
        return (int) ((raio * raio) * PI);
    }

    public String calcularArea(boolean detalhar) {
        double area = (raio * raio) * PI;
        if (detalhar == true) {
            return (this.raio + " * " + this.raio + " * " + PI + " = " + area);
        }
        return String.valueOf(area);
    }

    public String calcularAreaInteiro(boolean detalhar) {
        int area = (int) ((raio * raio) * PI);
        if (detalhar == true) {
            return (this.raio + " * " + this.raio + " * " + PI + " = " + area);
        }
        return String.valueOf(area);
    }
}
