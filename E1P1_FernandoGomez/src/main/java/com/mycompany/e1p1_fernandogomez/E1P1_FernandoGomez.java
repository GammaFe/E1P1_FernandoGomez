package com.mycompany.e1p1_fernandogomez;

import java.util.Random;
import java.util.Scanner;

public class E1P1_FernandoGomez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a mi Examen de laboratorio. |(0_0)/ ");
        while (true) {
            System.out.println("\n Menu \n 1.Número válido \n 2.Reordenado de cadenas \n 3.Trigonometría \n 4.Salir\n");
            int caso = entrada.nextInt();
            switch (caso) {
                case 1:
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrese el numero que desea validar: ");
                    String num = entrada.nextLine();
                    Numero(num);
                    break;
                case 2:
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrese la cadena que desea reordenar: ");
                    String cadena = entrada.nextLine();
                    Reo(cadena);
                    break;
                case 3:
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrese el álgulo (grados) que desea calcular:");
                    double angulo = entrada.nextDouble();
                    System.out.println("Ingrese la precisión deseada:");
                    int precicion = entrada.nextInt();
                    Trigo(angulo,precicion);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese otro numero: ");
                    break;

            }

        }
    }

    public static void Numero(String num) {
        int n = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            if ((num.charAt(i) == '-') && (num.charAt(0) == '-')) {
                n = 0;
            } else {
                n = 1;
            }
            if (((num.charAt(i) == '.') || (num.charAt(i + 1)) == '1') || ((num.charAt(i + 1)) == '2') || ((num.charAt(i + 1)) == '3') || ((num.charAt(i + 1)) == '4') || ((num.charAt(i + 1)) == '5')
                    || ((num.charAt(i + 1)) == '6') || ((num.charAt(i + 1)) == '7') || ((num.charAt(i + 1)) == '8') || ((num.charAt(i + 1)) == '9') || ((num.charAt(i + 1)) == '0')) {
                n = 1;
            } else {
                n = 0;
            }
        }
        if (((num.charAt(0) == '1') || ((num.charAt(0) == '2') || ((num.charAt(0) == '3') || ((num.charAt(0) == '4') || ((num.charAt(0) == '5')
                || ((num.charAt(0) == '6') || ((num.charAt(0) == '7') || ((num.charAt(0) == '8') || ((num.charAt(0) == '9') || ((num.charAt(0) == '0')))))))))))) {
            n = 1;
        }
        if (n == 1) {
            System.out.println(num + " es un numero valido");
        } else {
            System.out.println(num + " no es un numero valido");
        }

    }

    public static void Reo(String cadena) {
        String acum = "";
        String acum1 = "", acum2 = "", acum3 = "", acum4 = "";
        for (int i = 0; i <= cadena.length() - 1; i++) {
            int car = cadena.charAt(i);
            if ((car >= 48) && (car <= 57)) {
                acum1 = acum1 + cadena.charAt(i);
            } else if ((car >= 97) && (car <= 122)) {
                acum2 = acum2 + cadena.charAt(i);
            } else if ((car >= 65) && (car <= 90)) {
                acum3 = acum3 + cadena.charAt(i);
            } else {
                acum4 = acum4 + cadena.charAt(i);
            }
            acum = acum1 + acum2 + acum3 + acum4;
        }
        System.out.println("String reordenado:" + acum);
    }

    public static void Trigo(double angulo, int precision) {

        
    }

}
