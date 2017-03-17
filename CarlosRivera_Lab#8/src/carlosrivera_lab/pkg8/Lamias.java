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
public class Lamias extends Hadas {

    private double aleta;
    private double branquias;

    public Lamias() {
        super();
    }

    public Lamias(double aleta, double branquias, String nombre, double altura, double edad, double salud, double poder) {
        super(nombre, altura, edad, salud, poder);
        this.aleta = aleta;
        this.branquias = branquias;
    }

    public double getAleta() {
        return aleta;
    }

    public void setAleta(double aleta)  {
        this.aleta = aleta;
    }

    public double getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    @Override
    public String toString() {
        return "Lamias{" + "aleta=" + aleta + ", branquias=" + branquias + '}';
    }

}
