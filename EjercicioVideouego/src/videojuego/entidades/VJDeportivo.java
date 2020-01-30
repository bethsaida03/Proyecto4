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
public class VJDeportivo extends VideoJuego {

    private String deporte;

    public VJDeportivo() {
        //llama por defecto al constructor por defecto de la clase padre super();
    }

    public VJDeportivo(String deporte, String nombre, int puntos) {
        super(nombre, puntos);
        this.deporte = deporte;
    }

    @Override
    public void mostrar() {
        System.out.println("Video Juego Deportivo");
        super.mostrar();
        System.out.println("Deporte: " + this.deporte);
    }

//esta clase recibe 2 metodos abstractos de la clase padre VideoJuego
//sobreescribimos los 2 metodos  para que ya no sea abstracta  
    @Override
    public void jugar() {
        System.out.println("Jugando video juego Deportivo");
    }

    @Override
    public boolean cambiarPuntajes() {
        super.setPuntos(800);
        return true;
    }

    //ejemplo de sobrecarga de metodo
    public boolean cambiarPuntajes(int puntos) {
        super.setPuntos(puntos);
        return true;
    }

}
