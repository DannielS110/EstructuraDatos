/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author Daniel Sanchez, Alexander Ludena
 */
public class GrafoDirigido extends Grafo {

    public GrafoDirigido() {
        this.nodos = new Nodo[0];
    }

    @Override
    public void agregarNodo(Nodo nodo) {
        Nodo[] nuevoNodos = new Nodo[nodos.length + 1];
        System.arraycopy(nodos, 0, nuevoNodos, 0, nodos.length);
        nuevoNodos[nodos.length] = nodo;
        nodos = nuevoNodos;
    }

    @Override
    public void agregarArista(Nodo origen, Nodo destino) {
        origen.derecha = destino;
    }

    @Override
    public void eliminarNodo(Nodo nodo) {
        Nodo[] nuevoNodos = new Nodo[nodos.length - 1];
        int j = 0;
        for (Nodo n : nodos) {
            if (!n.equals(nodo)) {
                nuevoNodos[j++] = n;
            }
        }
        nodos = nuevoNodos;
    }

    @Override
    public void eliminarArista(Nodo origen, Nodo destino) {
        if (origen.derecha.equals(destino)) {
            origen.derecha = null;
        }
    }

    @Override
    public void agregar(Object elemento) {
        if (elemento instanceof Nodo) {
            agregarNodo((Nodo) elemento);
        }
    }

    @Override
    public void insertar(Object elemento, int indice) {
        // Este método no es relevante para grafos, pero se incluye para cumplir con la interfaz
    }

    @Override
    public void eliminar(Object elemento) {
        if (elemento instanceof Nodo) {
            eliminarNodo((Nodo) elemento);
        }
    }
}

