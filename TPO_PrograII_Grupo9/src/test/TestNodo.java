package test;

import interfaces.IDivision;
import modelo.Division;
import modelo.Nodo;
import interfaces.INodo;

public class TestNodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDivision d1 = new Division("Contrainteligencia");
		
		INodo<IDivision> nodo1 = new Nodo<>(d1);
		
		
		// Test getValor()
        System.out.println("Valor del nodo1: " + nodo1.getValor()); // Contrainteligencia
        
        //Test setValor()
        IDivision d2 = new Division("Analisis de Amenazas");
        nodo1.setValor(d2);
        System.out.println("Nuevo valor del nodo1: " + nodo1.getValor()); // Analisis de amenazas
        
        
	}

}
