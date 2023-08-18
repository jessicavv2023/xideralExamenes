package com.curso.v0;

public class Principal {

    public static void main(String[] args) {
    	//instancia de CloudSumaImpl
        CloudSuma cloudSuma = new CloudSumaImpl();
        //instancia de Suma 
        Suma suma = new Suma(cloudSuma);

        //método calculaSuma 
        int resultadoConImpuesto = suma.calculaSuma(5, 8, 10);
        System.out.println("el impuesto es "+resultadoConImpuesto);
        int calculaSumaSinImpuesto = suma.calculaSumaSinImpuesto(5, 8);
        System.out.println(" sin el impuesto es "+calculaSumaSinImpuesto);
    }
}
