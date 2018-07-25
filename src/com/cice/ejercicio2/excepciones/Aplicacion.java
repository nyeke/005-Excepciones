package com.cice.ejercicio2.excepciones;

import com.cice.ejercicio2.AlmacenNumeros;

import java.util.List;
import java.util.Scanner;

public class Aplicacion {

    private Scanner sc;
    private Integer menu = 0;
    private AlmacenNumeros almacen;


    public Aplicacion(){
        this.sc = new Scanner(System.in);
        this.almacen = new AlmacenNumeros();
    }

    public void menu(){
        do {
            System.out.println("==================");
            System.out.println("==    ALMACEN   ==");
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
                    List<Integer> lista = almacen.recuperarNumeros();
                    System.out.println("Estos son los datos: ");
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
