public class ch9Q3 {
    public static void main(String[] args) {
        // To find the minimum element in an array
        int[] arr={23,45,67,86,342,3567,5732,-2};
        int answer=min(arr);
        System.out.println("The minimum array in the array is : "+ answer);


    }

    static int min(int[] arr) {
        // assume the min element is the first element in an array
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
