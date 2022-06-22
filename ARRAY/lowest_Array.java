public class lowest_Array {
    public static void main(String[] args) {

        int [] arr={50,20,30,40,50,6};

        int i=0;
        int small=arr[0];

        for( i=0; i<arr.length;i++){

            if (small>arr[i])
            {
                small = arr[i];
            }

        }
        System.out.println(+small);


    }
}
