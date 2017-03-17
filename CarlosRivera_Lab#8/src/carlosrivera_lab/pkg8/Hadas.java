/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg8;

import java.io.Serializable;

/**
 *
 * @author Usuario Dell
 */
public class Hadas implements Serializable {

    protected String nombre;
    protected double altura;
    protected double edad;
    protected double salud;
    protected double poder;

    protected static final long SerialVersionUID = 777L;

    public Hadas() {
    }

    public Hadas(String nombre, double altura, double edad, double salud, double poder) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
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
        this.altura = altura;

    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Hadas{" + "nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", salud=" + salud + ", poder=" + poder + '}';
    }

}
