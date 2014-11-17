
package logic;
import java.util.Objects;

public class BinaryNode <T extends Comparable<T>>{
    /**
     * Se definen los atributos del nodo.
     */
    private BinaryNode<T> nodoIzq;
    private BinaryNode<T> nodoDer;
    private T dato;
    BinaryNode<T> padre;


    public BinaryNode(T dato){
        this.dato = dato;
        this.nodoIzq =this.nodoDer= null;
    }
   
    /**
     * constructor
     */
    public BinaryNode(){
        this.nodoIzq =this.nodoDer= null;
        this.dato = null;
    }
    /**
     * constructor
     * @param nodoIzq
     * @param nodoDer
     * @param dato 
     */
    public BinaryNode(BinaryNode nodoIzq, BinaryNode nodoDer, T dato) {
        this.nodoIzq = nodoIzq;
        this.nodoDer = nodoDer;
        this.dato = dato;
    }
    
    /**
     * constructor
     * @param padre
     * @param dato 
     */
    public BinaryNode(BinaryNode<T> padre,T dato){
        this.dato=dato;
        this.padre=padre;
    }
    
    /**
     * 
     * @return padre
     */
     public BinaryNode<T> getPadre() {
        return padre;
    }

     /**
      * set padre
      * @param padre 
      */
    public void setPadre(BinaryNode<T> padre) {
        this.padre = padre;
    }
    
    /**
     * 
     * @return nodo izquierdo.
     */
    public BinaryNode getNodoIzq() {
        return nodoIzq;
    }

    /**
     * sets nodo izquierdo.
     * @param nodoIzq 
     */
    public void setNodoIzq(BinaryNode nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    /**
     * 
     * @return nodo derecho.
     */
    public BinaryNode getNodoDer() {
        return nodoDer;
    }

    /**
     * sets nodo derecho.
     * @param nodoDer 
     */
    public void setNodoDer(BinaryNode nodoDer) {
        this.nodoDer = nodoDer;
    }
    /**
     * 
     * @return dato del nodo.
     */
    public T getDato() {
        return dato;
    }
    /**
     * sets el dato del nodo.
     * @param dato 
     */
    public void setDato(T dato) {
        this.dato = dato;
    }
              
    
   
     
    /**
     * inserta el dato en el arbol.
     * @param pdato 
     */
    public void insertar(T pdato){  
        if(pdato.compareTo(dato)==-1){
            if (nodoIzq == null)//subarbol izquierdo es nulo.
                nodoIzq = new BinaryNode(this,pdato);
            else // sigue recorriendo el arbol.
                nodoIzq.insertar(pdato);
        }
        else if (pdato.compareTo(dato) == 1){ // inserta en el subarbol derecho {
            if (nodoDer == null) // inserta nuevo BinaryNode
                nodoDer = new BinaryNode(this,pdato);
            else // continua recorriendo el subarbol derecho
                nodoDer.insertar(pdato);
        }
      
    }
    
    
    

    
}
