package edu.uni.emperadorapp.dto;

public class ProformaDto {

    // Datos de entrada
    private int personas;
    private int dias;
    private ComboDto hospedaje;
    private ComboDto desayuno;
    private ComboDto almuerzo;
    private ComboDto cena;
    // Datos de salida
    private double importeHospedaje;
    private double importeDesayuno;
    private double importeAlmuerzo;
    private double importeCena;
    private double total;

    public ProformaDto() {
    }

    public ProformaDto(int personas, int dias, ComboDto hospedaje, ComboDto desayuno, ComboDto almuerzo, ComboDto cena) {
        this.personas = personas;
        this.dias = dias;
        this.hospedaje = hospedaje;
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.cena = cena;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public ComboDto getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(ComboDto hospedaje) {
        this.hospedaje = hospedaje;
    }

    public ComboDto getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(ComboDto desayuno) {
        this.desayuno = desayuno;
    }

    public ComboDto getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(ComboDto almuerzo) {
        this.almuerzo = almuerzo;
    }

    public ComboDto getCena() {
        return cena;
    }

    public void setCena(ComboDto cena) {
        this.cena = cena;
    }

    public double getImporteHospedaje() {
        return importeHospedaje;
    }

    public void setImporteHospedaje(double importeHospedaje) {
        this.importeHospedaje = importeHospedaje;
    }

    public double getImporteDesayuno() {
        return importeDesayuno;
    }

    public void setImporteDesayuno(double importeDesayuno) {
        this.importeDesayuno = importeDesayuno;
    }

    public double getImporteAlmuerzo() {
        return importeAlmuerzo;
    }

    public void setImporteAlmuerzo(double importeAlmuerzo) {
        this.importeAlmuerzo = importeAlmuerzo;
    }

    public double getImporteCena() {
        return importeCena;
    }

    public void setImporteCena(double importeCena) {
        this.importeCena = importeCena;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getReporte(){
        String reporte = "REPORTE DE HOSPEDAJE\n";
        reporte += "--------------------------------------\n";
        reporte += "Cantidad de personas: " + this.personas + "\n";
        reporte += "Dias de hospedaje: " + this.dias + "\n";
        reporte += "Importe de hospedaje: " + this.importeHospedaje + "\n";
        reporte += "Importe de Desayuno: " + this.importeDesayuno + "\n";
        reporte += "Importe de Almuerzo: " + this.importeAlmuerzo + "\n";
        reporte += "Importe de Cena: " + this.importeCena + "\n";
        reporte += "--------------------------------------\n";
        reporte += "Total: " + this.total + "\n";
        return reporte;
    }
}
