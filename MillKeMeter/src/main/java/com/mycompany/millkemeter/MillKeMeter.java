/* Nama : Putri Adelia A
* NIM  : 13020210226
*/

package com.mycompany.millkemeter;

/**
 *
 * @author Putri
 */

import java.util.Scanner;

public class MillKeMeter {
    
    public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        double mil, hasil;
        double m = 1.609; // jarak 1 mil dalam m
        System.out.print("\t konversi jarak mil ke jarak m \n");
        System.out.print(" Berapa Mil : ");
        mil = userinput.nextDouble();
        System.out.print("");
        hasil = mil * m;
        System.out.print(" " + " mil = " + hasil + " m.");
    }
}