package edu.escuelaing.arem.ASE.app;

public class Calculadora {

    public static String calcular(String operacion, String num) {
        double n = Double.parseDouble(num);
        String respuesta;
        String temp = "";

        if (operacion.equals("cos")){
            temp = coseno(n);
        } else if (operacion.equals("sin")){
            temp = seno(n);
        } else if (operacion.equals("tan")){
            temp = tangente(n);
        }

        respuesta = "{ El resutado es: " + temp + "}";
        return respuesta;
    }

    private static String coseno(double n){
        return Double.toString(Math.cos(n));
    }

    private static String seno(double n){
        return Double.toString(Math.sin(n));
    }

    private static String tangente(double n){
        return Double.toString(Math.tan(n));
    }

}
