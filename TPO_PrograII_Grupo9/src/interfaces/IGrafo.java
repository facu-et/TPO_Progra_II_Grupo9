package interfaces;

import java.util.List;

public interface IGrafo<T> {
	
	void setParametrosPeso(double A);

    void agregarArista(IArista<T> arista);

    List<IArista<T>> kruskal();
    
    //Notar que Union Find no esta en la interfaz. Esto se debe a que union find es auxiliar para kruskal, del mismo modo que en el TP3 la funcion dfsRecursiva
    //era auxuliar para el recorrido dfs. Ponerlas en la interfaz violaria el encapsulamiento. dfsRec era privada para dfs, UnionFind es privada para kruskal.

}
