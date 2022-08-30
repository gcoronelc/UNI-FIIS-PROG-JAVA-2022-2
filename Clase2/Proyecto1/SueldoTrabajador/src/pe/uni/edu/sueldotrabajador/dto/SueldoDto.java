package pe.uni.edu.sueldotrabajador.dto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class SueldoDto {

	// Datos de entrada
	private int horas;
	private double pagoHora;
	// Salida
	private double sueldoBruto;
	private double renta;
	private double sueldoNeto;

	public SueldoDto() {
	}

	public SueldoDto(int horas, double pagoHora) {
		this.horas = horas;
		this.pagoHora = pagoHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getPagoHora() {
		return pagoHora;
	}

	public void setPagoHora(double pagoHora) {
		this.pagoHora = pagoHora;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double getRenta() {
		return renta;
	}

	public void setRenta(double renta) {
		this.renta = renta;
	}

	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

}
