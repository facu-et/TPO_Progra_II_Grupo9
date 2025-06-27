package modelo;

import interfaces.IDivision;


public class Division implements IDivision {
	
	private String nombre;

    public Division(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
	public String toString() {
		return "Division [nombre=" + nombre + "]";
	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Division otra)) return false;
        return nombre.equals(otra.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

}
