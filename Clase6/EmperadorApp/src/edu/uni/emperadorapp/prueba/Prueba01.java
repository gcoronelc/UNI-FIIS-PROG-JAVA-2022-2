package edu.uni.emperadorapp.prueba;

import edu.uni.emperadorapp.dto.ProformaDto;
import edu.uni.emperadorapp.service.ProformaService;

public class Prueba01 {

    public static void main(String[] args) {
        // Variables
        ProformaService service = new ProformaService();
        // Data
        ProformaDto dto = new ProformaDto(5, 10,
                service.getHospedajes()[1], 
                service.getDesayunos()[2],
                service.getAlmuerzos()[3],
                service.getCenas()[2]);
        // Proceso
        service.procesar(dto);
        // Reporte
        System.out.println(dto.getReporte());
    }
    
}
