/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego.entidades;

/**
 *
 * @author Karla Abad
 */
public class VJArcade extends VJAccion {

    private String tipo;

    public VJArcade() {
        //llama a super() implicitamente
    }

    public VJArcade(String tipo, boolean tieneArmasEspeciales, String nombre, int puntos) {
        super(tieneArmasEspeciales, nombre, puntos);
        this.tipo = tipo;
    }

    @Override
    public boolean cambiarPuntajes() {
        super.setPuntos(1000);
        return true;
    }

    @Override
    public void jugar() {
        System.out.println("Jugando video juego de accion arcade");
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Tipo: " + this.tipo);
    }

}
