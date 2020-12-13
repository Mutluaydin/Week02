package ch.hicoders.jam101.week02;

import ch.hicoders.jam101.week02.kisi.Ogrenci;

import java.util.ArrayList;

public class Okul {
    public static void main(String[] args){
        Ogrenci ogr1 = new Ogrenci("ali",5,3);
        Ogrenci ogr2 = new Ogrenci("veli",4,2);
        Ogrenci ogr3 = new Ogrenci("ayse",3,5);
        Ogrenci ogr4 = new Ogrenci("fatma",6,6);
        ArrayList<Ogrenci> liste = new ArrayList<Ogrenci>();
        liste.add(ogr1);
        liste.add(ogr2);
        liste.add(ogr3);
        liste.add(ogr4);
        // deneme


        for (Ogrenci student:liste) {
            System.out.println("No  " + " Ad  " + " Mat " + " Alm");
            System.out.println(student.Adsoyad());
            System.out.println("Ogrencinin Not ortalamasi: " + student.Ort());

        }

        int enDusukNot = ogr1.almNot;
        int enYuksekNot = ogr1.matNot;

        for (Ogrenci not: liste) {

            if(enDusukNot > not.almNot){
                enDusukNot = not.almNot;
            }
            if(enYuksekNot < not.matNot){
                enYuksekNot = not.matNot;
            }
        }
        System.out.println("Almancada endusuk not alan ogrenci " + enDusukNot);
        System.out.println("Matematikte en yuksek alan ogrenci " + enYuksekNot);


    }
}
