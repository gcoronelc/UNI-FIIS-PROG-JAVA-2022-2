package pe.edu.uni.clase1.prueba;

import pe.edu.uni.clase1.service.MatematicaService;

public class Prueba02 {
   
    public static void main(String[] args) {
        // Variables
        int num1, num2, suma;
        // Datos
        num1 = 56;
        num2 = 45;
        // Proceso
        MatematicaService matematica = new MatematicaService();
        suma = matematica.sumar(num1, num2);
        // Reporte
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Suma: " + suma);
    }
    
}
