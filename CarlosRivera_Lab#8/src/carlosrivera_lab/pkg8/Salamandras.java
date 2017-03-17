package carlosrivera_lab.pkg8;

import javax.swing.JOptionPane;

public class Salamandras extends Hadas{
    private int Alas;

    public Salamandras(String nombre, double altura, int edad, int salud, int poder, int Alas) {
        super(nombre, altura, edad, salud, poder);
        if (Alas >= 16) {
            this.Alas = Alas;
        } else {
            while (Alas < 16) {
                Alas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese la cantidad de alas otravez"));
            }
        }
    }

    public int getAlas() {
        return Alas;
    }

    public void setAlas(int Alas) {
        if (Alas >= 16) {
            this.Alas = Alas;
        } else {
            while (Alas < 16) {
                Alas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese la cantidad de alas otravez"));
            }
        }
    }

    @Override
    public String toString() {
        return "Salamandra: " + nombre;
    }
    
}
