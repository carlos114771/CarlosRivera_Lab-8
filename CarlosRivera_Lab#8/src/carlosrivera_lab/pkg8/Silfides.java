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
public class Silfides extends Hadas {

    private int alas;

    public Silfides() {
        super();
    }

    public Silfides(int alas, String nombre, double altura, double edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return "Silfides{" + "alas=" + alas + '}';
    }

}
