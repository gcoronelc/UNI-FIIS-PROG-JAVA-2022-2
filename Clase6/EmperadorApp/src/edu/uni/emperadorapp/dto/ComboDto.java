package edu.uni.emperadorapp.dto;

public class ComboDto {

    private String clave;
    private double precio;

    public ComboDto() {
    }

    public ComboDto(String clave, double precio) {
        this.clave = clave;
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return clave + " (" + precio + ")";
    }

}
