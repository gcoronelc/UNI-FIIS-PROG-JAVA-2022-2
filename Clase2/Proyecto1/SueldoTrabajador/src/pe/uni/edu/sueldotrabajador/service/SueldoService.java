package pe.uni.edu.sueldotrabajador.service;

import pe.uni.edu.sueldotrabajador.dto.SueldoDto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class SueldoService {

	public SueldoDto procesar(SueldoDto dto) {
		// Variables
		int horas;
		double pagoHora;
		double sueldoBruto, renta, sueldoNeto;
		// Datos
		horas = dto.getHoras();
		pagoHora = dto.getPagoHora();
		// Proceso
		/*
		sueldoBruto = pagoHora * (horas>40?40:horas);
		sueldoBruto += pagoHora * 1.50 * (horas>40?horas-40:0);
		renta = 0.08 * (sueldoBruto>2000.0?sueldoBruto:0);
		sueldoNeto = sueldoBruto - renta;
		 */
		if (horas <= 40) {
			sueldoBruto = pagoHora * horas;
		} else {
			sueldoBruto = pagoHora * 40 + pagoHora * 1.50 * (horas - 40);
		}
		if (sueldoBruto <= 2000) {
			renta = 0.0;
		} else {
			renta = sueldoBruto * 0.08;
		}
		sueldoNeto = sueldoBruto - renta;
		// Reporte
		dto.setSueldoBruto(sueldoBruto);
		dto.setRenta(renta);
		dto.setSueldoNeto(sueldoNeto);
		return dto;
	}

}
