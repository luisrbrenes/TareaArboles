package splay;
/**
 *
 * @author luisrbrenes
 */

 public class SplayTree extends SplayTreeNode{

    SplayTreeNode root;
     
     // Constructor 

     public SplayTree(){
         root = null;
     }

 
     // Inserta un nuevo elemento

     public void insert(int ele){

         SplayTreeNode z = root;
         SplayTreeNode p = null;

         while (z != null){
             p = z;
             if (ele < p.getData())
                 z = z.gethDer();
             else
                 z = z.gethIzq();     
         }

         z = new SplayTreeNode();

         z.setData(ele);

         z.setPadre(p);

         if (p == null)

             root = z;

         else if (ele < p.getData())

             p.sethDer(z);

         else

             p.sethIzq(z);

         Splay(z);

     }

     // Rotacion hacia la derecha

     public void rotacionDerecha(SplayTreeNode c, SplayTreeNode p){

         if ((c == null) || (p == null) || (p.gethIzq() != c) || (c.getPadre() != p))

             throw new RuntimeException("WRONG");

 

         if (p.getPadre() != null){

             if (p == p.getPadre().gethIzq())

                 p.getPadre().sethIzq(c);

             else 

                 p.getPadre().sethDer(c);

         }

         if (c.gethDer() != null)
             c.gethDer().setPadre(p);

         c.setPadre(p.getPadre());

         p.setPadre(c);

         p.sethIzq(c.gethDer());

         c.sethDer(p);

     }

 

     //Rotacion hacia la derecha

     public void rotacionIzquierda(SplayTreeNode c, SplayTreeNode p){

         if ((c == null) || (p == null) || (p.gethDer() != c) || (c.getPadre() != p))

             throw new RuntimeException("WRONG");

         if (p.getPadre() != null){

             if (p == p.getPadre().gethIzq())

                 p.getPadre().sethIzq(c);

             else

                 p.getPadre().sethDer(c);

         }

         if (c.gethIzq() != null)

             c.gethIzq().setPadre(p);

         c.setPadre(p.getPadre());

         p.setPadre(c);

         p.sethDer(c.gethIzq());

         c.sethIzq(p);

     }

 

     // funcion splay

     private void Splay(SplayTreeNode x){

         while (x.getPadre() != null){

             SplayTreeNode Parent = x.getPadre();

             SplayTreeNode GrandParent = Parent.getPadre();

             if (GrandParent == null){

                 if (x == Parent.gethIzq())

                     rotacionDerecha(x, Parent);

                 else

                     rotacionIzquierda(x, Parent);                 

             } 

             else{

                 if (x == Parent.gethIzq()){

                     if (Parent == GrandParent.gethIzq()){

                         rotacionDerecha(Parent, GrandParent);

                         rotacionDerecha(x, Parent);

                     }

                     else{

                         rotacionDerecha(x, x.getPadre());

                         rotacionIzquierda(x, x.getPadre());

                     }

                 }

                 else {

                     if (Parent == GrandParent.gethIzq()){

                         rotacionIzquierda(x, x.getPadre());

                         rotacionDerecha(x, x.getPadre());

                     } 

                     else {

                         rotacionIzquierda(Parent, GrandParent);

                         rotacionIzquierda(x, Parent);

                     }

                 }

             }

         }

         root = x;

     }

 

     // Remueve un elemento seleccionado

     public void remove(int ele){

         SplayTreeNode node = findNode(ele);

        remove(node);

     }
     
     // Funcion que remueve un elemento

     private void remove(SplayTreeNode node){

         if (node == null)

             return;

 

         Splay(node);

         if( (node.gethIzq() != null) && (node.gethDer() !=null)){ 

             SplayTreeNode min = node.gethIzq();

             while(min.gethDer()!=null)

                 min = min.gethDer();

 

             min.sethDer(node.gethDer());

             node.gethDer().setPadre(min);

             node.gethIzq().setPadre(null);

             root = node.gethIzq();

         }

         else if (node.gethDer() != null){

             node.gethDer().setPadre(null);

             root = node.gethDer();

         } 

         else if( node.gethIzq() !=null){

             node.gethIzq().setPadre(null);

             root = node.gethIzq();

         }

         else{

             root = null;

         }

         node.setPadre(null);

         node.sethIzq(null);

         node.sethDer(null);
     }

     // Metodos para buscar un elemento

     public boolean search(int val){

         return findNode(val) != null;

     }

     private SplayTreeNode findNode(int ele){

         SplayTreeNode z = root;

         while (z != null){

             if (ele < z.getData())

                 z = z.gethDer();

             else if (ele > z.getData())

                 z = z.gethIzq();

             else

                 return z;

         }

         return null;

     }

 

     // Recorrido del arbol Inorden

     public void inorden(){

        inorden(root);

     }
     
     private void inorden(SplayTreeNode r){

         if (r != null) {

             SplayTree.this.inorden(r.gethIzq());

             System.out.print(r.getData() +" ");

             SplayTree.this.inorden(r.gethDer());

         }

     }

 

     // Recorrido del arbol en preorden

     public void preorden(){

         preorden(root);

     }

     private void preorden(SplayTreeNode r){

         if (r != null){

             System.out.print(r.getData() +" ");

             preorden(r.gethIzq());             

             preorden(r.gethDer());

         }

     }

 

     // Recorrido del arbol en postorden

     public void postorden(){

         postorden(root);

     }

     private void postorden(SplayTreeNode r){

         if (r != null){

             postorden(r.gethIzq());             

             postorden(r.gethDer());

             System.out.print(r.getData() +" ");

         }

     }     

 }

 

 