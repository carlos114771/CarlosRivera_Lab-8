/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario Dell
 */
public class Administrar_Hadas {

    private ArrayList<Lamias> listlamias = new ArrayList();
    private ArrayList<Hamadriades> listahamadriades = new ArrayList();
    private ArrayList<Silfides> listasilfides = new ArrayList();
    private ArrayList<Salamandras> listasalamandras = new ArrayList();
    private File archivo = null;

    public Administrar_Hadas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Lamias> getListlamias() {
        return listlamias;
    }

    public void setListlamias(ArrayList<Lamias> listlamias) {
        this.listlamias = listlamias;
    }

    public ArrayList<Hamadriades> getListahamadriades() {
        return listahamadriades;
    }

    public void setListahamadriades(ArrayList<Hamadriades> listahamadriades) {
        this.listahamadriades = listahamadriades;
    }

    public ArrayList<Silfides> getListasilfides() {
        return listasilfides;
    }

    public void setListasilfides(ArrayList<Silfides> listasilfides) {
        this.listasilfides = listasilfides;
    }

    public ArrayList<Salamandras> getListasalamandras() {
        return listasalamandras;
    }

    public void setListasalamandras(ArrayList<Salamandras> listasalamandras) {
        this.listasalamandras = listasalamandras;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setLamias(Lamias lamias) {
        listlamias.add(lamias);
    }

    public void sethamadriades(Hamadriades hamdriades) {
        listahamadriades.add(hamdriades);
    }

    public void setSilfides(Silfides silfides) {
        listasilfides.add(silfides);
    }

    public void setSalamandras(Salamandras salamandras) {
        listasalamandras.add(salamandras);
    }

    public void cargarArchivo() {
        try {
            listasalamandras = new ArrayList();
            listlamias = new ArrayList();
            listahamadriades = new ArrayList();
            listasilfides = new ArrayList();
            Hadas temporal;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    listlamias = (ArrayList<Lamias>) objeto.readObject();
                    listahamadriades = (ArrayList<Hamadriades>) objeto.readObject();
                    listasilfides = (ArrayList<Silfides>) objeto.readObject();
                    listasalamandras = (ArrayList<Salamandras>) objeto.readObject();
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream salida = null;
        ObjectOutputStream objeto2 = null;
        try {
            salida = new FileOutputStream(archivo);
            objeto2 = new ObjectOutputStream(salida);
            objeto2.writeObject(listlamias);
            objeto2.writeObject(listahamadriades);
            objeto2.writeObject(listasilfides);
            objeto2.writeObject(listasalamandras);
            objeto2.flush();
        } catch (Exception e) {
        } finally {
            try {
                objeto2.close();
                salida.close();
            } catch (Exception e) {
            }
        }
    }

}
