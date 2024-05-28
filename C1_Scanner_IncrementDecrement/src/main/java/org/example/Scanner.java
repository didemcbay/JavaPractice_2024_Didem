package org.example;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String isim = scan.next();
        System.out.println("İsminiz.."+isim);

        scan.close();

    // scan bir scanner objesidir data türü non-primitive metotları da vardır.

    }


}