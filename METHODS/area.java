import java.util.Scanner;
public class area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Base and Height");
        int base = sc.nextInt();
        int Height = sc.nextInt();
        area obj = new area();
        area obj_rect = new area();
        int area = obj.triangle(base, Height);
        int area_rect = obj_rect.Rectangle(base, Height);
        System.out.println("area of triangle is "+area);
        System.out.println("area of rectangle is "+area_rect);

        area Square=new area();
        int area_square=Square.Square(base);
        System.out.println("Area of Square "+area_square);

    }

    int triangle(int b, int h) {
        int a;
        a = (b * h) / 2;

        return a;
    }

    int Rectangle(int b,int h)
    {
        int a;
        a=h*b;
        return a;
    }

    int Square(int b){
      int  a=(b*b);
        return a;
    }
}

