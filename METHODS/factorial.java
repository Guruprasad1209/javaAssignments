//Finding factoral of given number
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Factorial");
        int a = sc.nextInt();
        factorial obj=new factorial();
        int c= obj.fact(a);
        System.out.println("factorial of given number is    "+c);
    }


     int fact(int x)
    {
        int fact=1;

        for(int i=1; i<=x; i++)
        {
            fact=fact*i;

        }

        return fact;
    }



}
