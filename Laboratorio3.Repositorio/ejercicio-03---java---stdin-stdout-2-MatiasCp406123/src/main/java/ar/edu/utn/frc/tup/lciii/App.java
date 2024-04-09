package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Stdin & Stdout 2!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingreseuna cadena de texto");
        String b=scan.nextLine();
        System.out.println("Ingrese un numero");
        int i = scan.nextInt();
        System.out.println("Ingrese un numero con punto decimales");
        double a=scan.nextDouble();

        scan.close();
        // Write your code here.
        System.out.println("String:"+b+"\n"+"double:"+a+"\n"+"int:"+i);
        System.out.println("Int: " + i);
    }
}
