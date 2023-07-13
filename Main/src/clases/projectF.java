/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Calendar;

/**
 *
 * @author David
 */
public class projectF {

    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        String[] dia = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"};
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int e, aDia, aHora, aMinuto, cHoras, cMinutos, med, diaC, minutos, minutosC, minutosF;
        escribir("Ingrese un número entero según el dato requerido");
        escribir("¿Establecer la fecha de hoy de forma manual? 1-Si; 2-No");
        e = leer(1, 2);
        if (e == 1){
            fecha(calendario, mes);
        }
        calendario.set(Calendar.HOUR_OF_DAY, 0);
        calendario.set(Calendar.MINUTE, 0);
        escribir("¿En cuantos días comienza con la medicación?");
        aDia = leer(0, 7);
        escribir("¿A qué hora comienza?");
        aHora = leer(0, 23);
        escribir("¿ " + aHora + " con cuantos minutos?");
        aMinuto = leer(0, 59);
        escribir("¿Cada cuántas horas debe consumir el medicamento?");
        cHoras = leer(0, 96);
        escribir("¿ " + cHoras + " con cuantos minutos?");
        cMinutos = leer(0, 59);
        escribir("¿Cuántas veces debe repetir la medicación?");
        med = leer(0, 50);
        diaC = (aDia * 1440) + (aHora * 60) + aMinuto;
        calendario.add(Calendar.MINUTE, diaC);
        minutosC = (cHoras * 60) + cMinutos;
        minutosF = minutosC * med;
        escribir("Usted debe tomar la medicación en las siguientes fechas:");
        minutos = minutosC;
        while (minutos <= minutosF){
            escribir(dia[calendario.get(Calendar.DAY_OF_WEEK) - 1] + " " + String.format("%02d", calendario.get(Calendar.HOUR_OF_DAY)) + ":" +  String.format("%02d", calendario.get(Calendar.MINUTE)) + " (" + calendario.get(Calendar.DAY_OF_MONTH) + " de " + mes[calendario.get(Calendar.MONTH)] + " de " + calendario.get(Calendar.YEAR) + ")");
            calendario.add(Calendar.MINUTE, minutosC);
            minutos = minutos + minutosC;
        }
    }

    public static int leer(int a, int b) {
        Scanner scan = new Scanner(System.in);
        int x = -1;
        boolean c = false;
        do {
            if (c) {
                System.out.println("Error. Ingrese un número entero mayor o igual a " + a + " y menor o igual a " + b + ".");
            }
            c = true;
            try {
                x = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.nextLine();
            }
        } while (x < a || x > b);
        return x;
    }

    public static void escribir(String a) {
        System.out.println(a);
    }
    
    public static Calendar fecha(Calendar calendario, String[] mes){
        escribir("Escribra la fecha de hoy");
        escribir("Año:");
        calendario.set(Calendar.YEAR, leer(2023, 2100));
        escribir("Mes:");
        for (int i = 1; i <= 12; ++i){
            escribir(i + "-" + mes[i - 1]);
        }
        calendario.set(Calendar.MONTH, (leer(1,12) - 1));
        escribir("Día:");
        calendario.set(Calendar.DAY_OF_MONTH, leer(1,calendario.getActualMaximum(Calendar.DAY_OF_MONTH)));
        return calendario;
    }
}