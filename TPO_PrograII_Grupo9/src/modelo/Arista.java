package modelo;

import interfaces.IArista;
import interfaces.ICable;
import interfaces.INodo;


public class Arista<T> implements IArista<T> {
	
	private INodo<T> origen;
    private INodo<T> destino;
    private ICable cable;

    public Arista(INodo<T> origen, INodo<T> destino, ICable cable) {
        this.origen = origen;
        this.destino = destino;
        this.cable = cable;
    }

    @Override
    public INodo<T> getOrigen() {
        return origen;
    }

    @Override
    public INodo<T> getDestino() {
        return destino;
    }

    @Override
    public ICable getCable() {
        return cable;
    }

    @Override
    public double getPeso(double A, double B) {
        return cable.calcularPeso(A, B);
    }

	@Override
	public String toString() {
		return origen + " <-> " + destino + " | " + cable;

	}

    
}