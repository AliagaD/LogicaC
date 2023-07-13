/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class serieDos {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        float x, t, s;
        int n, y, o = 1, z = 2;
        System.out.print("Ingrese el valor de x: ");
        x = scan.nextFloat();
        System.out.print("Ingrese el valor de t: ");
        t = scan.nextFloat();
        System.out.print("Ingrese el valor de i: ");
        y = scan.nextInt();
        System.out.print("Ingrese el numero de miembros: ");
        n = scan.nextInt();
        s = 0;
        for (int i = 1; i <= n; ++i){
            if (o == 1) {
                s = s + formula(x, t, y, z);
            } else {
                s = s - formula(x, t, y, z);
            }
            z = z + 2;
            o = o * (-1);
        }
        System.out.println("El resultado de la serie es: " + s);
    }
    public static float formula(float a, float b, int c, int d){
        float result;
        result = potencia(a, 1, d) / potencia(b, c, d + 1);
        return result;
    }
    public static float potencia(float a, int b, int c){
        float result = 1;
        int p = (b * c);
        for (int i = 1; i <= p; ++i) {
            result = result * a;
        }
        return result;
    }
}
