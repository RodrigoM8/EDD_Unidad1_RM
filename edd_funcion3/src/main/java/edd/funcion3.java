package edd;

import java.util.Scanner;
//Rodrigo Martinez
public class funcion3 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int m[][] = new int[3][3];

        System.out.println("- Determinador de matrices identidad 3x3 -");

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduzca los valores de la fila * " + (i + 1)+ " * de la matriz");
            System.out.println("SEPARE CADA NÚMERO CON ESPACIO /// PRESIONE ENTER CADA VEZ QUE INGRESE 3 VALORES");
            for (int j = 0; j < 3; j++) {
                m[i][j] = dato.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println(" ");
               
        }

        if (m[0][0] == 1 && m[0][1] == 0 && m[0][2] == 0 && m[1][0] == 0 && m[1][1] == 1 && m[1][2] == 0 && m[2][0] == 0 && m[2][1] == 0 && m[2][2] == 1) {
            System.out.println("\n ¡Más fino!☺. Es una matriz identidad");
        } else {
            System.out.println("\n #quétriste:( \n No es una matriz identidad \n Para que sea una matriz identidad debe contener 1's en su diagonal principal y 0's en los demás elementos");
        }
    }
    
}
