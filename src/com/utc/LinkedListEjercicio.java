package com.utc;
import java.util.LinkedList;

public class LinkedListEjercicio {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<>();
		
		lista.addFirst("Alvarez Perales Harumi");
		lista.addLast("Carrizales Sanchez Armando");
		lista.addLast("Cinto Gonzalez Miguel");
		lista.addLast("Gonzales Hernandez Victor");
		lista.addLast("Higuera Jimenez Luis");	
		lista.addLast("Lira Hernandez Erick");
		lista.addLast("Martinez Alvarez Angel");
		lista.addLast("Martinez Diaz Misaid");
		lista.addLast("Moreno Correa Johan");
		lista.addLast("Oropeza Santiago Eduardo");
		lista.addLast("Osorio Gomez Desailly");
		
		System.out.println("Lista actual: " +lista);
		
		//Remover a los que no van
		lista.remove("Higuera Jimenez Luis");
		
		lista.addFirst("Alejandrez Corona Diego");
		lista.addLast("Valdez Arroyo Jack");
		
		System.out.println("Checar si esta misaid" +lista.contains("Martinez Diaz Misaid"));
		System.out.println("Lista actualizada: " +lista);
		System.out.println("Tamano Lista: "+lista.size());
		System.out.println("Primero: " + lista.getFirst());
        System.out.println("Último: " + lista.getLast());
		
	}

}
