import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();
       main(num);
    }
    static void main(int x) {
        if (x % 2 == 0) {
            System.out.println("print the number is even");
        } else {
            System.out.println("print the number is odd");
        }
        return;

    }
}


