package com.herencia;

public class Main {
    public static void main(String[] args) {

        cuenta cuenta1 = new cuenta(1000, 0.1025f);
        cuenta1.consignar(500);
        cuenta1.retirar(200);
        cuenta1.extracto_mensual();
        cuenta1.imprimir();
        

    }

}