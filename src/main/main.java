package main;

import java.util.Scanner;
import splay.RandomGeneratorSplay;
import splay.SplayTree;

/**
 *
 * @author luisrbrenes
 */
public class main {

     
            public static void main(String[] args)

    {            
        //Se crean las instancias
        Scanner scan = new Scanner(System.in);      
        RandomGeneratorSplay aleatorio = new RandomGeneratorSplay();

        System.out.println("Bienvenido\n");          

        char ch;

        // Se selecciona el tipo de arbol con el que se quiere trabajar 

        do    

        {

            System.out.println("\nSeleccione el tipo de arbol con el que desea trabajar\n");

            System.out.println("1. Arbol binario de busqueda");

            System.out.println("2. Arbol AVL ");

            System.out.println("3. Arbol Splay");

            System.out.println("4. Arbol Rojinegro\n" + "");

 

            int choice = scan.nextInt();            

            switch (choice)

            {

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
                switch (choice2)
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
                switch (choice4)
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
   


            default : 

                System.out.println("Wrong Entry \n ");

                break;   

            }

            System.out.println("\nDesea continuar (S o N) \n");

            ch = scan.next().charAt(0);                        

        } while (ch == 'S'|| ch == 's');               

    }

    }
    

