package splay;

import java.util.Random;

/**
 *
 * @author luisrbrenes
 */
public class RandomGeneratorSplay  {
    Random rand = new Random();
    SplayTree splay = new SplayTree();
    private long time_end;
    

    public void randomOrdenar(int cantidad){
        long time_start = System.currentTimeMillis();
        int randomInt;
        for (int cant=cantidad;cant > 0 ; cant--){
            randomInt = rand.nextInt(50)+1;
            splay.insert(randomInt);
            
        }
        long time_end = System.currentTimeMillis();
        System.out.println("Inorden");
        splay.inorden();
        System.out.println("\n");
        System.out.println("Preorden");
        splay.preorden();
        System.out.println("\n");
        System.out.println("Postorden");
        splay.postorden();
        System.out.println("\n");
        System.out.println("El tiempo de ejecucion fue de "+ ((time_end-time_start))+ "ms" );
    }
    
    public void randomBuscarSplay(int cantidad, int abuscar){
        long time_start = System.currentTimeMillis();
        int randomInt;
        for (int cant=cantidad;cant > 0 ; cant--){
            randomInt = rand.nextInt(50)+1;
            splay.insert(randomInt);      
        }
        splay.inorden();
        System.out.println("\n");
        if(splay.search(abuscar) == true)
            System.out.println("Se encontro el numero\n");
        else
            System.out.println("No se encontro el numero\n");
        long time_end = System.currentTimeMillis();
        System.out.println("El tiempo de ejecucion fue de "+ ((time_end-time_start))+ "ms" );     
    }
    public void randomInsertarSplay(int cantidad, int ainsertar){
        long time_start = System.currentTimeMillis();
        int randomInt;
        for (int cant=cantidad;cant > 0 ; cant--){
            randomInt = rand.nextInt(50)+1;
            splay.insert(randomInt);
        }


        splay.insert(ainsertar);
        splay.inorden();
        System.out.println("\n");
        long time_end = System.currentTimeMillis();
        System.out.println("Se inserto el numero con exito\n");
        System.out.println("El tiempo de ejecucion fue de "+ ((time_end-time_start))+ "ms" );
        
        
        
        
    }
}
