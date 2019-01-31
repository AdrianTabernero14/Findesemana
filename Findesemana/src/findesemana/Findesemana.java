/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findesemana;

import java.util.Scanner;

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
        String dia;
        System.out.println("Introduce el dia: ");
        dia=sc.nextLine();
        
        String hora;
        System.out.println("Introduce la hora: ");
        hora=sc.nextLine();
        String[] parts = hora.split(":");
        String part1 = parts[0]; 
        String part2 = parts[1];
        int contador=0;
        if (dia.equals("Lunes")){
            contador= 0;
        }
        else if(dia.equals("Martes")){
            contador=1;
        }
        else if(dia.equals("Miercoles")){
            contador=2;
        }
        else if(dia.equals("Jueves")){
            contador=3;
        }
        else if(dia.equals("Viernes")){
            contador=4;
        }
        int min= Integer.parseInt(part1);
        min = min*60;
        int mindia = Integer.parseInt(part2) + min;
        int mintotales = (4*24*60)+(60*15);
        int minactuales = mintotales - ((contador*24*60)+ mindia) ;
        System.out.println("Faltan "+minactuales+" minutos para el fin de semana");
    }

}
