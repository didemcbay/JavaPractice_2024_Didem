package org.example;

public class WrapperClass {
    public static void main(String[] args) {
        int sayi1=10;
        Integer sayi2=20;
        System.out.println("sayi1+sayi2");
        //sayi1+sayi2
        String tel1= "3578987";
        String tel2= "3245434";

        System.out.println(sayi1+sayi2);
        // Sayıları toplamak istersek
        System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));

    }
}
