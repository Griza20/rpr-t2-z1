package org.example;

public class Matematika {
    public static int faktorijel(int n){
        int fakt=1;
        for(int i=1;i<=n;i++){
            fakt*=i;
        }
        return fakt;
    }
    public static double sinus(double n){
        double suma=0;
        int predznak=1, koef=1;
        n = n * Math.PI/180;
        for(int i=1;i<=10;i++){
            suma+= (double)predznak*Math.pow(n,koef)/faktorijel(koef);
            predznak*=-1;
            koef+=2;
        }
        return suma;
    }
}
