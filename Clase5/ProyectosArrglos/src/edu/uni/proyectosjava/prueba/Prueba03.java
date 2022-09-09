package edu.uni.proyectosjava.prueba;

import edu.uni.proyectosjava.dto.ArreglosDto;
import edu.uni.proyectosjava.service.ProyectoService;

public class Prueba03 {
    
    public static void main(String[] args) {
        // Variables
        ArreglosDto dto;
        ProyectoService service = new ProyectoService();
        // Proceso
        dto = service.procesarArreglos();
        // Reporte
        for (int i = 0; i < dto.getSuma().length; i++) {
            String linea = dto.getArreglo1()[i] + " + " 
                    + dto.getArreglo2()[i] + " = " + dto.getSuma()[i];
            System.out.println(linea);
        }
    }
    
    
    
}
