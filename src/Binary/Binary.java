
package Binary;

public class Binary <T extends Comparable<T>> {
    private BinaryNode raiz;
    
    /**
     * constructor sin argumentos
     * @return 
     */
    public Binary(){ 
        this.raiz=null;
    }
    
     /**
     * 
     * @return raiz
     */
    public BinaryNode getRaiz() {
        return raiz;
    }
    
    /**
     * setea raiz
     * @param raiz 
     */
    public void setRaiz(BinaryNode raiz) {
        this.raiz = raiz;
    }
    
    /**
     * contructor con argumento raiz
     * @param raiz 
     Binary  public Arbol(BinaryNode<T> raiz){
        this.raiz=raiz;
    }
  
    /**
     * inserta nodo
     * @param nuevo 
     */
    public void insertarNodo(T nuevo) {
        if (raiz == null)
            raiz = new BinaryNode(nuevo); // crea el nodo raiz 
        else
            raiz.insertar(nuevo); // llama al metodo insertar
    }  
    
   /**
    * @param pdato
    * @return boolean encontrado.
    */  
   public boolean buscar(T pdato) {
        Comparable dato = (Comparable) pdato;
        if (raiz == null)
                return false;
        else {
            BinaryNode root = raiz;
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
   * 
   * @param pdato
   * elimina dato del arbol. 
   */ 
  public void eliminar(T pdato){
        Comparable dato = (Comparable)pdato;//hace al dato de tipo comparable.
        //Se definen el nodoantecesor y el nodo a eliminar.    
        BinaryNode antecesor=null;//antecesor del nodo a eliminar
        BinaryNode raiz_aux = raiz;
        while (raiz_aux != null) { //va recorriendo los nodos desde la raiz.                
                if (dato.compareTo(raiz_aux.getDato())==0){
                        break;
                } 
                antecesor = raiz_aux;
                if (dato.compareTo(raiz_aux.getDato())<0)
                        raiz_aux = raiz_aux.getNodoIzq();
                else
                    raiz_aux = raiz_aux.getNodoDer();                        
        }                
        if (raiz_aux==null)
            return; //dato no encontrado

        if(raiz_aux.getNodoIzq()==null)
                if (raiz_aux.getDato().compareTo(antecesor.getDato())<0)
                        antecesor.setNodoIzq(raiz_aux.getNodoDer());
                else
                        antecesor.setNodoDer(raiz_aux.getNodoDer());
        else if (raiz_aux.getNodoDer()==null)
                if (raiz_aux.getDato().compareTo(antecesor.getDato())<0)
                    antecesor.setNodoIzq(raiz_aux.getNodoIzq());
                else
                    antecesor.setNodoDer(raiz_aux.getNodoIzq());
                
        //El nodo a eliminar tiene rama izquierda y derecha
        MayorIzquierdo(raiz_aux);
        
        raiz_aux=null;
        
}
        /**
         * Reemplaza el nodo actual, por el datomayor de la rama izquierda
         * @param act nodo actual o nodo a eliminar que tiene rama izquierda y derecha
         */
       private void MayorIzquierdo(BinaryNode actual){//Buscar el datomayor de los menores.
        BinaryNode datomayor=actual;
        BinaryNode anterior = actual;
        datomayor = actual.getNodoIzq();//anterior es el anteriorecesor de datomayor.anterior es el padre.
            while(datomayor.getNodoDer()!=null){//busca el elemento.
                    anterior = datomayor;
                    datomayor=datomayor.getNodoDer();
            }
            actual.setDato(datomayor.getDato());//reemplaza el dato.
            if(anterior==actual)
                    anterior.setNodoIzq(datomayor.getNodoIzq());
            else
                    anterior.setNodoDer(datomayor.getNodoIzq());
        }

  
    public void PreOrden(){
        imprimirPreOrden(raiz);
    }
    /**
     * imprime el arbol en preorden.
     * @param raiz_arbol 
     */
     private void imprimirPreOrden (BinaryNode raiz_arbol)//preorden(raiz-izquierdo-derecho.
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
     private void imprimirInorden (BinaryNode raiz_arbol)//preorden(izquierdo-raiz-derecho.
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
     
      private void imprimirPostorden (BinaryNode raiz_arbol)//postorden(izquierdo-derecho-raiz.
      {  // BinaryNode raiz_arbol=raiz;
         if (raiz_arbol != null)
          {
              imprimirPostorden (raiz_arbol.getNodoIzq());
              imprimirPostorden (raiz_arbol.getNodoDer());
              System.out.print(raiz_arbol.getDato() + " ");
          }
      }
}
