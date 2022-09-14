package edu.uni.proyectomatriz.prueba;

import edu.uni.proyectomatriz.service.ProyectoService;

public class Prueba01 {
    
    public static void main(String[] args) {
        // Variables
        int[][] matriz;
        int[] suma;
        ProyectoService service = new ProyectoService();
        // Proceso
        matriz = service.generaMatriz();
        suma = service.sumaMatriz(matriz);
        // Reporte
        // Matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        // Suma
        System.out.print("Suma:\t");
        for (int i = 0; i < suma.length; i++) {
            System.out.print(suma[i] + "\t");
        }
        System.out.println("");
    }
}
