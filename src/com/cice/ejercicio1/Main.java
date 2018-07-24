package com.cice.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> datos = new ArrayList<>();
        Integer numero = 0;

        // Recuperamos los datos que vaya introduciendo
        do {
            System.out.println("Introduzca numeros. Para terminar pulse 0");
            try {
                numero = Integer.parseInt(sc.nextLine());
                if (numero != 0){
                    datos.add(numero);
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Debe introducir un numero");
            }
        }while(numero != 0);

        System.out.print("Dinos cuantos numeros quieres mostrar: ");

        // Mostramos el numero de datos que haya indicado el usuario
        try{
            int mostrar = Integer.parseInt(sc.nextLine());
            for (int i = 0; i<mostrar; i++){
                System.out.println(datos.get(i));
            }
        }
        catch (NumberFormatException x){
            System.out.println("Debe introducir un numero");
        }
        catch (IndexOutOfBoundsException x){
            System.out.println("No hay tantos datos");
        }


        /* Solucion Manual

        BufferedReader bf=new BufferedReader(new
		InputStreamReader(System.in));
		System.out.println("Introduce el total de parámetros que
		quieres mostrar");
		try{
			int total=Integer.parseInt(bf.readLine());
			for(int i=0;i<total;i++){
				System.out.println(args[i]);
			}
		}
		catch(IOException e){
			System.out.println("Error de entrada de datos");
		}
		catch(NumberFormatException e){
			System.out.println("El dato no tiene formato numérico
			válido");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("No se han introducido tantos
			argumentos al iniciar el programa");
		}
         */

    }
}
