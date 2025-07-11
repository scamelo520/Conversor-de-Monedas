package com.cursoalura.challengeconversordemonedas.modelos;

public class Moneda {
    public String monedaOrigen;
    public String monedaDestino;
    public double tasaDeCambio;
    private double resultadoDeConversion;

    public Moneda(MonedaApi MonedaApi){
        this.monedaOrigen = MonedaApi.base_code();
        this.monedaDestino = MonedaApi.target_code();
        this.tasaDeCambio = MonedaApi.conversion_rate();
        this.resultadoDeConversion = MonedaApi.conversion_result();
    }

    public double getResultadoDeConversion() {
        return resultadoDeConversion;
    }

    @Override
    public String toString() {
        return "moneda Origen= " + monedaOrigen +
                ", moneda Destino= " + monedaDestino +
                ", tasa De Cambio= " + tasaDeCambio +
                ", Total Convertido= " + resultadoDeConversion;
    }
}
