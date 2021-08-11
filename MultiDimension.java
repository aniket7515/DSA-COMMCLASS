import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        // TO set the multidimensional array

        /*
        arr= 1 2 3
             4 5 6
             7 8 9
         */
        /*
        int[][] arr2D={
                {1,2,3},   // 0 th index
                {23,45,6}, // 1 st index
                {4,6,8}    //3rd index

        };
        */

        // Taking the input for the multidimensional array
         int [][] arr= new int[3][3];

         for (int row=0;row<arr.length;row++){
             //for each column in every row
             for(int col=0;col<arr[row].length;col++){
                 arr[row][col]= in.nextInt();
             }
         }

         // Output
        /*
        for (int row=0;row<arr.length;row++){
            //for each column in every row
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        */
         //output-3
        /*
        for(int[ ]a:arr){
            System.out.println(Arrays.toString(a));
        }
             */


    }
}






