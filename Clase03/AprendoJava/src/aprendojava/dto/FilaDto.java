package aprendojava.dto;

public class FilaDto {

    private int base;
    private int factor;
    private int resultado;

    public FilaDto() {
    }

    public FilaDto(int base, int factor, int resultado) {
        this.base = base;
        this.factor = factor;
        this.resultado = resultado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        String fila = base + " X " + factor + " = " + resultado;
        return fila;
    }
    
    

}
