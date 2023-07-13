/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author David
 */
public class diagonalPS {
    public static void main(String[] args) {
        int n = 4, c = 5, s = 3, dP = 0, dS = 0;
        int[][] m = new int[n][n];
        for (int i = 0; i <= 3; ++i){
            for (int j = 0; j <= 3; ++j){
                m[i][j] = c;
                c += 5;
            }
            dP += m[i][i];
            dS += m[i][(s--)];
        }
        System.out.println("La diagonal principal suma " + dP + "; y la secundaria, " + dS);
    }
}
