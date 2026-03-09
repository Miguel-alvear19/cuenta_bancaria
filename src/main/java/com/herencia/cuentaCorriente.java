package com.herencia;

public class cuentaCorriente extends cuenta {

    public float sobregiro = 0;
    public float exceso = 0;

    public cuentaCorriente(float saldo, float tasa_anual) {
        super(saldo, tasa_anual);
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad > 0) {
            this.num_retiros++;

            if (cantidad <= this.saldo) {
                this.saldo -= cantidad;
                System.out.println("Retiro exitoso. Saldo actual: " + this.saldo);
            } else {
                exceso = cantidad - this.saldo;
                this.saldo = 0;
                this.sobregiro += exceso;
                System.out.println("Retiro realizado con sobregiro de: " + this.sobregiro);
            }
        } else {
            System.out.println("Cantidad inválida para retirar");
        }
    }

    @Override
    public void consignar(float cantidad) {
        // Invoca al método heredado (suma al saldo y aumenta num_consignaciones)
        super.consignar(cantidad);

        // Si existe sobregiro, la consignación debe cubrirlo primero
        if (sobregiro > 0 && cantidad > 0) {
            if (cantidad >= sobregiro) {
                // La consignación cubre todo el sobregiro
                cantidad -= sobregiro;
                this.saldo += cantidad; // lo que sobra se suma al saldo
                System.out.println("Sobregiro cubierto. Saldo actual: " + this.saldo);
            } else {
                // La consignación solo reduce parte del sobregiro
                sobregiro -= cantidad;
                System.out.println("Sobregiro reducido. Nuevo sobregiro: " + exceso);
            }
        }
    }

    public void extracto_mensual() {
        super.extracto_mensual();
    }

    public void imprimir3() {
        System.out.println("\n" + "Valores de los atributos de la clase cuentaCorriente:");
        System.out.println("Saldo Total: " + this.saldo);
        System.out.println("Comision mensual: " + this.comision_mensual);
        System.out.println("Numero de transacciones: " + (this.num_consignaciones + this.num_retiros));
        System.out.println("Sobregiro actual: " + exceso);
    }

}
