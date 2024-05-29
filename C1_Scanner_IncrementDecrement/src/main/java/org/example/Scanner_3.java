package org.example;


import java.util.Scanner;

public class Scanner_3 {

    // Kullanıcıdan ismini alıp isminin baş harfini yazdıran program

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        char ilkHarf =scan.next().charAt(0);
        System.out.println("İsminizin ilk harfi    :" + ilkHarf);
        scan.close();
    }



    }

