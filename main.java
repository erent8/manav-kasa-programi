/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL


 */

import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0,tutar=0.0,a,e,d,m,p;

        System.out.println("Armut Kaç Kilo ? : ");
        Scanner i1 = new Scanner(System.in);
        a=i1.nextDouble();

        System.out.println("Elma Kaç Kilo ? : ");
        Scanner i2 = new Scanner(System.in);
        e=i2.nextDouble();

        System.out.println("Domates Kaç Kilo ? : ");
        Scanner i3 = new Scanner(System.in);
        d=i3.nextDouble();

        System.out.println("Muz Kaç Kilo ? : ");
        Scanner i4 = new Scanner(System.in);
        m=i4.nextDouble();

        System.out.println("Patlican Kaç Kilo ? : ");
        Scanner i5 = new Scanner(System.in);
        p=i5.nextDouble();

        tutar += armut*a+elma*e+domates*d+muz*m+patlican*p;
        System.out.println("Toplam tutar : "+tutar);
    }
    
}
