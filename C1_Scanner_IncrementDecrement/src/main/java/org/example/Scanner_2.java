package org.example;

import java.util.Scanner;

public class Scanner_2 {

    // scan.next() sadece 1 kelime alır
    // scan.nextLine() birden fazla kelime gelme ihtimalinde kullanılır.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lütfen isminizi giriniz : ");
        String isim = scan.nextLine();
        System.out.println("girilen isim  : " + isim + "");
        scan.close();

    }

}
