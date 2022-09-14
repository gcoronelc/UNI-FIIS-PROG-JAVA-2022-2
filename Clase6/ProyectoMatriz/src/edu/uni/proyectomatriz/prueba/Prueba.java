
package edu.uni.proyectomatriz.prueba;

import edu.uni.proyectomatriz.service.ProyectoService;


public class Prueba {
    public static void main(String[] args) {
        //variables 
        int [][] matriz;
        int [] suma;
        ProyectoService service = new ProyectoService();
        //PROCESO
        matriz = service.generaMatriz();
        suma = service.sumaMatriz(matriz);
        //reporte
        //matriz
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\t");
           
             for (int j = 0; j < matriz[i].length; j++) {
                 System.out.print(matriz[i][j] + "\t");
                
            }
            System.out.println("");    
        }
        //suma 
        System.out.println("Suma: \t");
        for (int i = 0; i < suma.length; i++) {
            System.out.println(suma[i]+"\t");
            
        }
        
        System.out.println(" ");        
              
        
    }
}
