

package logic;

public class AVLNode <T extends Comparable<T>>{
    private AVLNode<T> nodoIzq;
    private AVLNode<T> nodoDer;
    private T dato;              
    private int altura;                   

    public AVLNode<T> getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(AVLNode<T> nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public AVLNode<T> getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(AVLNode<T> nodoDer) {
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
    public AVLNode(T dato ){
        this.dato=dato;
        this.nodoDer=null;
        this.nodoIzq=null;
        
    }

    public AVLNode( T dato, AVLNode izq, AVLNode der ){
        this.dato = dato;
        this.nodoIzq = izq;
        this.nodoDer = der;
        altura = 0;               
    }
}
