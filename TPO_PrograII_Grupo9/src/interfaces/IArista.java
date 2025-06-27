package interfaces;


public interface IArista<T> {
	
	INodo<T> getOrigen();
	INodo<T> getDestino();
	ICable getCable();

	double getPeso(double A, double B);
	 
}