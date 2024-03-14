package com.coderhouse.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.coderhouse.clases.Persona;

public class Main {

	public static void main(String[] args) {
		// Crear 5 objetos Persona
        Persona persona1 = new Persona("Juan", "Perez");
        Persona persona2 = new Persona("Pedro", "Fernandez");
        Persona persona3 = new Persona("Susana", "Rodríguez");
        Persona persona4 = new Persona("María", "Gonzalez");
        Persona persona5 = new Persona("Alex", "Alarcon");
        
     // Agregar los objetos a la lista
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        
     // Ordenar alfabéticamente por nombre
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        mostrarLista(listaPersonas);

        // Ordenar alfabéticamente por apellido
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        mostrarLista(listaPersonas);

        // Ordenar inversamente por apellido
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        mostrarLista(listaPersonas);
        
	}
	
	// Método para mostrar la lista de personas en consola
    private static void mostrarLista(List<Persona> lista) {
        for (Persona persona : lista) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
        }
    }

}
