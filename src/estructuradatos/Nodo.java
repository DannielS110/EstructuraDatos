/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author Daniel Sanchez, Alexander Ludena
 */
public class Nodo {
    public Object valor;
    public Nodo izquierda, derecha, siguiente, anterior;

    public Nodo(Object valor) {
        this.valor = valor;
        this.izquierda = this.derecha = this.siguiente = this.anterior = null;
    }
}

