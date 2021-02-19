package edu.escuelaing.arem.ASE.app;

import static spark.Spark.get;
import static spark.Spark.port;

import spark.Request;
import spark.Response;

import com.google.gson.Gson;


/**
 *
 * @author Adriana Castañeda
 */

public class SparkWebApp {

    public static void main( String[] args ) {
        port(getPort());
        Gson gson = new Gson();
        get("/cal", (req, res) -> {
            String rest = resultados (req, res);
            return gson.toJson(rest);
        });
    }


    private static String resultados(Request req, Response res){
        String num = req.queryParams("valor");
        String operacion = req.queryParams("operacion");
        String rst;

        if (num == null)
            return "No se puede realizar la operación";
        else {
            Calculadora calculadora = null;
            rst = calculadora.calcular(operacion, num);
        }
        return rst;
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }


}
