package com.example;

public class ContoCorrente {
    private String titolare;
    private double saldo;

    public ContoCorrente(double s, String t) throws IllegalArgumentException{

        if(saldo <= 0){

            throw IllegalArgumentException();

        }

        saldo = s;
        titolare = t;



    }

}
