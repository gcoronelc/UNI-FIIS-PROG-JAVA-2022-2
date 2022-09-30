package edu.uni.proyectosjava.prueba;

import edu.uni.proyectosjava.service.ProyectoService;

public class Prueba01 {
    
    public static void main(String[] args) {
        // Variables
        int[] arreglo;
        ProyectoService service = new ProyectoService();
        // Proceso
        arreglo = service.generaArreglo();
        // Reporte
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
    
    
}
