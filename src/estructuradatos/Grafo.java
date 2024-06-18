/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author Daniel Sanchez, Alexander Ludena
 */
public abstract class Grafo extends EstructuraDeDatos {
    protected Nodo[] nodos;

    public abstract void agregarNodo(Nodo nodo);
    public abstract void agregarArista(Nodo origen, Nodo destino);
    public abstract void eliminarNodo(Nodo nodo);
    public abstract void eliminarArista(Nodo origen, Nodo destino);
}
