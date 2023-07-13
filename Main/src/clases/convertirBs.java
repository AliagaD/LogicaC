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
public class convertirBs {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] moneda = {"Dólares.", "Pesos Chilenos.", "Soles.", "Euros."};
        double[] cambio = {0.14, 117.97, 0.52, 0.13};
        int s;
        do {
            System.out.println("¿Desea usar el convertidor?\n1.Si\n2.No");
            s = leer.nextInt();
            if (s == 1){
                convertir(moneda, cambio, leer);
            }
        } while (s != 2);
    }
    
    public static void convertir(String[] moneda, double[] cambio, Scanner leer){
        int m;
        float c;
        System.out.println("¿A qué moneda desea convertir?\n1. Dólar\n2. Peso Chileno\n3. Sol\n4. Euro");
        m = leer.nextInt();
        if (m >= 1 && m <= 4){
            System.out.println("¿Qué cantidad de bolivianos desea convertir?");
            c = leer.nextFloat();
            if (c > 0){
                System.out.println(c + " Bs equivalen a " + (c * cambio[m - 1]) + " " + moneda[m - 1]);
            }
        }
        
    }
}
