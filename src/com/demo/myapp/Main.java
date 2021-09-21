package com.demo.myapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("vyberte polozky");
        ArrayList<ArrayList<String>> sortiment = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < 10; i++) {
            ArrayList<String> o = new ArrayList<String>();

            o.add("" + i);
            o.add("produkt " + i);
            o.add("" + (i + 5) * 5);
            sortiment.add(o);
        }

        System.out.println("Zbozi:");
        for (int j = 0; j < sortiment.size(); j++) {
            ArrayList<String> radek = sortiment.get(j);
            String msg = "ID " + radek.get(0) + " / zbozi - " + radek.get(1) + " / cena" + radek.get(2) + " kč";
            System.out.println(msg);
        }

        ArrayList<ArrayList<String>> kosik = new ArrayList<ArrayList<String>>();
        int x = 0;
        while (x == 0) {
            System.out.println("Pro vlozeni zbozi do kosiku, zadejte ID:");
            int zadaneId = sc.nextInt();
            kosik.add(sortiment.get(zadaneId));
            int celkCena = 0;
            if (zadaneId == -1) {
                System.out.println("ukončuji nákup");
                sortiment.clear();
                kosik.clear();
                x = zadaneId;

            } else {


                for (int k = 0; k < kosik.size(); k++) {
                    ArrayList<String> radek = sortiment.get(k);
                    celkCena = celkCena + Integer.parseInt(radek.get(2));
                }
                System.out.println("celkova cena zbozi v kosiku: " + celkCena + " kč");
                System.out.println("pro ukonceni nakupu zadejte -1");
            }

        }
    }
}
