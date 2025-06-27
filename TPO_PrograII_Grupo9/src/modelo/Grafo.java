package modelo;

import java.util.*;

import interfaces.IArista;
import interfaces.IGrafo;
import interfaces.INodo;

public class Grafo<T> implements IGrafo<T> {
	
	

	//atributos
	private Set<INodo<T>> nodos = new HashSet<>();
    private List<IArista<T>> aristas = new ArrayList<>();
    private double A;
    private double B;
    
    //constructor vacio
    public Grafo() {
		super();
	}

    public Set<INodo<T>> getNodos() {
		return nodos;
	}

	public void setNodos(Set<INodo<T>> nodos) {
		this.nodos = nodos;
	}

	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public double getB() {
		return B;
	}

	public void setB(double b) {
		B = b;
	}

	public List<IArista<T>> getAristas() {
		return aristas;
	}

	public void setAristas(List<IArista<T>> aristas) {
		this.aristas = aristas;
	}

	@Override
	public String toString() {
		return "Grafo [nodos=" + nodos + ", aristas=" + aristas + ", A=" + A + ", B=" + B + "]";
	}

	//constructor con nodos y aristas
    public Grafo(Set<INodo<T>> nodos, List<IArista<T>> aristas) {
		super();
		this.nodos = nodos;
		this.aristas = aristas;
	}

	@Override
    public void setParametrosPeso(double A) {
        if (A < 0 || A > 1) throw new IllegalArgumentException("A debe estar entre 0 y 1"); //B tambien, pero en este codigo B depende logicamente de A
        this.A = A;
        this.B = 1 - A;
    }

    

    @Override
    public void agregarArista(IArista<T> arista) {
        nodos.add(arista.getOrigen());
        nodos.add(arista.getDestino());
        aristas.add(arista);
    }




    @Override
    public List<IArista<T>> kruskal() {//abre kruskal


    	List<IArista<T>> resultado = new ArrayList<>();
        List<IArista<T>> listaOrdenada = new ArrayList<>(aristas);
        listaOrdenada.sort(Comparator.comparingDouble(a -> a.getPeso(A, B)));

        UnionFind<INodo<T>> uf = new UnionFind<>();
        uf.makeSet(nodos);

        for (IArista<T> a : listaOrdenada) {
            INodo<T> u = a.getOrigen();
            INodo<T> v = a.getDestino();
            if (!uf.find(u).equals(uf.find(v))) {
                resultado.add(a);
                uf.union(u, v);
            }
        }
        return resultado;
    }

    //clase auxiliar privada para Kruskal
    private static class UnionFind<T> {//abre union find
        private Map<T, T> padre = new HashMap<>();

        public void makeSet(Collection<T> elementos) {
            for (T e : elementos) padre.put(e, e);
        }

        public T find(T x) {
            if (!padre.get(x).equals(x))
                padre.put(x, find(padre.get(x)));
            return padre.get(x);
        }

        public void union(T x, T y) {
            padre.put(find(x), find(y));
        }
    }//cierra unionfind

}
