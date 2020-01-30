/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.ArrayList;
import videojuego.entidades.VJAccion;
import videojuego.entidades.VideoJuego;

/**
 *
 * @author PC-03
 */
public class OperacionesVideoJuego {

    ArrayList<VideoJuego> listaVJ;

    public OperacionesVideoJuego() {
        this.listaVJ = new ArrayList();
    }

    public void agregarVideoJuego(VideoJuego vi) {
        this.listaVJ.add(vi);
    }

    public void eliminarVideoJuego(int pos) {
        this.listaVJ.remove(pos);
    }

    public void eliminarVideoJuego(String nombre) {
        for (VideoJuego vi : this.listaVJ) {
            if (vi.getNombre().equals(nombre)) {
                this.listaVJ.remove(vi);
                System.out.println("VideoJ eliminando");
            }
        }
    }

    public int contarVJAction() {
        int cont = 0;
        for (VideoJuego vi : this.listaVJ) {
            if (vi instanceof VJAccion) {
                //VJAccion vja=(VJAccion)vi;----ESTO ES DOWCASTING Y SE LO PUEDE HACER TAMBN ASI
                //vja.luchar("Hacha");
                ((VJAccion) vi).luchar("Hacha"); //DOWNCASTING
                cont++;
            }
        }
        return cont;
    }

}
