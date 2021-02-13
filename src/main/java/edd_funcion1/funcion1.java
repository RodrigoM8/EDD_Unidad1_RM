package edd_funcion1;

import java.util.Scanner;
//Rodrigo Martinez  
public class funcion1 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("                       *** Suma y Multiplicación de Matrices ***                           \n");
        System.out.println("¡Hola! ¿Cuántas filas y columnas quieres que tenga la matriz 1, 2 y 3? (Solo ingresa un dato)");
        System.out.println("[SE CREARÁN MATRICES CUADRADAS SEGÚN EL DATO QUE INGRESES] = ");
        int f = dato.nextInt();
        int col = f;
       
        int m1[][] = new int[f][col];
        int m2[][] = new int[f][col];
        int m_Suma[][] = new int[f][col];
        int m3[][] = new int[f][col];
        int m_Resultado[][] = new int[f][col];
//SUMA:
        for (int[] m11 : m1) {
            for (int j = 0; j < m1.length; j++) {
                m11[j] = (int) (Math.random() * 20 + 1);
            }
        }

        for (int[] m21 : m2) {
            for (int j = 0; j < m2.length; j++) {
                m21[j] = (int) (Math.random() * 20 + 1);
            }
        }

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                m_Suma[i][j] = m1[i][j] + m2[i][j];
            }
        }
//MULTIPLICACIÓN:
        for (int[] m31 : m3) {
            for (int j = 0; j < m3.length; j++) {
                m31[j] = (int) (Math.random() * 20 + 1);
            }
        }
        for (int a = 0; a < m1.length; a++) {
            for (int b = 0; b < m1.length; b++) {
//Se emplea un tercer ciclo for para dinamizar el proceso y no emplear tanto condicionales
//Aprovechando las características de la multiplicación entre matrices
//Dos matrices A y B son multiplicables si el número de columnas de A coincide con el número de filas de B
                for (int c = 0; c < m1.length; c++) {
                    m_Resultado[a][b] += m_Suma[a][c] * m3[c][b];
                }
            }
        }
//VISUALIZACIÓN EN CONSOLA:   
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print("|"+ m1[i][j] + "|");
            }

            if (i == 0) {
                System.out.print("      +      ");
            } else {
                System.out.print("             ");
            }
            for (int j = 0; j < m2.length; j++) {

                System.out.print("|" + m2[i][j] + "3|");
            }

            if (i == 0) {
                 System.out.print("      =      ");
            } else {
                System.out.print("              ");
            }

            for (int j = 0; j < m_Suma.length; j++) {

                System.out.print("| " + m_Suma[i][j] + " |");
            }

            if (i == 0) {
                 System.out.print("      x      ");
            } else {
                 System.out.print("             ");
            }

            for (int j = 0; j < m3.length; j++) {

                System.out.print("| " + m3[i][j] + " |");
            }

            if (i == 0) {
                 System.out.print("      =      ");
            } else {
                 System.out.print("             ");
            }

            for (int j = 0; j < m_Resultado.length; j++) {
                System.out.print("| " + m_Resultado[i][j] + " |");
            }
            System.out.println("  ");
        }
    }
}
