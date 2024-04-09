package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Loops & Math 2!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de iteraciones:");
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Ingrese a:");
            int a = in.nextInt();
            System.out.println("Ingrese b:");
            int b = in.nextInt();
            System.out.println("Ingrese n:");
            int n = in.nextInt();
            int sum = a;
            String resultado="";

            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum    + " 2");
            }
            resultado=resultado+" "+sum;
            System.out.println(resultado);

        }
        in.close();
    }
}
