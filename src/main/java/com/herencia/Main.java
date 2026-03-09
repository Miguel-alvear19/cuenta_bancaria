package com.herencia;

public class Main {
    public static void main(String[] args) {

        cuenta cuenta1 = new cuenta(1000, 0.1025f);
        cuenta1.consignar(500);
        cuenta1.retirar(200);
        cuenta1.extracto_mensual();
        cuenta1.imprimir();

        cuentaAhorros cuenta2 = new cuentaAhorros(15000, 0.105f);
        cuenta2.ejecutarOperacion();
        cuenta2.imprimir2();

        cuentaCorriente cuenta3 = new cuentaCorriente(2000, 0.1f);
        cuenta3.retirar(1000); // Debería permitir el retiro y mostrar el sobregiro;
        cuenta3.consignar(500); // Debería reducir el sobregiro
        cuenta3.extracto_mensual();
        cuenta3.imprimir3();

    }

}