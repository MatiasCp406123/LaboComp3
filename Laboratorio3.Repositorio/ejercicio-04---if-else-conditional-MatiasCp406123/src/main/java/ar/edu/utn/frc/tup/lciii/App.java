package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * if - else Conditional!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero par o impar:");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // Write your code here
        if(n%2!=0)
        {
         System.out.println("raro");
        }else
        {
          if(n>=2 &&n<=5)
          {
              System.out.println("No raro");
          }else if(n>=6&&n<=20)
          {
              System.out.println("raro");
          }
          else
          {
              System.out.println("No raro");
          }
        }
        scanner.close();
    }
}
