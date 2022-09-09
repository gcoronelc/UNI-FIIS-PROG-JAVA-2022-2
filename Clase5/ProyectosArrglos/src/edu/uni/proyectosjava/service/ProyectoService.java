package edu.uni.proyectosjava.service;

import edu.uni.proyectosjava.dto.ArreglosDto;
import java.util.Random;

public class ProyectoService {
  
    public ProyectoService() {
        System.out.println("Hola, soy el constructor de ProyectoService");
    }
    
    public ArreglosDto procesarArreglos(){
        ArreglosDto dto = new ArreglosDto();
        dto.setArreglo1(generaArreglo());
        dto.setArreglo2(generaArreglo());
        dto.setSuma(sumar(dto.getArreglo1(), dto.getArreglo2()));
        return dto;
    }
 
    public int[] generaArreglo(){
        int[] arreglo = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(90) + 10;
        }
        return arreglo;
    }
    
    public int[] sumar(int[] arreglo1, int[] arreglo2){
        int[] suma = new int[arreglo1.length];
        for (int i = 0; i < suma.length; i++) {
            suma[i] = arreglo1[i] + arreglo2[i];
        }
        return suma;
    }
}
