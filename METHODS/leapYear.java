import java.sql.SQLOutput;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        year(year);

    }

static void year(int x)
        {
           if(x%400==0 || x%4==0 && x%100!=0 )
            {
                System.out.println(" leap year= "+x);
           }
           else
           {
            System.out.println(" Not a leap year= "+x);
        }
        }


}
