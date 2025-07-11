package com.cursoalura.challengeconversordemonedas.modelos;

import com.cursoalura.challengeconversordemonedas.principal.Principal;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class ConsultaAPI {
    public static String monedaOrigen;
    public static String monedaDestino;
    public static double cantidad;

    public Moneda obtenerTasaCambio(String monedaOrigen, String monedaDestino, double cantidad){
        Principal principal = new Principal();
        double tasaDeCambio = 0;
        String apiKey = "d95a97d090bbe1964631e307";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+monedaOrigen+"/"+ monedaDestino+"/"+cantidad);

        //Request a la API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        //Lista de monedas permitidas
        List<String> monedasPermitidas = Arrays.asList("USD", "EUR", "BRL", "COP");

        //Verificacion que la moneda ingresada por el usuario se encuentre en nuestro menu de opciones
        if (monedasPermitidas.contains(this.monedaOrigen) && monedasPermitidas.contains(this.monedaDestino)) {
            try {
                //Respuesta en formato Json
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String jsonResponse = response.body();

                //Conversion de Json a Gson
                Gson gson = new Gson();
                MonedaApi monedaApi = gson.fromJson(jsonResponse, MonedaApi.class);
                Moneda moneda = new Moneda(monedaApi);

                return moneda;

            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (InputMismatchException e){
                System.out.println("El valor ingresado no es un numero de la seleccion: " +e.getMessage());
            }
        } else{
            System.out.println("Una o las dos monedas seleccionadas no estan en las opciones de nuestro menu");
            return null;
        }
        return null;
    }
}
