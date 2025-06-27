package modelo;

import interfaces.INodo;


public class Nodo<T> implements INodo<T>{
	
	private T valor;

    public Nodo(T valor) {
        this.valor = valor;
    }

    @Override
    public T getValor() {
        return valor;
    }

    @Override
    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Nodo<?> otro)) return false;
        return valor.equals(otro.valor);
    }

    @Override
    public int hashCode() {
        return valor.hashCode();
    }
}