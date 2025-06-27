package test;

import java.util.List;

import interfaces.IArista;
import interfaces.IDivision;
import interfaces.IGrafo;
import interfaces.INodo;
import modelo.Arista;
import modelo.Division;
import modelo.Grafo;
import modelo.Nodo;
import interfaces.ICable;
import modelo.Cable;


public class TestGrafo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//construimos el grafo
		IGrafo<IDivision> grafo = new Grafo<>();
		
		
		//construimos todas las divisiones...
		IDivision d1 = new Division("Contrainteligencia");
		IDivision d2 = new Division("Vigilancia Electronica");
		IDivision d3 = new Division("Seguridad Cibernetica");
		IDivision d4 = new Division("Analisis de Amenazas");
		IDivision d5 = new Division("Base de Datos Central");
		IDivision d6 = new Division("Centro de Comunicaciones");
		IDivision d7 = new Division("Oficina de Criptografia");
		IDivision d8 = new Division("Direccion");
		IDivision d9 = new Division("Analisis de Senales");
		IDivision d10 = new Division("Espionaje y Contraespionaje");
		IDivision d11 = new Division("Laboratorio");
		IDivision d12 = new Division("Analisis Biometrico");
		IDivision d13 = new Division("Logistica");
		IDivision d14 = new Division("Sistemas");
		IDivision d15 = new Division("Supervision Satelital");
		IDivision d16 = new Division("Vigilancia en Redes Sociales");
		
		
		//Y tambien los nodos...
		INodo<IDivision> n1 = new Nodo(d1);
		INodo<IDivision> n2 = new Nodo(d2);
		INodo<IDivision> n3 = new Nodo(d3);
		INodo<IDivision> n4 = new Nodo(d4);
		INodo<IDivision> n5 = new Nodo(d5);
		INodo<IDivision> n6 = new Nodo(d6);
		INodo<IDivision> n7 = new Nodo(d7);
		INodo<IDivision> n8 = new Nodo(d8);
		INodo<IDivision> n9 = new Nodo(d9);
		INodo<IDivision> n10 = new Nodo(d10);
		INodo<IDivision> n11 = new Nodo(d11);
		INodo<IDivision> n12 = new Nodo(d12);
		INodo<IDivision> n13 = new Nodo(d13);
		INodo<IDivision> n14 = new Nodo(d14);
		INodo<IDivision> n15 = new Nodo(d15);
		INodo<IDivision> n16 = new Nodo(d16);
		
		
		//empecemos a construir aristas, y sus cables!!
		ICable c1 = new Cable(42350, 50);
		IArista<IDivision> a1 = new Arista<>(n1, n2, c1);
		
		ICable c2 = new Cable(39000, 60);
		IArista<IDivision> a2 = new Arista<>(n1, n3, c2);
		
		ICable c3 = new Cable(24000, 55);
		IArista<IDivision> a3 = new Arista<>(n1, n8, c3);
		
		ICable c4 = new Cable(62750, 50);
		IArista<IDivision> a4 = new Arista<>(n1, n13, c4);
		
		ICable c5 = new Cable(67000, 25);
		IArista<IDivision> a5 = new Arista<>(n13, n2, c5);
		
		ICable c6 = new Cable(75000, 80);
		IArista<IDivision> a6 = new Arista<>(n13, n8, c6);
		
		ICable c7 = new Cable(55000, 90);
		IArista<IDivision> a7 = new Arista<>(n2, n14, c7);
		
		ICable c8 = new Cable(42000, 10);
		IArista<IDivision> a8 = new Arista<>(n2, n4, c8);
		
		ICable c9 = new Cable(11000, 60);
		IArista<IDivision> a9 = new Arista<>(n2, n3, c9);
		
		ICable c10 = new Cable(90000, 20);
		IArista<IDivision> a10 = new Arista<>(n14, n4, c10);
		
		ICable c11 = new Cable(55000, 70);
		IArista<IDivision> a11 = new Arista<>(n14, n6, c11);
		
		ICable c12 = new Cable(48000, 70);
		IArista<IDivision> a12 = new Arista<>(n4, n6, c12);
		
		ICable c13 = new Cable(30000, 45);
		IArista<IDivision> a13 = new Arista<>(n4, n3, c13);
		
		ICable c14 = new Cable(38000, 30);
		IArista<IDivision> a14 = new Arista<>(n4, n5, c14);
		
		ICable c15 = new Cable(29000, 40);
		IArista<IDivision> a15 = new Arista<>(n8, n3, c15);
		
		ICable c16 = new Cable(81000, 10);
		IArista<IDivision> a16 = new Arista<>(n5, n6, c16);
		
		ICable c17 = new Cable(35000, 20);
		IArista<IDivision> a17 = new Arista<>(n8, n16, c17);
		
		ICable c18 = new Cable(60500, 50);
		IArista<IDivision> a18 = new Arista<>(n3, n16, c18);
		
		ICable c19 = new Cable(56000, 15);
		IArista<IDivision> a19 = new Arista<>(n3, n9, c19);
		
		ICable c20 = new Cable(90000, 25);
		IArista<IDivision> a20 = new Arista<>(n16, n9, c20);
		
		ICable c21 = new Cable(49000, 30);
		IArista<IDivision> a21 = new Arista<>(n9, n10, c21);
		
		ICable c22 = new Cable(78000, 35);
		IArista<IDivision> a22 = new Arista<>(n3, n7, c22);
		
		ICable c23 = new Cable(70000, 50);
		IArista<IDivision> a23 = new Arista<>(n5, n7, c23);
		
		ICable c24 = new Cable(67000, 60);
		IArista<IDivision> a24 = new Arista<>(n6, n7, c24);
		
		ICable c25 = new Cable(82300, 20);
		IArista<IDivision> a25 = new Arista<>(n6, n12, c25);
		
		ICable c26 = new Cable(55700, 10);
		IArista<IDivision> a26 = new Arista<>(n7, n12, c26);
		
		ICable c27 = new Cable(87000, 80);
		IArista<IDivision> a27 = new Arista<>(n12, n11, c27);
		
		ICable c28 = new Cable(12000, 90);
		IArista<IDivision> a28 = new Arista<>(n7, n11, c28);
		
		ICable c29 = new Cable(110000, 25);
		IArista<IDivision> a29 = new Arista<>(n7, n15, c29);
		
		ICable c30 = new Cable(90000, 50);
		IArista<IDivision> a30 = new Arista<>(n9, n15, c30);
		
		ICable c31 = new Cable(23350, 60);
		IArista<IDivision> a31 = new Arista<>(n10, n15, c31);
		
		ICable c32 = new Cable(66000, 45);
		IArista<IDivision> a32 = new Arista<>(n15, n11, c32);
		
		
		//finalmente las agregamos al grafo
		
		grafo.agregarArista(a32);
		grafo.agregarArista(a31);
		grafo.agregarArista(a30);
		grafo.agregarArista(a29);
		grafo.agregarArista(a28);
		grafo.agregarArista(a27);
		grafo.agregarArista(a26);
		grafo.agregarArista(a25);
		grafo.agregarArista(a24);
		grafo.agregarArista(a23);
		grafo.agregarArista(a22);
		grafo.agregarArista(a21);
		grafo.agregarArista(a20);
		grafo.agregarArista(a19);
		grafo.agregarArista(a18);
		grafo.agregarArista(a17);
		grafo.agregarArista(a16);
		grafo.agregarArista(a15);
		grafo.agregarArista(a14);
		grafo.agregarArista(a13);
		grafo.agregarArista(a12);
		grafo.agregarArista(a11);
		grafo.agregarArista(a10);
		grafo.agregarArista(a9);
		grafo.agregarArista(a8);
		grafo.agregarArista(a7);
		grafo.agregarArista(a6);
		grafo.agregarArista(a5);
		grafo.agregarArista(a4);
		grafo.agregarArista(a3);
		grafo.agregarArista(a2);
		grafo.agregarArista(a1);
		
		
		
		
		
        //setteamos la ponderacion del costo y del riesgo para todo el grafo segun lo que quiere el gobierno
		grafo.setParametrosPeso(0.1); //recordemos que B se calcula a partir de A. Aca vemos que el gobierno le asigna un 10%de importancia a lo economico, y 90% a lo seguro
		
		List<IArista<IDivision>> mst = grafo.kruskal();
		
		System.out.println("=== Árbol de Expansión Mínima (MST) ===");

		for (IArista<IDivision> arista : mst) {
		    System.out.println(arista);
		}


	}

}
