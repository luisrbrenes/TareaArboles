package splay;

/**
 *
 * @author luisrbrenes
 */
public class SplayTreeNode{

    public SplayTreeNode gethIzq() {
        return hIzq;
    }

    public void sethIzq(SplayTreeNode hIzq) {
        this.hIzq = hIzq;
    }

    public SplayTreeNode gethDer() {
        return hDer;
    }

    public void sethDer(SplayTreeNode hDer) {
        this.hDer = hDer;
    }

    public SplayTreeNode getPadre() {
        return Padre;
    }

    public void setPadre(SplayTreeNode padre) {
        this.Padre = padre;
    }

    public int getData() {
        return Data;
    }

    public void setData(int getData) {
        this.Data = getData;
    }
     
    private SplayTreeNode hIzq;
    private SplayTreeNode hDer;
    private SplayTreeNode Padre;
    private int Data;

 

     // Constructor

     public SplayTreeNode(){

         this(0, null, null, null);
     }          

     // Constructor

     public SplayTreeNode(int ele){
         this.Data=ele;
         this.hIzq=null;
         this.Padre=null;
         this.hDer=null;
     } 

     // Constructor

     public SplayTreeNode(int ele, SplayTreeNode left, SplayTreeNode right, SplayTreeNode parent){
         this.hIzq = left;
         this.hDer = right;
         this.Padre = parent;
         this.Data = ele;         
     }    
 }