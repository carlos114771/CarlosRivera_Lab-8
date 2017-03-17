package carlosrivera_lab.pkg8;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Hadas implements Serializable{
    protected String nombre;
    protected double altura;
    protected int edad;
    protected int salud;
    protected int poder;
    private static final long SerialVersionUID = 1412L;

    public Hadas(String nombre, double altura, int edad, int salud, int poder) {
        this.nombre = nombre;
        if (altura < 15) {
            this.altura = altura;
        } else {
            while (altura >= 15) {
                altura = Double.parseDouble(JOptionPane.showInputDialog(
                        "Ingrese la altura del hada otravez"));
            }
        }
        if (edad > 0) {
            this.edad = edad;
        } else {
            while (edad <= 0) {
                edad = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese la edad del hada otravez"));
            }
        }
        this.salud = salud;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 15) {
            this.altura = altura;
        } else {
            while (altura >= 15) {
                altura = Double.parseDouble(JOptionPane.showInputDialog(
                        "Ingrese la altura del hada otravez"));
            }
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            while (edad <= 0) {
                edad = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese la edad del hada otravez"));
            }
        }
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
