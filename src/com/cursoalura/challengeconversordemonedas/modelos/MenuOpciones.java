package com.cursoalura.challengeconversordemonedas.modelos;

public class MenuOpciones {

    public void mostrarMenu(){
        String mensaje = """
                *****************************************
                Bienvenido al Conversor de Monedas
                
                Menú de opciones:
                1) Dólar =>> Euro
                2) Euro =>> Dólar
                3) Dólar =>> Real Brasileño
                4) Real Brasileño =>> Dólar
                5) Dólar =>> Peso Colombiano
                6) Peso Colombiano =>> Dólar
                7) Salir
                
                Elija una opción valida:
                *****************************************                               
                """;
        System.out.println(mensaje);
    }
}
