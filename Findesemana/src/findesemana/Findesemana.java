/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findesemana;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author adria
 */
public class Findesemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat redondeo = new DecimalFormat("###,###.##");
        String dia;
        System.out.println("Introduce el dia: ");
        dia = sc.nextLine();

        String hora;
        System.out.println("Introduce la hora: ");
        hora = sc.nextLine();
        String[] parts = hora.split(":");
        String part1 = parts[0];
        String part2 = parts[1];
        int min = Integer.parseInt(part1);
        int contador = 0;

        boolean excepcion = true;
        if (dia.equalsIgnoreCase("Lunes")) {
            contador = 0;
        } else if (dia.equalsIgnoreCase("Martes")) {
            contador = 1;
        } else if (dia.equalsIgnoreCase("Miercoles")) {
            contador = 2;
        } else if (dia.equalsIgnoreCase("Jueves")) {
            contador = 3;
        } else if (dia.equalsIgnoreCase("Viernes")) {
            contador = 4;
            if (min >= 15) {
                System.out.println("Ya estas en fin de semana");
                excepcion = false;
            }
        } else if (dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Domingo")) {
            System.out.println("Ya estas en fin de semana");
            excepcion = false;

        }

        if (excepcion == true) {

            min = min * 60;
            int mindia = Integer.parseInt(part2) + min;
            int mintotales = (4 * 24 * 60) + (60 * 15);
            int minactuales = mintotales - ((contador * 24 * 60) + mindia);
            System.out.println("Faltan " + redondeo.format(minactuales) + " minutos para el fin de semana");
        }
    }

}
