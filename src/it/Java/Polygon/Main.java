package it.Java.Polygon;

import it.Java.Polygon.Interface.Quadrato;
import it.Java.Polygon.Interface.Rettangolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci la misura del primo lato di un poligono: ");
        int lato1 = Integer.parseInt((in.nextLine()));
        System.out.println("Inserisci la misura del secondo lato di un poligono: ");
        int lato2 = Integer.parseInt((in.nextLine()));
        System.out.println("Inserisci la misura del terzo lato di un poligono: ");
        int lato3 = Integer.parseInt((in.nextLine()));
        System.out.println("Inserisci la misura del quarto lato di un poligono: ");
        int lato4 = Integer.parseInt((in.nextLine()));

        if (lato1 == lato2 && lato1 == lato3 && lato1 == lato4){
            Quadrato quadr = new Quadrato(lato1);
            System.out.println("Il poligono è un quadrato, la sua area è: "+quadr.calcArea()+" e il suo perimetro è:"+quadr.calcPerimetro()+"");
        } else {
            Rettangolo rett = new Rettangolo(lato1, lato2, lato3, lato4);
            System.out.println("Il poligono non è un quadrato, la sua area è: "+rett.calcArea()+" e il suo perimetro è:"+rett.calcPerimetro()+"");
        }


        in.close();
    }
}