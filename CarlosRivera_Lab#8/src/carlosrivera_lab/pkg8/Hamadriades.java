package carlosrivera_lab.pkg8;

public class Hamadriades extends Hadas{
    private double salArbol;

    public Hamadriades(String nombre, double altura, int edad, int salud, int poder, double salArbol) {
        super(nombre, altura, edad, salud, poder);
    }

    public double getSalArbol() {
        return salArbol;
    }

    public void setSalArbol(double salArbol) {
        if (salArbol <= 0) {
            this.salArbol = 0;
        } else {
            this.salArbol = salArbol;
        }
    }

    @Override
    public String toString() {
        return "Hamadriade: " + nombre;
    }
    
    
}
