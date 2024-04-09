package ar.edu.utn.frc.tup.lciii;

import java.awt.*;

/**
 * Hello Java!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num=1;
        String nom="Juan";
        String cadena="hola";
        String nuevo=cadena.concat(nom);
        System.out.println(nuevo);
        boolean flag=true;
        if(nom.contains("ua")){
            System.out.println("Nombre: "+nom+nuevo.charAt(0));
        }
        else{ System.out.println("eRROR" );}
        if(flag==true){System.out.println("Flag: "+flag);}
        else{ System.out.println("eRROR" );}
        System.out.println("Numero: "+num);
        int a=0;
        while(a<5){
            System.out.println("Numero:"+a);
            a++;
        }
        do{
            System.out.println("Numero:"+a);
            a++;
    }
        while (a<5);
        //for(int i=0;i<ó;i++){
        //    System.out.println(i);
       // }

        //for(String s:nuevo){
        //recorre listas.
       // }
        /* Enter your code here. Print output to STDOUT */

    }
}
