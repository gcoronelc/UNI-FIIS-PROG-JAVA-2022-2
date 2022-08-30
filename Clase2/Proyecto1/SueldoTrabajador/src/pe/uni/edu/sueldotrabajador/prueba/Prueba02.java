package pe.uni.edu.sueldotrabajador.prueba;

import pe.uni.edu.sueldotrabajador.dto.SueldoDto;
import pe.uni.edu.sueldotrabajador.service.SueldoService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		// Datos
		SueldoDto dto = new SueldoDto(50, 100);
		// Proceso
		SueldoService service = new SueldoService();
		dto = service.procesar(dto);
		// Reporte
		System.out.println("Sueldo bruto: " + dto.getSueldoBruto());
		System.out.println("Renta: " + dto.getRenta());
		System.out.println("Sueldo neto: " + dto.getSueldoNeto());
	}

}
