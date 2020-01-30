package videojuego.entidades;

import java.util.Scanner;

public class Personaje {

    String nombre;
    int nivelDeAtaque;
    int numeroVidas;
    String historia;

    public Personaje() {

    }

    public Personaje(String no, int nA, int nV, String hi) {
        this.nombre = no;
        this.nivelDeAtaque = nA;
        this.numeroVidas = nV;
        this.historia = hi;
    }

    //gets y sets
    public String toString() {
        return "\nNombre: " + this.nombre + "\nHistoria: " + this.historia;
    }

    public void mostrar() {
        System.out.println("Personaje: " + this.toString());
    }
    
    public void llenarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese historia: ");
        this.historia = sc.nextLine();
        System.out.println("Ingrese el nivel de ataque: ");
        this.nivelDeAtaque = sc.nextInt();
        System.out.println("Ingrese el número de vidas: ");
        this.numeroVidas = sc.nextInt();
    }        

}
