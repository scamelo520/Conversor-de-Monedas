package com.cursoalura.challengeconversordemonedas.principal;

import com.cursoalura.challengeconversordemonedas.modelos.ConsultaAPI;
import com.cursoalura.challengeconversordemonedas.modelos.MenuOpciones;
import com.cursoalura.challengeconversordemonedas.modelos.Moneda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {

        MenuOpciones menuOpciones = new MenuOpciones();
        menuOpciones.mostrarMenu();

        try {
            Scanner teclado = new Scanner(System.in);
            int opcionSeleccionada = teclado.nextInt();

            while (opcionSeleccionada != 7){
                ConsultaAPI consultaAPI = new ConsultaAPI();

                try{
                    if (opcionSeleccionada == 1) {
                        String monedaOrigen = "USD";
                        consultaAPI.monedaOrigen = monedaOrigen;
                        String monedaDestino = "EUR";
                        consultaAPI.monedaDestino = monedaDestino;

                        System.out.println("Ingrese el valor que desea convertir:");
                        double cantidad = teclado.nextInt();
                        ConsultaAPI.cantidad = cantidad;

                        Moneda moneda = consultaAPI.obtenerTasaCambio(monedaOrigen, monedaDestino, cantidad);

                        System.out.println("El valor "+cantidad+"["+monedaOrigen+"]"+" corresponde al valor final de =>>> "
                                +moneda.getResultadoDeConversion()+ "["+monedaDestino+"]");
                        menuOpciones.mostrarMenu();
                        opcionSeleccionada = teclado.nextInt();

                    } else if (opcionSeleccionada == 2) {
                        String monedaOrigen = "EUR";
                        consultaAPI.monedaOrigen = monedaOrigen;
                        String monedaDestino = "USD";
                        consultaAPI.monedaDestino = monedaDestino;

                        System.out.println("Ingrese el valor que desea convertir:");
                        double cantidad = teclado.nextInt();
                        ConsultaAPI.cantidad = cantidad;

                        Moneda moneda = consultaAPI.obtenerTasaCambio(monedaOrigen, monedaDestino, cantidad);

                        System.out.println("El valor "+cantidad+"["+monedaOrigen+"]"+" corresponde al valor final de =>>> "
                                +moneda.getResultadoDeConversion()+ "["+monedaDestino+"]");
                        menuOpciones.mostrarMenu();
                        opcionSeleccionada = teclado.nextInt();

                    } else if (opcionSeleccionada == 3) {
                        String monedaOrigen = "USD";
                        consultaAPI.monedaOrigen = monedaOrigen;
                        String monedaDestino = "BRL";
                        consultaAPI.monedaDestino = monedaDestino;

                        System.out.println("Ingrese el valor que desea convertir:");
                        double cantidad = teclado.nextInt();
                        ConsultaAPI.cantidad = cantidad;

                        Moneda moneda = consultaAPI.obtenerTasaCambio(monedaOrigen, monedaDestino, cantidad);

                        System.out.println("El valor "+cantidad+"["+monedaOrigen+"]"+" corresponde al valor final de =>>> "
                                +moneda.getResultadoDeConversion()+ "["+monedaDestino+"]");
                        menuOpciones.mostrarMenu();
                        opcionSeleccionada = teclado.nextInt();

                    } else if (opcionSeleccionada == 4) {
                        String monedaOrigen = "BRL";
                        consultaAPI.monedaOrigen = monedaOrigen;
                        String monedaDestino = "USD";
                        consultaAPI.monedaDestino = monedaDestino;

                        System.out.println("Ingrese el valor que desea convertir:");
                        double cantidad = teclado.nextInt();
                        ConsultaAPI.cantidad = cantidad;

                        Moneda moneda = consultaAPI.obtenerTasaCambio(monedaOrigen, monedaDestino, cantidad);

                        System.out.println("El valor "+cantidad+"["+monedaOrigen+"]"+" corresponde al valor final de =>>> "
                                +moneda.getResultadoDeConversion()+ "["+monedaDestino+"]");
                        menuOpciones.mostrarMenu();
                        opcionSeleccionada = teclado.nextInt();

                    } else if (opcionSeleccionada == 5) {
                        String monedaOrigen = "USD";
                        consultaAPI.monedaOrigen = monedaOrigen;
                        String monedaDestino = "COP";
                        consultaAPI.monedaDestino = monedaDestino;

                        System.out.println("Ingrese el valor que desea convertir:");
                        double cantidad = teclado.nextInt();
                        ConsultaAPI.cantidad = cantidad;

                        Moneda moneda = consultaAPI.obtenerTasaCambio(monedaOrigen, monedaDestino, cantidad);

                        System.out.println("El valor "+cantidad+"["+monedaOrigen+"]"+" corresponde al valor final de =>>> "
                                +moneda.getResultadoDeConversion()+ "["+monedaDestino+"]");
                        menuOpciones.mostrarMenu();
                        opcionSeleccionada = teclado.nextInt();

                    } else if (opcionSeleccionada == 6) {
                        String monedaOrigen = "COP";
                        consultaAPI.monedaOrigen = monedaOrigen;
                        String monedaDestino = "USD";
                        consultaAPI.monedaDestino = monedaDestino;

                        System.out.println("Ingrese el valor que desea convertir:");
                        double cantidad = teclado.nextInt();
                        ConsultaAPI.cantidad = cantidad;

                        Moneda moneda = consultaAPI.obtenerTasaCambio(monedaOrigen, monedaDestino, cantidad);

                        System.out.println("El valor "+cantidad+"["+monedaOrigen+"]"+" corresponde al valor final de =>>> "
                                +moneda.getResultadoDeConversion()+ "["+monedaDestino+"]");
                        menuOpciones.mostrarMenu();
                        opcionSeleccionada = teclado.nextInt();

                    }else {
                        System.out.println("La opcion seleccionada no es valida");
                        break;
                    }
                }catch (InputMismatchException e){
                    System.out.println("el valor deseado a convertir no es de tipo numerico: " +e.getMessage());
                    break;
                }


            }
            System.out.println("Saliendo del programa...");
        }catch (InputMismatchException e){
            System.out.println("El opcion seleccionada no es una opcion de el menu: " +e.getMessage());
        }
    }
}
