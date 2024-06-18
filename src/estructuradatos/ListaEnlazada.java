/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author Daniel Sanchez, Alexander Ludena
 */
public class ListaEnlazada extends Lista {

    public ListaEnlazada() {
        this.head = null;
    }

    @Override
    public void agregar(Object elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    @Override
    public void insertar(Object elemento, int indice) {
        Nodo nuevoNodo = new Nodo(elemento);
        if (indice == 0) {
            nuevoNodo.siguiente = head;
            head = nuevoNodo;
        } else {
            Nodo actual = head;
            for (int i = 0; i < indice - 1; i++) {
                if (actual.siguiente == null) return; // Índice fuera de rango
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
    }

    @Override
    public void eliminar(Object elemento) {
        if (head == null) return;

        if (head.valor.equals(elemento)) {
            head = head.siguiente;
            return;
        }

        Nodo actual = head;
        while (actual.siguiente != null && !actual.siguiente.valor.equals(elemento)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    @Override
    public boolean buscar(Object elemento) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.valor.equals(elemento)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    @Override
    public Object obtener(int indice) {
        Nodo actual = head;
        for (int i = 0; i < indice; i++) {
            if (actual == null) return null; // Índice fuera de rango
            actual = actual.siguiente;
        }
        return actual != null ? actual.valor : null;
    }
}

