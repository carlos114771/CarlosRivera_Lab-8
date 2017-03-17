/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg8;

/**
 *
 * @author Usuario Dell
 */
public class Hamadriades extends Hadas {

    private double arbol;

    public Hamadriades() {
        super();
    }

    public Hamadriades(double arbol, String nombre, double altura, double edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.arbol = arbol;
    }

    public double isArbol() {
        return arbol;
    }

    public void setArbol(double arbol) {
        this.arbol = arbol;
    }

    @Override
    public String toString() {
        return "Hamadriades{" + "arbol=" + arbol + '}';
    }

}
