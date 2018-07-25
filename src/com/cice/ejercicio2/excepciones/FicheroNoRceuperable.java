package com.cice.ejercicio2.excepciones;

import java.io.FileNotFoundException;

public class FicheroNoRceuperable extends FileNotFoundException{

    public FicheroNoRceuperable(){
        super("No encuentro el fichero");
    }

    public FicheroNoRceuperable(String msg){
        super();
    }

}
