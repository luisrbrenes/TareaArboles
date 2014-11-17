

package logic;

public class NodoAvl <T extends Comparable<T>>{
    private NodoAvl<T> nodoIzq;
    private NodoAvl<T> nodoDer;
    private T dato;              
    private int altura;                   

    public NodoAvl<T> getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(NodoAvl<T> nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public NodoAvl<T> getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(NodoAvl<T> nodoDer) {
        this.nodoDer = nodoDer;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Constructores
    public NodoAvl(T dato ){
        this.dato=dato;
        this.nodoDer=null;
        this.nodoIzq=null;
        
    }

    public NodoAvl( T dato, NodoAvl izq, NodoAvl der ){
        this.dato = dato;
        this.nodoIzq = izq;
        this.nodoDer = der;
        altura = 0;               
    }
}
