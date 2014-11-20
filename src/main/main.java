package main;
import Binary.Binary;
import AVL.AVL;
import RedBlack.RedBlack;
import Splay.SplayTree;
import java.util.Scanner;
import Splay.RandomGeneratorSplay;
import Splay.SplayTree;
    

public class main {

     public static void main(String[] args){   //casos de prueba.   
        Binary binarytree=new Binary();//instancias.
        AVL avltree=new AVL();
        RedBlack redblack=new RedBlack();
        SplayTree splaytree=new SplayTree();
        //casos de prueba arbol binario de busqueda.
        System.out.println("1. Arbol binario de busqueda");
        binarytree.insertarNodo(5);//inserciones en el arbol
        binarytree.insertarNodo(56);
        binarytree.insertarNodo(23);
        binarytree.insertarNodo(12);
        System.out.println("Inorden: \t");//impresiones en inorden,postorden y preorden
        binarytree.InOrden();
        System.out.println("\t");
        System.out.println("postorden: \t");
        binarytree.PostOrden();
        System.out.println("\t");
        System.out.println("preorden: \t");
        binarytree.PreOrden();
        System.out.println("\t");
         System.out.println("\t");
        int ele=12;
        int ele2=45;
        System.out.println("buscar:"+ele);//busquedas
        System.out.println(binarytree.buscar(ele));
         System.out.println("\t");
        System.out.println("buscar:"+ele2);
        System.out.println(binarytree.buscar(ele2));
         System.out.println("eliminaciones:");//eliminaciones
         System.out.println("\t");
        
            System.out.println("eliminar 23");
            binarytree.eliminar(23);
            binarytree.InOrden();
            System.out.println("\t");
            System.out.println("eliminar 56");
            binarytree.eliminar(56);
            binarytree.InOrden();
            System.out.println("\t");
        //////////////////////////////////////////////////////////////////////////   
        //////////////////////////////////////////////////////////////////////////
            
        //casos de prueba arbol avl.
        System.out.println("1. Arbol Avl");//inserciones
        avltree.insertar(5);
        avltree.insertar(56);
        avltree.insertar(23);
        avltree.insertar(12);
        System.out.println("Inorden: \t");//impresiones en inorden,postorden y preorden
        avltree.InOrden();
        System.out.println("\t");
        System.out.println("postorden: \t");
        avltree.PostOrden();
        System.out.println("\t");
        System.out.println("preorden: \t");
        avltree.PreOrden();
        System.out.println("\t");
         System.out.println("\t");
        int elementoavl=12;
        int elementoavl2=45;
        System.out.println("buscar:"+elementoavl);//busquedas
        System.out.println(avltree.buscar(elementoavl));
         System.out.println("\t");
        System.out.println("buscar:"+ele2);
        System.out.println(avltree.buscar(ele2));
         System.out.println("eliminaciones:");//eliminaciones de elementos
         System.out.println("\t");
        
            System.out.println("eliminar 23");
            //avltree.eliminar(23);
            avltree.InOrden();
            System.out.println("\t");
            System.out.println("eliminar 56");
           // avltree.eliminar(56);
            avltree.InOrden();
            System.out.println("\t"); 
            //////////////////////////////////////////////////////////////////////////   
        //////////////////////////////////////////////////////////////////////////
            
        //casos de prueba arbol splay.
        System.out.println("1. Arbol splay");
        splaytree.insert(5);//inserciones
        splaytree.insert(56);
        splaytree.insert(23);
        splaytree.insert(12);
        System.out.println("Inorden: \t");//impresiones en inorden,postorden y preorden
        splaytree.inorden();
        System.out.println("\t");
        System.out.println("postorden: \t");
        splaytree.postorden();
        System.out.println("\t");
        System.out.println("preorden: \t");
        splaytree.preorden();
        System.out.println("\t");
         System.out.println("\t");
        int elementosplay=12;
        int elementosplay2=45;
        System.out.println("buscar:"+elementosplay);//busquedas
        System.out.println(splaytree.search(elementosplay));
         System.out.println("\t");
        System.out.println("buscar:"+elementosplay2);
        System.out.println(splaytree.search(elementosplay2));
        
         System.out.println("eliminaciones:");//eliminacion de elementos.
         System.out.println("\t");
        
            System.out.println("eliminar 23");
            splaytree.remove(23);
            splaytree.inorden();
            System.out.println("\t");
            System.out.println("eliminar 56");
            splaytree.remove(56);
            splaytree.inorden();
            
            
            
        /*//Se crean las instancias
        Scanner scan = new Scanner(System.in);      
        RandomGeneratorSplay aleatorio = new RandomGeneratorSplay();
        System.out.println("Bienvenido\n");          
        char ch;
        // Se selecciona el tipo de arbol con el que se quiere trabajar 
        do {
            System.out.println("\nSeleccione el tipo de arbol con el que desea trabajar\n");
            System.out.println("1. Arbol binario de busqueda");
            System.out.println("2. Arbol AVL ");
            System.out.println("3. Arbol Splay");
            System.out.println("4. Arbol Rojinegro\n" + "");

            int choice = scan.nextInt();            

            switch (choice){

            case 1 : 

                System.out.println("\nArbol Binario de busqueda\n1.Buscar\n2.Insertar\n3.Ordenar\n");  
                int choice1 = scan.nextInt();            
                switch (choice1)
                {
                    case 1:
                        System.out.println("Buscar");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");
                        int cuantos = scan.nextInt();
                        System.out.println("Seleccione el numero a buscar");
                        int buscar = scan.nextInt();
                        aleatorio.randomBuscarSplay(cuantos,buscar);            
                        break;                    
                    case 2:
                        System.out.println("Insertar");
                        System.out.println("Buscar");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");
                        int cuantos2 = scan.nextInt();
                        System.out.println("Seleccione el numero a insertar");
                        int ainsertar = scan.nextInt();
                        aleatorio.randomInsertarSplay(cuantos2, ainsertar);                
                        break;                       
                    case 3: 
                        System.out.println("Ordenar\n");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");                       
                        aleatorio.randomOrdenar(scan.nextInt());
                        break;
                }
                break;

            case 2 : 
                System.out.println("\nArbol AVL\n1.Buscar\n2.Insertar\n3.Ordenar\n");      
                int choice2 = scan.nextInt();            
                switch (choice2){
                    case 1:
                        System.out.println("Buscar");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");
                        int cuantos = scan.nextInt();
                        System.out.println("Seleccione el numero a buscar");
                        int buscar = scan.nextInt();
                        aleatorio.randomBuscarSplay(cuantos,buscar);  
                        break;
                        
                    case 2:
                        System.out.println("Insertar");
                        System.out.println("Buscar");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");
                        int cuantos2 = scan.nextInt();
                        System.out.println("Seleccione el numero a insertar");
                        int ainsertar = scan.nextInt();
                        aleatorio.randomInsertarSplay(cuantos2, ainsertar);                  
                        break;                    
                    case 3: 
                        System.out.println("Ordenar\n");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");                  
                        aleatorio.randomOrdenar(scan.nextInt());
                        break;
                }
                break;                          
            case 3 :
                System.out.println("\nArbol Splay\n1.Buscar\n2.Insertar\n3.Ordenar\n");               
                int choice3 = scan.nextInt();
                switch (choice3){                  
                    case 1:
                        System.out.println("Buscar");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");
                        int cuantos = scan.nextInt();
                        System.out.println("Seleccione el numero a buscar");
                        int buscar = scan.nextInt();
                        aleatorio.randomBuscarSplay(cuantos,buscar);  
                        break;                
                    case 2:
                        System.out.println("Insertar");
                        System.out.println("Buscar");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");
                        int cuantos2 = scan.nextInt();
                        System.out.println("Seleccione el numero a insertar");
                        int ainsertar = scan.nextInt();
                        aleatorio.randomInsertarSplay(cuantos2, ainsertar);                      
                        break;                        
                    case 3: 
                        System.out.println("Ordenar\n");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");                       
                        aleatorio.randomOrdenar(scan.nextInt());
                        break;                   
                }               
                break;        
                
            case 4 : 

                System.out.println("\nArbol Rojinegro1\n1.Buscar\n2.Insertar\n3.Ordenar\n");
                int choice4 = scan.nextInt();            
                switch (choice4){
                    case 1:
                        System.out.println("Buscar");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");
                        int cuantos = scan.nextInt();
                        System.out.println("Seleccione el numero a buscar");
                        int buscar = scan.nextInt();
                        aleatorio.randomBuscarSplay(cuantos,buscar);   
                        break;                       
                    case 2:
                        System.out.println("Insertar");
                        System.out.println("Buscar");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");
                        int cuantos2 = scan.nextInt();
                        System.out.println("Seleccione el numero a insertar");
                        int ainsertar = scan.nextInt();
                        aleatorio.randomInsertarSplay(cuantos2, ainsertar);                  
                        break;
                        
                    case 3: 
                        System.out.println("Ordenar\n");
                        System.out.println("Seleccione la cantidad de elementos con los que desea trabajar\n");                        
                        aleatorio.randomOrdenar(scan.nextInt());
                        break;
                }
                break; 
            default : 

                System.out.println("Wrong Entry \n ");

                break;   

            }

            System.out.println("\nDesea continuar (S o N) \n");

            ch = scan.next().charAt(0);                        

        } while (ch == 'S'|| ch == 's');               

    }*/
     }
    }
    

