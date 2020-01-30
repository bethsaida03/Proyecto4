/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego.entidades;

import java.util.ArrayList;
import videojuego.interfaces.ManejoPuntajes;

/**
 *
 * @author Karla Abad
 */
public abstract class VideoJuego implements ManejoPuntajes {

    protected String nombre;
    protected int puntos;
    protected ArrayList<Personaje> listaPersonajes;

    public VideoJuego() {
        this.puntos = 300;
        this.listaPersonajes = new ArrayList();
    }

    public VideoJuego(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.listaPersonajes = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre + "/nPuntos: " + this.puntos);
    }

    public abstract void jugar();
    //esta clase tiene 2 metodos abstractos> jugar y cambiarPuntajes(de la Interfaz ManejoPuntajes)

    //métodos para manejar la lista de personajes
    public void agregarPersonaje(Personaje per) {
        //this.listaPersonajes.add(2,per);
        this.listaPersonajes.add(per); //Si no especifico la posisición se agrega el objeto al final de la lista
    }

    public void eliminarPersonaj(int posicion) {
        this.listaPersonajes.remove(posicion);
    }

    public void mostrarPersonajes() {
        for (int i = 0; i < this.listaPersonajes.size(); i++) {
            String objeto = this.listaPersonajes.get(i).toString(); //Retorna un objeto de tipo Personaje
            System.out.println("Personaje: " + objeto);
        }
    }

    public void buscarPersonaje(String nombre) {
        //for each -----> por cada
        //"Tipo de variable que deseamos recorrer" "variable" : "colección"
        for (Personaje per : this.listaPersonajes) {
            if (per.nombre.equals(nombre)) {
                System.out.println("Personaje Encontrado");
                per.mostrar();
            }
        }
    }

    public Personaje buscarPersonaje(int numeroVidas) {
        Personaje perEncontrado = null;
        for (Personaje per : this.listaPersonajes) {
            if (per.numeroVidas == numeroVidas) {
                // return per;
                perEncontrado = per;
                break; //para que no siga buscando
            }
        }
        return perEncontrado;
    }
}
