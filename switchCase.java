import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the fruits name :");

        String fruit=in.next();

        switch (fruit){
            case "Apple":
                System.out.println("red fruit");
                break;
            case "Banana":
                System.out.println("Yellow fruit");
                break;
            case "Orange":
                System.out.println("Juicy fruit");
            default:
                System.out.println("Enter the valid fruit");


        }
    }
}
