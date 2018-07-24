package com.cice.ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AlmacenNumeros {

    private ArrayList<Integer> numeros = new ArrayList<>();

    public void guardarNumero(Integer numero){
        try {
            FileWriter fichero = new FileWriter("file.txt");
            fichero.write(numero);
            fichero.close();
        }
        catch (IOException e){
            System.out.println("No se puede excribir en el Fichero");
        }
    }

    public ArrayList<Integer> recuperarNumeros(){
        try{
            FileReader fichero = new FileReader("file.txt");
            BufferedReader buffer = new BufferedReader(fichero);
            while(buffer.readLine()!=null){
                numeros.add(Integer.parseInt(buffer.readLine()));
            }
            for (Integer d:numeros) {
                System.out.println(d);
            }
        }
        catch (IOException e){
            System.out.println("No se puede leer el fichero");
        }
        catch (NumberFormatException e){
            System.out.println("Error de formato en la datos recuperados");
        }
        return numeros;
    }
}
