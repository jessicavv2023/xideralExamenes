package com.curso.v0;

public class CloudSumaImpl implements CloudSuma {

    @Override
    public int ejecutaSuma(int x, int y, int impuesto) {
        int sumaTotal = x + y;
        int totalConImpuesto = sumaTotal + (sumaTotal * impuesto / 100);
        return totalConImpuesto;
    }

    @Override
    public int ejecutaSuma(int x, int y) {
        return x + y;  // No se aplica impuesto en este caso
    }
}
