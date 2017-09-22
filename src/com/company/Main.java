package com.company;

import java.util.Scanner;

public class Main {
    // Uzduotis 1.4
    public static final int MASYVO_ILGIS = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int[] skaiciai = new int[MASYVO_ILGIS];
        for (int i = 0; i < MASYVO_ILGIS; i++) {
            skaiciai[i] = sc.nextInt();
            suma += skaiciai[i];
        }
        System.out.println("Suma:" + suma);
        for (int i = 0; i < MASYVO_ILGIS; i++) {
            System.out.println(skaiciai[i]);
        }
    }
}
