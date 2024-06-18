/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author Daniel Sanchez, Alexander Ludena
 */
public class ListaCircular extends Lista {

    public ListaCircular() {
        this.head = null;
    }

    @Override
    public void agregar(Object elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        if (head == null) {
            head = nuevoNodo;
            head.siguiente = head;
        } else {
            Nodo actual = head;
            while (actual.siguiente != head) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            nuevoNodo.siguiente = head;
        }
    }

    @Override
    public void insertar(Object elemento, int indice) {
        Nodo nuevoNodo = new Nodo(elemento);
        if (indice == 0) {
            if (head == null) {
                head = nuevoNodo;
                head.siguiente = head;
            } else {
                Nodo actual = head;
                while (actual.siguiente != head) {
                    actual = actual.siguiente;
                }
                nuevoNodo.siguiente = head;
                actual.siguiente = nuevoNodo;
                head = nuevoNodo;
            }
        } else {
            Nodo actual = head;
            for (int i = 0; i < indice - 1; i++) {
                if (actual.siguiente == head) return; // Índice fuera de rango
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
            if (head.siguiente == head) {
                head = null;
            } else {
                Nodo actual = head;
                while (actual.siguiente != head) {
                    actual = actual.siguiente;
                }
                actual.siguiente = head.siguiente;
                head = head.siguiente;
            }
            return;
        }

        Nodo actual = head;
        while (actual.siguiente != head && !actual.siguiente.valor.equals(elemento)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != head) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    @Override
    public boolean buscar(Object elemento) {
        Nodo actual = head;
        if (head == null) return false;
        do {
            if (actual.valor.equals(elemento)) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != head);
        return false;
    }

    @Override
    public Object obtener(int indice) {
        Nodo actual = head;
        if (head == null) return null;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
            if (actual == head) return null; // Índice fuera de rango
        }
        return actual.valor;
    }
}

