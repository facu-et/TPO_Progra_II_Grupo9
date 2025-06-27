package test;

import modelo.Division;
import interfaces.IDivision;

public class TestDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDivision d1 = new Division("Contrainteligencia");
		
		System.out.println(d1); 
		
		//test getter
		System.out.println(d1.getNombre());
		
		//test setter
		d1.setNombre("Vigilancia Electronica");
		System.out.println(d1);
		
		System.out.println(d1.getNombre());
		
		//--------------------------------------------------------------------
		
		System.out.println("\n\n\n-----------------------------------\n\n\nProbamos el equals: ");
		//test equals
		IDivision d2 = new Division("Vigilancia Electronica");
		System.out.println(d1.equals(d2)); //esperado: true
		
		System.out.println(d1.equals(d1)); //esperado: true
		
		IDivision d3 = new Division("Base de Datos Central");
		
		System.out.println(d2.equals(d3)); //esperado: false

	}

}