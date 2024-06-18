/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author Daniel Sanchez, Alexander Ludena
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        ListaCircular listaCircular = new ListaCircular();
        ListaDoblementeEnlazada listaDoble = new ListaDoblementeEnlazada();
        ListaDobleCircular listaDobleCircular = new ListaDobleCircular();
        AVL arbolAVL = new AVL();
        ArbolRojoNegro arbolRojoNegro = new ArbolRojoNegro();
        GrafoDirigido grafoDirigido = new GrafoDirigido();
        GrafoNoDirigido grafoNoDirigido = new GrafoNoDirigido();

        while (true) {
            System.out.println("\nSeleccione una estructura de datos:");
            System.out.println("1. Lista Enlazada");
            System.out.println("2. Lista Circular");
            System.out.println("3. Lista Doblemente Enlazada");
            System.out.println("4. Lista Doble Circular");
            System.out.println("5. Árbol AVL");
            System.out.println("6. Árbol Rojo-Negro");
            System.out.println("7. Grafo Dirigido");
            System.out.println("8. Grafo No Dirigido");
            System.out.println("9. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            if (choice == 9) {
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Has seleccionado Lista Enlazada.");
                    manejarLista(scanner, lista);
                    break;
                case 2:
                    System.out.println("Has seleccionado Lista Circular.");
                    manejarLista(scanner, listaCircular);
                    break;
                case 3:
                    System.out.println("Has seleccionado Lista Doblemente Enlazada.");
                    manejarLista(scanner, listaDoble);
                    break;
                case 4:
                    System.out.println("Has seleccionado Lista Doble Circular.");
                    manejarLista(scanner, listaDobleCircular);
                    break;
                case 5:
                    System.out.println("Has seleccionado Árbol AVL.");
                    manejarArbol(scanner, arbolAVL);
                    break;
                case 6:
                    System.out.println("Has seleccionado Árbol Rojo-Negro.");
                    manejarArbol(scanner, arbolRojoNegro);
                    break;
                case 7:
                    System.out.println("Has seleccionado Grafo Dirigido.");
                    manejarGrafo(scanner, grafoDirigido);
                    break;
                case 8:
                    System.out.println("Has seleccionado Grafo No Dirigido.");
                    manejarGrafo(scanner, grafoNoDirigido);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    private static void manejarLista(Scanner scanner, Lista lista) {
        System.out.println("\nOpciones de Lista:");
        System.out.println("1. Agregar elemento");
        System.out.println("2. Insertar elemento en posición");
        System.out.println("3. Eliminar elemento");
        System.out.println("4. Buscar elemento");
        System.out.println("5. Obtener elemento en posición");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el elemento a agregar:");
                String elementoAgregar = scanner.nextLine();
                lista.agregar(elementoAgregar);
                System.out.println("Elemento agregado a la lista.");
                break;
            case 2:
                System.out.println("Ingrese el elemento a insertar:");
                String elementoInsertar = scanner.nextLine();
                System.out.println("Ingrese la posición:");
                int posicion = scanner.nextInt();
                lista.insertar(elementoInsertar, posicion);
                System.out.println("Elemento insertado en la lista.");
                break;
            case 3:
                System.out.println("Ingrese el elemento a eliminar:");
                String elementoEliminar = scanner.nextLine();
                lista.eliminar(elementoEliminar);
                System.out.println("Elemento eliminado de la lista.");
                break;
            case 4:
                System.out.println("Ingrese el elemento a buscar:");
                String elementoBuscar = scanner.nextLine();
                boolean encontrado = lista.buscar(elementoBuscar);
                System.out.println("Elemento " + (encontrado ? "encontrado" : "no encontrado") + " en la lista.");
                break;
            case 5:
                System.out.println("Ingrese la posición:");
                int indice = scanner.nextInt();
                Object elementoObtenido = lista.obtener(indice);
                System.out.println("Elemento en posición " + indice + ": " + elementoObtenido);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void manejarArbol(Scanner scanner, Arbol arbol) {
        System.out.println("\nOpciones de Árbol:");
        System.out.println("1. Agregar elemento");
        System.out.println("2. Eliminar elemento");
        System.out.println("3. Buscar elemento");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el elemento a agregar:");
                String elementoAgregar = scanner.nextLine();
                arbol.agregar(elementoAgregar);
                System.out.println("Elemento agregado al árbol.");
                break;
            case 2:
                System.out.println("Ingrese el elemento a eliminar:");
                String elementoEliminar = scanner.nextLine();
                arbol.eliminar(elementoEliminar);
                System.out.println("Elemento eliminado del árbol.");
                break;
            case 3:
                System.out.println("Ingrese el elemento a buscar:");
                String elementoBuscar = scanner.nextLine();
                Nodo nodo = arbol.buscar(elementoBuscar);
                System.out.println("Elemento " + (nodo != null ? "encontrado" : "no encontrado") + " en el árbol.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void manejarGrafo(Scanner scanner, Grafo grafo) {
        System.out.println("\nOpciones de Grafo:");
        System.out.println("1. Agregar nodo");
        System.out.println("2. Agregar arista");
        System.out.println("3. Eliminar nodo");
        System.out.println("4. Eliminar arista");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor del nodo:");
                String valorNodo = scanner.nextLine();
                Nodo nodoAgregar = new Nodo(valorNodo);
                grafo.agregarNodo(nodoAgregar);
                System.out.println("Nodo agregado al grafo.");
                break;
            case 2:
                System.out.println("Ingrese el valor del nodo de origen:");
                String valorOrigen = scanner.nextLine();
                System.out.println("Ingrese el valor del nodo de destino:");
                String valorDestino = scanner.nextLine();
                Nodo nodoOrigen = new Nodo(valorOrigen);
                Nodo nodoDestino = new Nodo(valorDestino);
                grafo.agregarArista(nodoOrigen, nodoDestino);
                System.out.println("Arista agregada al grafo.");
                break;
            case 3:
                System.out.println("Ingrese el valor del nodo a eliminar:");
                String valorEliminar = scanner.nextLine();
                Nodo nodoEliminar = new Nodo(valorEliminar);
                grafo.eliminarNodo(nodoEliminar);
                System.out.println("Nodo eliminado del grafo.");
                break;
            case 4:
                System.out.println("Ingrese el valor del nodo de origen:");
                String valorOrigenEliminar = scanner.nextLine();
                System.out.println("Ingrese el valor del nodo de destino:");
                String valorDestinoEliminar = scanner.nextLine();
                Nodo nodoOrigenEliminar = new Nodo(valorOrigenEliminar);
                Nodo nodoDestinoEliminar = new Nodo(valorDestinoEliminar);
                grafo.eliminarArista(nodoOrigenEliminar, nodoDestinoEliminar);
                System.out.println("Arista eliminada del grafo.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
