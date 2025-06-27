package modelo;

import interfaces.ICable;


public class Cable implements ICable {
	
	private int costo; //el costo en dolares estadounidenses de instalar ese cable
	private int riesgo; //el "riesgo" o nivel de inseguridad que tiene ese cable, debido a factores como proximidad con los limites del establecimiento
	                    // y/o necesidad de instalarlo mas cerca de la superficie (lo que implica menos seguridad) por cuestiones topograficas/geologicas
	
	
	//construye el cable con ambos parametros, fundamentalmente por la validacion del rango del riesgo. Si yo construyera el cable sin ese parametro,
	//el setter no lo validaria. Preferimos que el cable sea inmutable una vez creado, asi se evitan posibles errores logicos en tiempo de ejecucion
	public Cable(int costo, int riesgo) {//abre constructor
        this.costo = costo;
        this.riesgo = riesgo;
    }//cierra constructor
	
	@Override
    public int getCosto() {
        return costo;
    }

    @Override
    public int getRiesgo() {
        return riesgo;
    }
    
    
    //calcula el peso total del cable con la formula [peso = A*costo + B*riesgo], donde A representa la ponderacion del COSTO y B la del RIESGO, segun las
    //prioridades que determine el gobierno. A y B estan entre 0 y 1 (incluidos), y a su vez la suma de ambos es 1. Por ejemplo: si A = 0.8, B=0.2. Esta
    //validacion es realizada por la Clase Grafo, cuando se hace setParametrosPeso(A)
    public double calcularPeso(double A, double B) {
        return A * costo + B * riesgo;
    }

	@Override
	public String toString() {
		return "Cable [costo=" + costo + ", riesgo=" + riesgo + "]";
	}
    
    

}
