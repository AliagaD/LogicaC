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
public class serie {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int x, n;
        float result;
        System.out.print("Ingrese el valor de x: ");
        x = scan.nextInt();
        System.out.print("Ingrese el valor de n: ");
        n = scan.nextInt();
        if(x >= n && n > 0 && x > 0){
            result = (numerador(x, n) / denominador(x, n));
            System.out.println("El resultado es: " + result);
        } else {
            System.out.println("Error");
        }
    }
    public static float numerador(int a, int b){
        int paraX = 1, paraN = 1;
        float result;
        for(int i = 1; i <= a; ++i){
            paraX = paraX * i;
        }
        for(int i = 1; i <= b; ++i){
            paraN = paraN * i;
        }
        result = paraX + paraN;
        return result;
    }
    public static float denominador(int a, int b){
        int paraXN = 1, paraN = 1, c;
        float result;
        c = a - b;
        for(int i = 1; i <= c; ++i){
            paraXN = paraXN * i;
        }
        for(int i = 1; i <= b; ++i){
            paraN = paraN * i;
        }
        result = paraXN * paraN;
        return result;
    }
}