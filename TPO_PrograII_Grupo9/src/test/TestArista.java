package test;

import interfaces.IArista;
import interfaces.ICable;
import interfaces.IDivision;
import interfaces.INodo;
import modelo.Arista;
import modelo.Cable;
import modelo.Division;
import modelo.Nodo;

public class TestArista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDivision d1 = new Division("Seguridad cibernetica");
		
		INodo<IDivision> nodo1 = new Nodo<>(d1); //sera el origen
		
		//----
		
		IDivision d2 = new Division("Centro de comunicaciones");
		
		INodo<IDivision> nodo2 = new Nodo<>(d2); //sera el destino
		
		
		ICable c1 = new Cable(110000, 20);
		
		IArista<IDivision> a1 = new Arista<>(nodo1, nodo2, c1);
		
		
		
		//get origen
		System.out.println(a1.getOrigen()); //seguridad cibernetica es el origen
		
		//getdestino
		System.out.println(a1.getDestino()); //y el destino es centro de comunicaciones!

		//getcable
		System.out.println(a1.getCable()); //Los datos del cable que une esas divisiones (110000, 20)
		
		//get peso
		System.out.println(a1.getPeso(0.4, 0.6)); //pasamos valores validos, ya que la unica clase responsable de validar los coeficientes A y B es el Grafo!
		//Esperado: 44012.0

	}

}
