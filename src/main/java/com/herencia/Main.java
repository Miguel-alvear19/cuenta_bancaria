package com.herencia;

public class Main {
    public static void main(String[] args) {

            cuenta cuenta1 = new cuenta(1000, 0.05f);
            cuenta1.consignar(500);
            System.out.println("Saldo actual: " + cuenta1.saldo);
        
    }
}