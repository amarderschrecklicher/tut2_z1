package org.example;

public class Mathe {

  public static  double Faktorijel(int x)
    {
        if(x==0)return 1;
        return x*Faktorijel(x-1);
    }
    public static double Sinus(double x)
    {
       double suma=0; x*=Math.PI/180;int predznak=1;
        for(int i=1;i<20;i+=2){suma+=predznak*Math.pow(x,i)/Faktorijel(i); predznak*=-1;}
        return suma;
    }

}
