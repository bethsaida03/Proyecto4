/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego.interfaces;

public interface Armable {
    //en una interfaz solo constantes y metodos abstractas
    //de manera implicita public static final
    int MINIMOARMAS=2;
    //de manera implicita public abstract
    void armar(String armas);
}
