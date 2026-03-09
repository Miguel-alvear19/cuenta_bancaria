package com.herencia;

public class cuenta {

    protected float saldo;
    protected int num_consignaciones = 0;
    protected int num_retiros = 0;
    protected float tasa_anual;
    protected float comision_mensual = 0;

    public cuenta(float saldo, float tasa_anual) {
        this.saldo = saldo;
        this.tasa_anual = tasa_anual;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTasa_anual() {
        return tasa_anual;
    }

    public void setTasa_anual(float tasa_anual) {
        this.tasa_anual = tasa_anual;
    }

    public void consignar(float cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            this.num_consignaciones++;
        } else {
            System.out.println("La cantidad debe ser mayor a 0");
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            this.num_retiros++;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void calcular_interes() {
        float interes_mensual = (this.saldo * this.tasa_anual) / 12;
        this.saldo += interes_mensual;
    }

}
