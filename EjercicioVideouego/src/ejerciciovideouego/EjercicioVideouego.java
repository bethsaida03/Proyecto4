/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovideouego;

import videojuego.entidades.VJAccion;
import videojuego.entidades.VJArcade;
import videojuego.entidades.VJDeportivo;
import videojuego.entidades.VideoJuego;
import videojuego.interfaces.Armable;
import videojuego.interfaces.ManejoPuntajes;

/**
 *
 * @author Karla Abad
 */
public class EjercicioVideouego {

    public static void main(String[] args) {
        //error no se pueden crear objetos de una clase abstracta
        //   VideoJuego video=new VideoJuego();
        VideoJuego video = new VJAccion(); //upcasting
        System.out.println("Puntos " + video.getPuntos());// el constructor
        // con el que se hizo este objeto llama por defecto al constructor de la clase padre.. super()
        //por eso el numero de puntos que se imprime es 300
        video.jugar(); //enlace dinamico de metodos
        video.mostrar();
        //    video.luchar();// clase VIdeoJuego no tiene al metodo
        // luchar

        video = new VJDeportivo(); //upcasting
        System.out.println("Puntos " + video.getPuntos());// el constructor
        // con el que se hizo este objeto llama por defecto al constructor de la clase padre.. super()
        //por eso el numero de puntos que se imprime es 300
        video.jugar();//OJO EXPLICAR

        //upcastinga en varios niveles
        VideoJuego video2 = new VJArcade(); //OJO EXPLICAR
        video2.jugar();

        //  VJAccion vja= video; // se puede hacer pero por downcasting
        //******VJAccion vja = (VJAccion) video;// downcasting
        // esta linea da error en tiempo de ejecucion porque la variable video referencia a VJDeportivo
        // y no puede convertirse a un VJAccion

        //  VJDeportivo vjd= new VJAccion();//no es posible no hay relacion entre los tipos
        ManejoPuntajes puntajes;
        puntajes = new VJAccion();
        puntajes = new VJDeportivo();

        Armable arm;
        arm = new VJAccion();
        //     arm= new VJDeportivo();

    }

}
