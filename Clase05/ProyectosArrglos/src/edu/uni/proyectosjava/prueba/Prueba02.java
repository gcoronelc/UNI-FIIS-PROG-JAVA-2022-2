package edu.uni.proyectosjava.prueba;

import edu.uni.proyectosjava.service.ProyectoService;

public class Prueba02 {
    
    public static void main(String[] args) {
        // Variables
        int[] arreglo1, arreglo2, suma;
        ProyectoService service = new ProyectoService();
        // Proceso
        arreglo1 = service.generaArreglo();
        arreglo2 = service.generaArreglo();
        suma = service.sumar(arreglo1, arreglo2);
        // Reporte
        for (int i = 0; i < suma.length; i++) {
            System.out.println(arreglo1[i] + " + " + arreglo2[i] + " = " + suma[i]);
        }
    }
    
    
    
}
