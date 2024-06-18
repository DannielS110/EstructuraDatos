/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author Daniel Sanchez, Alexander Ludena
 */
public abstract class Lista extends EstructuraDeDatos {
    protected Nodo head;

    public abstract boolean buscar(Object elemento);
    public abstract Object obtener(int indice);
}

