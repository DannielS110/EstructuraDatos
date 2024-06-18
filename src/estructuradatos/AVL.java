/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author Daniel Sanchez, Alexander Ludena
 */
public class AVL extends Arbol {

    @Override
    public void agregar(Object elemento) {
        // Implementar lógica de inserción específica del árbol AVL
        System.out.println("Agregar no implementado.");
    }

    @Override
    public void insertar(Object elemento, int indice) {
        // Este método no es relevante para árboles, pero se incluye para cumplir con la interfaz
    }

    @Override
    public void eliminar(Object elemento) {
        // Implementar lógica de eliminación específica del árbol AVL
        System.out.println("Eliminar no implementado.");
    }

    @Override
    public Nodo buscar(Object elemento) {
        // Implementar lógica de búsqueda en el árbol AVL
        return null;
    }

    @Override
    public int altura() {
        // Implementar cálculo de la altura del árbol AVL
        return 0;
    }

    public void enOrden() {
        // Implementar recorrido en orden del árbol AVL
    }

    public void preOrden() {
        // Implementar recorrido preorden del árbol AVL
    }

    public void postOrden() {
        // Implementar recorrido postorden del árbol AVL
    }
}
