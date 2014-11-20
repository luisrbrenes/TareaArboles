
package AVL;

import logic.AVLNode;

/**
 * clase del arbol avl.
 *
 * @param <T> 
 */
public class AVL <T extends Comparable<T>>{
    private AVLNode raiz; 

    /**
     * constructor
     */
    public AVL(){
        this.raiz=null;
    }
    /**
     * constructor
     * @param raiz 
     */
    public AVL(AVLNode raiz){
        this.raiz=raiz;
    }
     
    /**
     * metodo insertar nuevo dato.
     * @param nuevo 
     */
    public void insertar( T nuevo ){
        this.raiz = insertar(nuevo,raiz );
    }

    /**
     * 
     * @param pdato
     * @param pnodo
     * @return insercion de nodo
     */
    public AVLNode insertar( T pdato, AVLNode pnodo ){
        Integer data=(Integer)pdato;//se hace casting a pdato como integer.
        if( pnodo == null )
            pnodo = new AVLNode( pdato, null, null );//nodo nuevo para el arbol.
        
        else 
            if(data.compareTo((Integer)pnodo.getDato() ) < 0 ) {//si el dato parametro es menor al dato del nodo pnodo.
                pnodo.setNodoIzq(insertar( (T) data, pnodo.getNodoIzq()));
            if( altura( pnodo.getNodoIzq() ) - altura( pnodo.getNodoDer() ) == 2 )
                if( data.compareTo((Integer) pnodo.getNodoIzq().getDato() ) < 0 )//si data es menor al subarbol izquierdo de pnodo
                    pnodo = rotarIzq(pnodo); //rotacion a la izquierda
                else
                    pnodo = rotacionDobleIzq(pnodo);//rotacion doble a la izquierda.
        }
        else if( data.compareTo( (Integer)pnodo.getDato()) > 0 ) {//si el dato parametro es mayor al dato del nodo pnodo.
                pnodo.setNodoDer(insertar( (T) data, pnodo.getNodoDer() ));
                
            if(altura(pnodo) - altura( pnodo.getNodoIzq()) == 2 )
                if( data.compareTo( (Integer)pnodo.getNodoDer().getDato()) > 0 )//si data es mayor al subarbol izquierdo de pnodo
                    pnodo = rotacionDer( pnodo ); //rotacion a la derecha
                else
                    pnodo = rotacionDobleDer( pnodo ); //rotacion izquierda
        }
        else{}
        
      
        return pnodo;
    }
    
    /**
     * 
     * @param num
     * @param num2
     * @return maximo entre dos numeros
     */
    public int max( int num, int num2 ){
        int a=0;
        if(num>num2)//si num es mayor a num2
            a=num;
        else if(num<num2)//si num es menor a num2
                a=num2;   
        else if(num==num2)//si num es igual a num2
                a=num;
           
        return a;
    }

    /**
     * 
     * @param pnodo
     * @return nodo de rotacion a la izquierda
     */
    public AVLNode rotarIzq( AVLNode pnodo ){
        AVLNode nodo = pnodo.getNodoIzq(); //nodo se define como el subarbol izquierdo del parametro
        pnodo.setNodoIzq(nodo.getNodoDer());//setea el nodo izq 
        nodo.setNodoDer(pnodo);//setea el nodo derecho como pnodo
        pnodo.setAltura(max( altura(pnodo.getNodoIzq()), altura(pnodo.getNodoDer())) + 1);//setea la altura
        nodo.setAltura(max( altura( nodo.getNodoIzq() ), pnodo.getAltura() ) + 1);
        
        return nodo;
    }

    /**
     * 
     * @param pnodo
     * @return rotacion a la derecha
     */
    public  AVLNode rotacionDer( AVLNode pnodo ){
        AVLNode nodo = pnodo.getNodoDer(); //nodo se define como el subarbol derecho del parametro
        pnodo.setNodoDer(nodo.getNodoIzq());//setea el nodo derecho
        nodo.setNodoIzq(pnodo); //setea nodo izquierda.
        pnodo.setAltura(max(altura(pnodo.getNodoIzq()), altura(pnodo.getNodoDer()) ) + 1);
        nodo.setAltura(max(altura( nodo.getNodoDer() ), pnodo.getAltura() ) + 1);
        
        return nodo;
    }

    /**
     * 
     * @param nodo
     * @return rotacion doble hacia la izquierda
     */
    public  AVLNode rotacionDobleIzq( AVLNode nodo ){
        nodo.setNodoIzq(rotacionDer( nodo.getNodoIzq() ));//setea el nodoizq como la rotacion derecha del subarbol izquierdo del parametro
       
        return rotarIzq( nodo );
    }

    /**
     * 
     * @param nodo
     * @return rotacion doble a la derecha
     */
    public  AVLNode rotacionDobleDer( AVLNode nodo ){
        nodo.setNodoDer(rotarIzq( nodo.getNodoDer()));//setea nodo derecho del parametro como la  rotacion izquierda del nodo derecho.
       return rotacionDer( nodo);
    }

    /**
     * 
     * @param pnodo
     * @return la altura del arbol
     */
    public int altura( AVLNode pnodo ){
        return pnodo == null ? -1 : pnodo.getAltura();// recorre el arbol y devuelve la altura.
    }

    /**
    * @param pdato
    * @return boolean encontrado.
    */  
   public boolean buscar(T pdato) {
        Comparable dato = (Comparable) pdato;
        if (raiz == null)//si es nulo devuelve falso
                return false;
        else {
            AVLNode root = raiz;
            while (root != null) {//va recorriendo los nodos hasta encontrarlo.
                    if (dato.compareTo(root.getDato())==0)
                            return true;
                    else if (dato.compareTo(root.getDato())<0)
                            root = root.getNodoIzq();
                    else
                            root = root.getNodoDer();
            }
            return false;
        }
    }
   
  
    /**
     * prints preorden
     */
     public void PreOrden(){
        imprimirPreOrden(raiz);
    }
    /**
     * imprime el arbol en preorden.
     * @param raiz_arbol 
     */
     private void imprimirPreOrden (AVLNode raiz_arbol)//preorden(raiz-izquierdo-derecho.
      {   //BinaryNode raiz_arbol=raiz;
         if (raiz_arbol != null)
          {
              System.out.print(raiz_arbol.getDato() + " ");
              imprimirPreOrden (raiz_arbol.getNodoIzq());
              imprimirPreOrden (raiz_arbol.getNodoDer());
          }
      }
     
     public void InOrden(){
        imprimirInorden(raiz);
    }
     private void imprimirInorden (AVLNode raiz_arbol)//preorden(izquierdo-raiz-derecho.
      {   //BinaryNode raiz_arbol=raiz;
         if(raiz_arbol != null) 
          {
              imprimirInorden(raiz_arbol.getNodoIzq());
              System.out.print(raiz_arbol.getDato() + " ");
              imprimirInorden(raiz_arbol.getNodoDer());
          }
      }
     
     public void PostOrden(){
        imprimirPostorden(raiz);
    }
     
      private void imprimirPostorden (AVLNode raiz_arbol)//postorden(izquierdo-derecho-raiz.
      {  // BinaryNode raiz_arbol=raiz
         if (raiz_arbol != null)
          {
              imprimirPostorden (raiz_arbol.getNodoIzq());
              imprimirPostorden (raiz_arbol.getNodoDer());
              System.out.print(raiz_arbol.getDato() + " ");
          }
      }

  
}
