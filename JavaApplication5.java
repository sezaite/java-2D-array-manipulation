/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author pavet
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] finalArr = new int[array.length][array.length];
        int temp = 0; //laikinas skaicius pirmajam array nariui talpinti

        //ispiesiu dvimate array su vienodomis eilutemis
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                finalArr[i][j] = array[j];
            }
        }
//pagrindine funkcija:
        for (int i = 1; i < array.length; i++) { //modifikuoti pradesiu nuo antros eilutes (pirma jau ir taip tinka)
            temp = finalArr[i - 1][0]; //issisaugau pirmaji array skaiciu is praejusios array
            for (int j = 0; j < finalArr[i].length - 1; j++) {
                finalArr[i][j] = finalArr[i - 1][j + 1]; //istatau naujus skaicius, paimtus is praeitos array eilutes ir paslinktus per viena indeksa
                finalArr[i][finalArr[i].length - 1] = temp; // i paskutini array indeksa idedu issaugotaja pirmo skaiciaus (temp) reiksme 
            }
        }
    // naujos array  ispiesimas:
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                System.out.print(finalArr[x][y] + " ");
            }
            System.out.println();
        }
    }
}
