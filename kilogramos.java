package com.company;

import java.util.*;
public class Main {
    public static void main(String[]args)    {
        int x,y,p;

        Scanner lee = new Scanner(System.in);
        System.out.println("Kilogramos: ");
        x = lee.nextInt();

        y = 11/5;

        p=prom(x,y);
        System.out.println("son "+p +" libras aproximadamente");
    }
    public static int prom(int q, int w){
        return (q*w);
    }
}