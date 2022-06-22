public class array_sum {
    public static void main(String[] args) {

        int [] arr={10,20,30,40,50};
        int i=0;
        int sum=0;

        for(i=0; i<arr.length;  i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("The Total sum of Array elements "+sum);

    }
}
