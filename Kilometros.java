package com.company;

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[]arg){
        Scanner leer=new Scanner(System.in);
        double j,r;

        System.out.print("Ingrese la cantidad de kilometros: ");
        j=leer.nextInt();


        r=(1.609)*j ;
        System.out.println("Son : "+r +" millas");

    }
}