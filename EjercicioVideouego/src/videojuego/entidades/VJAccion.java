/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego.entidades;

import videojuego.interfaces.Armable;

/**
 *
 * @author Karla Abad
 */
public class VJAccion extends VideoJuego implements Armable {

    private boolean tieneArmasEspeciales;

    public VJAccion() {
        //llama por defecto al constructor por defecto de la clase padre super();
    }

    public VJAccion(boolean tieneArmasEspeciales, String nombre, int puntos) {
        super(nombre, puntos);
        this.tieneArmasEspeciales = tieneArmasEspeciales;
    }

    /* 
    @Override
    public void mostrar() {
        System.out.println("Video Juego de Accion");
        super.mostrar(); 
        if(this.tieneArmasEspeciales){
            System.out.println("Tiene Armas Especiales: " + "Si");
        }else{
              System.out.println("Tiene Armas Especiales: " + "No");
        }
    }*/
//esta clase recibe 2 metodos abstractos de la clase padre VideoJuego
    // y 1 metodos abstracto de la interfaz Armable
//sobreescribimos los 3 metodos  para que ya no sea abstracta  
    @Override
    public void jugar() {
        System.out.println("Jugando video juego de accion");
    }

    @Override
    public boolean cambiarPuntajes() {
        super.setPuntos(500);
        return true;
    }

    @Override
    public void armar(String armas) {
        System.out.println("Armando el video juego de accion con " + armas);
    }

    public void luchar(String estrategia) {
        System.out.println("Video Juego de accion luchando con estrategia " + estrategia);
    }
}
