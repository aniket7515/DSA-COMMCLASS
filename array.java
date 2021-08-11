import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        // Arrays in java
        // Syntax of Array
        // data_type Var_name=new data_type[size]

        //int[] rno= new int[5];
        // or directly
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int[] arr= new int[n];

        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
