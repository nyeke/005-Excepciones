package com.cice.ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlmacenNumeros {

    private File fichero;
    private FileWriter writer;
    private BufferedReader reader;
    private List<Integer> numeros = null;

    public AlmacenNumeros(){
        prepararRecursos();
    }

    //Almacenar el dato en el fichero

    public void guardarNumero(Integer numero){
        try {
            writer.append(String.valueOf(numero));
            writer.append(";");
            writer.flush();
        }
        catch (IOException e){
            System.out.println("No se puede escribir en el Fichero");
        }
    }

    //Recuperar los datos del fichero

    public List<Integer> recuperarNumeros(){
        try{
            String [] split = reader.readLine().split(";");
            List<String> strings = Arrays.asList(split);
            Stream<Integer> integerStream = strings.stream().map(cadena -> Integer.parseInt(cadena));
            numeros = integerStream.collect(Collectors.toList());

        }
        catch (IOException e){
            System.out.println("No se puede leer el fichero");
        }
        catch (NumberFormatException e){
            System.out.println("Error de formato en la datos recuperados");
        }
        return numeros;
    }

    // Prepara el fichero

    private void prepararRecursos() {
        this.fichero = new File("src/file.txt");
        try {
            if (!this.fichero.exists()) {
                this.fichero.createNewFile();
            }
            this.writer = new FileWriter(this.fichero, true);
            this.reader = new BufferedReader(new FileReader(this.fichero));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrarRecursos(){
        try {
            this.writer.close();
            this.reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
