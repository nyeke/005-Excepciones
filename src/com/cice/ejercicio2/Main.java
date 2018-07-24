package com.cice.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AlmacenNumeros almacen = new AlmacenNumeros();
        Scanner sc = new Scanner(System.in);

        Integer menu = 0;
        Integer numero = 0;
        ArrayList<Integer> datosFichero = new ArrayList<>();

        do {
            System.out.println("==================");
            System.out.println("1. Guardar Numero");
            System.out.println("2. Mostrar numeros");
            System.out.println("3. Salir");
            System.out.println("==================");
            menu = sc.nextInt();

            switch (menu){
                case 1:
                    System.out.print("Introduzca el numero: ");
                    almacen.guardarNumero(sc.nextInt());
                    break;
                case 2:
                    //datosFichero = almacen.recuperarNumeros();
                    System.out.println("Estos son los datos guardados: ");
                    almacen.recuperarNumeros();
                    break;
                case 3:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (menu !=  3);
    }
}
