public class array_average {
    public static void main(String[] args) {

        int [] arr={10,20,30,40,50};
        int i=0;
        int sum=0;

        for(i=0; i<arr.length;  i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("The Total sum of Array elements "+sum);

        float Total_length=arr.length;
        float average=(sum/Total_length);
        System.out.println("The average of all the Array elements is "+average);


    }
}
