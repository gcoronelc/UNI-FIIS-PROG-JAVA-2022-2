package aplicandojava.prueba;

import aplicandojava.herencia.Clase4;

public class Prueba01 {

    public static void main(String[] args) {
        Clase4 obj = new Clase4();
        int suma = obj.sumar(8, 6);
        System.out.println("8 + 6 = " + suma);
        System.out.println("El mayor de 80 y 90 = " + Math.max(80, 90));
    }

}
