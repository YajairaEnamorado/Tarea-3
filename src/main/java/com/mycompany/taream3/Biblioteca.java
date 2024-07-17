/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taream3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Michel Enamorado
 */
public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

public void buscarLibroPorTitulo(String titulo) {
    boolean encontrado = false;
    for (Libro libro : libros) {
        if (libro.getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println(libro);
            encontrado = true;
        }
    }
    if (!encontrado) {
        System.out.println("El libro con el titulo \"" + titulo + "\" no fue encontrado.");
    }
}


public void buscarLibroPorAutor(String autor) {
    boolean encontrado = false;
    for (Libro libro : libros) {
        if (libro.getAutor().equalsIgnoreCase(autor)) {
            System.out.println(libro);
            encontrado = true;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontraron libros del autor \"" + autor + "\".");
    }
}


    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isDisponible()) {
                libro.setDisponible(false);
                System.out.println("El libro " + titulo + " ha sido prestado.");
                return;
            }
        }
        System.out.println("El libro no está disponible o no existe.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isDisponible()) {
                libro.setDisponible(true);
                System.out.println("El libro " + titulo + " ha sido devuelto.");
                return;
            }
        }
        System.out.println("El libro no se puede devolver porque está disponible o no existe.");
    }

    public void mostrarLibrosDisponibles() {
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                System.out.println(libro);
            }
        }
    }
}
