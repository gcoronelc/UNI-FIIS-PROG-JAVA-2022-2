package aprendojava.service;

import aprendojava.dto.FilaDto;

public class Clase3Service {

    public int calcCompensacion(int nota) {
        int monto = 0, anchoRango = 0, factor = 0, anchoNota = 0;
        for(int i=1;i<=4;i++){
            // Ancho del rango
            switch (i) {
                case 1:
                    anchoRango = 5;
                    factor = 50;
                    break;
                case 2:
                    anchoRango = 7;
                    factor = 80;
                    break;
                case 3:
                    anchoRango = 5;
                    factor = 120;
                    break;
                case 4:
                    anchoRango = 3;
                    factor = 500;
                    break;
                default:
                    anchoRango = 0;
                    factor = 0;
            }
            anchoNota = (nota>=anchoRango)?anchoRango:nota;
            monto += anchoNota * factor;
            nota -= anchoNota;
        }
        return monto;
    }

    
    public FilaDto[] calcularTabla( int base ){
        // Variables
        int factor, resultado;
        FilaDto[] arreglo = new FilaDto[11];
        // Proceso
        for(factor=0;factor<=10;factor++){
            resultado = base * factor;
            FilaDto dto = new FilaDto(base, factor, resultado);
            arreglo[factor] = dto;
        }
        // Reporte
        return arreglo;
    }
    
}
