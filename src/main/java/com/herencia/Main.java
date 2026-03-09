package com.herencia;

public class Main {
    public static void main(String[] args) {

        cuenta cuenta1 = new cuenta(1000, 0.1025f);
        cuenta1.consignar(500);
        cuenta1.retirar(200);
        cuenta1.extracto_mensual();
        cuenta1.imprimir();

        cuentaAhorros cuenta2 = new cuentaAhorros(15000, 0.105f);
        cuenta2.ejecutarOperacion(); // Debería ejecutar la operación
        cuenta2.imprimir2();
        
            

    }

}