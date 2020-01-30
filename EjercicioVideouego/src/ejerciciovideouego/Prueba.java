package ejerciciovideouego;

import operaciones.OperacionesVideoJuego;
import videojuego.entidades.Personaje;
import videojuego.entidades.VJAccion;
import videojuego.entidades.VJDeportivo;
import videojuego.entidades.VideoJuego;

public class Prueba {

    public static void main(String[] args) {
        VideoJuego vi = new VJAccion(); //Polimorfismo ----> upcasting
        for (int i = 0; i < 3; i++) {
            Personaje per = new Personaje();
            per.llenarDatos();
            vi.agregarPersonaje(per);
        }
        vi.mostrarPersonajes();
        vi.buscarPersonaje("Goku");
        vi.buscarPersonaje(2);

        Personaje perEncontrado = vi.buscarPersonaje(2);
        if (perEncontrado != null) {
            System.out.println("\nPersonaje con número de vidas encontradas");
            perEncontrado.mostrar();
        } else { // ==null
            System.out.println("\nPersonaje con número de vidas no encontrado");
        }
        VideoJuego vi1 = new VJAccion(true, "Juego 1", 200);
        OperacionesVideoJuego oper = new OperacionesVideoJuego();
        oper.agregarVideoJuego(vi1);
        vi1 = new VJDeportivo("Tenis", "Juego 2", 250);
        oper.agregarVideoJuego(vi1);
        vi1 = new VJAccion(true, "Juego 3", 300);
        oper.agregarVideoJuego(vi1);
        int n = oper.contarVJAction();
        System.out.println("Num vja " + n);
    }
}
