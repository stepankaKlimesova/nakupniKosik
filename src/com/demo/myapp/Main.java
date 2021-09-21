package com.demo.myapp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {       //zkratka psvm
        System.out.println("HELLO HELL");


        Scanner sc=new Scanner(System.in);

        boolean run =true;
        //int rum=1;
        while (run){


        System.out.println("zadej cislo a");
        double a=Integer.parseInt(sc.nextLine());

        System.out.println("zadej cislo b");
        double b=Integer.parseInt(sc.nextLine());
        double result;

        System.out.println("zadej matematickou operaci +; -; /; *; " );
        String mathop=sc.next();

        if(mathop.equals("+")){
            result=a+b;
            System.out.println(a+" + "+b+" = "+result);
        }else if(mathop.equals("-")){
            result=a-b;
            System.out.println(a+" - "+b+" = "+result);
        }else if(mathop.equals("*")){
            result=a*b;
            System.out.println(a+" * "+b+" = "+result);
        }
        else if(mathop.equals("*")){
            result=a/b;
            System.out.println(a+" / "+b+" = "+result);
        }

        System.out.println("dalsi zadani ano/ne");
        String conf=sc.nextLine();

        if(conf.equals("ne")){
            run=false;
        }

        }

        /*

        AND &&

        0 0 - 0
        1 0 - 0
        0 1 - 0
        1 1 - 1

        OR ||

        0 0 - 0
        1 0 - 1
        0 1 - 1
        1 1 - 1


         */

       /*
   firstFor:
        for (int i = 0; i < 21; i++) {
         secondFor:
            for (int j = 0; j < 21; j++) {
                if(j==5){
                    break firstFor;
                }
                System.out.println(j);

            }

            for (int j = 0; j < 21; j++) {
                if(i==5){
                    continue;
                }
                System.out.println(i);
            }

            */
        /*
        boolean isValid =false;

        do {
            System.out.println("ahoj");
        } while (isValid);

        } // do While bez ohledu na podminku se cyklus provede minimalne jednou



        int[] array = {1,2,3,4,5,6};

        System.out.println(array[3]); //vypsani ctvrteho cisla
        array[4]=250; //prepsani hodnoty v poli
        System.out.println(Arrays.toString(array)); // vypsani pole
        System.out.println(Arrays.sort(array);); // serazeni pole pole

        array (int i : array){
            System.out.println(i);
        }

        for (int index = 0; index < array.length ; index++) {
            System.out.println(array[index]);
        }

*/



    }

}
