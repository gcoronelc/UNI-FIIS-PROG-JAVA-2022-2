package aprendojava.pruebas;

import aprendojava.service.Clase3Service;

public class Prueba02 {
    
    public static void main(String[] args) {
        // Datos
        int nota = 13;
        // Proceso
        Clase3Service service = new Clase3Service();
        int monto = service.calcCompensacion(nota);
        // Reporte
        System.out.println("Nota: " + nota);
        System.out.println("Compensacion: " + monto);
    }
    
}
