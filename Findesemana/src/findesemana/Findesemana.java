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
        DecimalFormat redondeo = new DecimalFormat("###,###.##");//Funcion para representar en pantalla el formato deseado
        String dia;
        System.out.println("Introduce el dia: ");
        dia = sc.nextLine();

        String hora;
        System.out.println("Introduce la hora: ");
        hora = sc.nextLine();
        //Transformo un array en dos enteros
        String[] parts = hora.split(":");
        String part1 = parts[0];
        String part2 = parts[1];
        int min = Integer.parseInt(part1);
        int contador = 0;

        boolean excepcion = true;
        //Serie de ifs para saber en que dia empieza a contar
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
            //If para controlar que a partir de las 15:00 ya es fin de semana
            if (min >= 15) {
                System.out.println("Ya estas en fin de semana");
                excepcion = false;
            }
        } else if (dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Domingo")) {
            System.out.println("Ya estas en fin de semana");
            excepcion = false;

        }
//If para que si ya estas en fin de semana no te calcule cuantos minutos te quedan para llegar al fin de semana
        if (excepcion == true) {
//paso las horas a minutos
            min = min * 60;
            int mindia = Integer.parseInt(part2) + min;
            int mintotales = (4 * 24 * 60) + (60 * 15);
            int minactuales = mintotales - ((contador * 24 * 60) + mindia);
            System.out.println("Faltan " + redondeo.format(minactuales) + " minutos para el fin de semana");
        }
    }

}
