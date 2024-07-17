/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taream3;
import java.util.Scanner;
/**
 *
 * @author Michel Enamorado
 */
public class Main {
        public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu de la Biblioteca");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por titulo");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Mostrar libros disponibles");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Año de publicacion: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Genero: ");
                    String genero = scanner.nextLine();
                    Libro libro = new Libro(titulo, autor, anio, genero);
                    biblioteca.agregarLibro(libro);
                    break;
                case 2:
                    System.out.print("Titulo: ");
                    String tituloBusqueda = scanner.nextLine();
                    biblioteca.buscarLibroPorTitulo(tituloBusqueda);
                    break;
                case 3:
                    System.out.print("Autor: ");
                    String autorBusqueda = scanner.nextLine();
                    biblioteca.buscarLibroPorAutor(autorBusqueda);
                    break;
                case 4:
                    System.out.print("Titulo: ");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(tituloPrestar);
                    break;
                case 5:
                    System.out.print("Titulo: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    break;
                case 6:
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
    
}
