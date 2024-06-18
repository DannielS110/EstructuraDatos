/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class NodoArbol extends Nodos{
    
    private int nivel;
    private NodoArbol nodoAnterior;
    private NodoArbol nodoPosterior;
    private Color color;

    public NodoArbol(int valor, int nivel) {
        super(valor);
        this.nivel = nivel;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the nodoAnterior
     */
    public NodoArbol getNodoAnterior() {
        return nodoAnterior;
    }

    /**
     * @param nodoAnterior the nodoAnterior to set
     */
    public void setNodoAnterior(NodoArbol nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    /**
     * @return the nodoPosterior
     */
    public NodoArbol getNodoPosterior() {
        return nodoPosterior;
    }

    /**
     * @param nodoPosterior the nodoPosterior to set
     */
    public void setNodoPosterior(NodoArbol nodoPosterior) {
        this.nodoPosterior = nodoPosterior;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
}
