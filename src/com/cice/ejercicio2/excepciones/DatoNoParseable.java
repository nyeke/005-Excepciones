package com.cice.ejercicio2.excepciones;

public class DatoNoParseable extends Exception {

    public DatoNoParseable(){
        super("Objeto no parseable a numero");
    }

    public DatoNoParseable(String msg){
        super(msg);
    }
}
