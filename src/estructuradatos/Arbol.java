/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author Daniel Sanchez, Alexander Ludena
 */
public abstract class Arbol extends EstructuraDeDatos {
    protected Nodo raiz;

    public abstract Nodo buscar(Object elemento);
    public abstract int altura();
}

