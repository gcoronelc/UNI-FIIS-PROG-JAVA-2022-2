package edu.uni.proyectomatriz.service;

import java.util.Random;

public class ProyectoService {

    public int[][] generaMatriz() {
        int[][] matriz = new int[4][3];
        Random rnd = new Random();
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[row].length; col++) {
                matriz[row][col] = rnd.nextInt(21) + 10;
            }
        }
        return matriz;
    }

    public int[] sumaMatriz(int[][] matriz) {
        int[] suma = new int[3];
        int row, col;
        for (col = 0; col < 3; col++) {
            suma[col] = 0;
            for(row=0;row<4;row++){
                suma[col] += matriz[row][col];
            }
        }
        return suma;
    }

}
