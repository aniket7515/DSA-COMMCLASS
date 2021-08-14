import java.util.Scanner;

public class ch9 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int[] nums={23,546,68,45,3424,5,46,6,53,5,24,};
        System.out.println("Enter the target to be find : ");
        int target=in.nextInt();

        int ans=LinearSearch(nums,target);

        System.out.println(ans);


    }

    static int LinearSearch(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }
        // Run a for loop
        for(int index=0;index<arr.length;index++){
            //Check for a element at every index
            int element =arr[index];
            if(element==target){
                return index;
            }
        }
        // This Line will execute if none of the above statement have been executed
        //  Hence the target not found
        return -1;





    }
}
