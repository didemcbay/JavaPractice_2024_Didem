package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanicidan 3 basamakli bir sayi alip,rakamlar toplamını yazdıran programı yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
        int sayi= scan.nextInt();

        int rakamlarToplami=0;
        int rakam=sayi%10; //Modüler ile birler basamağını verir.
        rakamlarToplami+=rakam;
        sayi/=10; // 10 a bölme (Onlar basamağı)
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10; // 10 a bölme (Yüzler basamağı)
        rakamlarToplami+=sayi;
        System.out.println("Girdiğiniz rakamlar toplamı: "+ rakamlarToplami);
        scan.close();


    }
        }

