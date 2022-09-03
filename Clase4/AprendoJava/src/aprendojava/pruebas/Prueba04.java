package aprendojava.pruebas;

import java.util.Random;

public class Prueba04 {
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int n = rnd.nextInt(20) + 1;
        System.out.println("Ganador: " + n);
        
    }
}
