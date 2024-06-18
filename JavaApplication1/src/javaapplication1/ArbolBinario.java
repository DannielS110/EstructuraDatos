/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class ArbolBinario extends EstructuraDeDato implements Recorrido{
    
    private int altura;
    private NodoArbol raiz;
    private NodoArbol hojas;
    private NodoArbol ramas;

    public ArbolBinario(int altura, NodoArbol raiz, NodoArbol hojas, NodoArbol ramas) {
        this.altura = altura;
        this.raiz = raiz;
        this.hojas = hojas;
        this.ramas = ramas;
    }   
    
    
    
    @Override
    public void agregar(){
        
    }
    
    @Override
    public void insertar(){
        
    }
    
    @Override
    public void eliminar(){
        
    }

    @Override
    public void inorden() {
        
    }

    @Override
    public void preorden() {
    }

    @Override
    public void posorden() {
    }
}
