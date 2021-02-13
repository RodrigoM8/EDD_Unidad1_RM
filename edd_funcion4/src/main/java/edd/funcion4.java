package edd;

import java.util.Scanner;
//Rodrigo Martinez
public class funcion4 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int m[][] = new int[4][4];

        System.out.println("- Determinador de matrices triangular superior 4x4 -");

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduzca los valores de la fila * " + (i + 1)+ " * de la matriz");
            System.out.println("SEPARE CADA NÚMERO CON ESPACIO /// PRESIONE ENTER CADA VEZ QUE INGRESE 4 VALORES\n");
            for (int j = 0; j < 4; j++) {
                m[i][j] = dato.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" [" + m[i][j] + "] ");
            }
            System.out.println(" ");
        }
        if (m[1][0] == 0 && m[2][0] == 0 && m[2][1] == 0 && m[3][0] == 0 && m[3][1] == 0 && m[3][2] == 0) {
            System.out.println("\n Congratulations! Sí es una matriz triangular superior");
        } else {
            System.out.println("\n Esta no es una matriz triangular superior :/ \n Para que sea una matriz triangular superior debe contener 0's debajo de la diagonal principal");
        }
    }  
}
