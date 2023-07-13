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
public class calendarioPrueba {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        for (int i = 1; i <= 12; ++i){
            calendario.set(Calendar.MONTH, (i - 1));
            System.out.println(calendario.getActualMaximum(Calendar.DAY_OF_MONTH));
        }
        calendario.set(Calendar.MINUTE, 0);
            System.out.println(calendario.get(Calendar.MINUTE));
        for (int i = 1; i <= 5; ++i){
            calendario.add(Calendar.MINUTE, 50);
            System.out.println(calendario.get(Calendar.HOUR_OF_DAY));
            System.out.println(calendario.get(Calendar.MINUTE));
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
}
