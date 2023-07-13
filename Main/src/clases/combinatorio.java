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
public class combinatorio {
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        int x, n, result;
        System.out.print("Ingrese el valor de x: ");
        x = leer.nextInt();
        System.out.print("Ingrese el valor de n: ");
        n = leer.nextInt();
        if(x >= n && n > 0 && x > 0){
            result = (numerador(x) / denominador(x, n));
            System.out.println("El resultado es: " + result);
        } else {
            System.out.println("Error");
        }
    }
    public static int numerador(int a){
        int paraX = 1;
        for(int i = 1; i <= a; ++i){
            paraX *= i;
        }
        return paraX;
    }
    public static int denominador(int a, int b){
        int paraXN = 1, paraN = 1, c, result;
        c = a - b;
        for(int i = 1; i <= c; ++i){
            paraXN *= i;
        }
        for(int i = 1; i <= b; ++i){
            paraN *= i;
        }
        result = paraXN * paraN;
        return result;
    }
}
