package aprendojava.pruebas;

import aprendojava.dto.FilaDto;
import aprendojava.service.Clase3Service;

public class Prueba03 {

    public static void main(String[] args) {
        // Datos
        int base = 5;
        // Proceso
        Clase3Service service = new Clase3Service();
        FilaDto[] tabla = service.calcularTabla(base);
        // Reporte
        for (FilaDto fila : tabla) {
            System.out.println(fila);
        }
    }
    
}
