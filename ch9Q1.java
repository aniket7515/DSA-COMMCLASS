import java.util.Scanner;

public class ch9Q1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str="Aniket Dhokane";
        char target=in.next().charAt(0);
        System.out.println(Search(str,target));

    }
    static boolean Search(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
