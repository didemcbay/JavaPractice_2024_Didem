package org.example;

public class AutoWidening {

    public static void main(String[] args) {
        short sayi2= (byte) 44;

        System.out.println("sayi2   :" + sayi2);

        int sayi3;
        sayi3 = 55;
        System.out.println("sayi4 : " + (double) sayi3);
        }

        //Atanan değerin data türü değer atanan variable in data türünden küçük ise java casting i otomastik  yapar
        // bu isleme auto widening denir.
    }


