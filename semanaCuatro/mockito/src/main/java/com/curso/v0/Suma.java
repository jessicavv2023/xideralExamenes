package com.curso.v0;


public class Suma {

    CloudSuma cloudSuma;

    public Suma(CloudSuma cloudSuma) {
        this.cloudSuma = cloudSuma;
    }

    int calculaSuma(int x, int y, int impuesto) {
        int resultado = cloudSuma.ejecutaSuma(x, y, impuesto);
        return resultado;
    }
    int calculaSumaSinImpuesto(int x, int y) {
        int resultado = cloudSuma.ejecutaSuma(x, y);
        return resultado;
    }
}
