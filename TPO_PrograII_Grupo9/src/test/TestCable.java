package test;

import interfaces.ICable;
import modelo.Cable;

public class TestCable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICable c1 = new Cable(80000, 50);
		
		
		//getter del costo
		System.out.println(c1.getCosto()); //80000
		
		
		//---------------------------------------------------------
		ICable c2 = new Cable(50000, 40);
		
		//getter del riesgo
		System.out.println(c2.getRiesgo()); //40
		
		System.out.println(c1.calcularPeso(0.3, 0.7)); //Esperado: 24035.0

	}

}
