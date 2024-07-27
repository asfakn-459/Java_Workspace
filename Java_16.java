import java.util.Scanner;

public class Java_16 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        double get = scan.nextDouble();
        if (get < 0.0){
            System.out.print(get + " is a Negative Number ");
        }
        else if (get > 0.0){
            System.out.print(get + " is a Positive Number");
        }
        else{
            System.out.print(get + " is a 0 ");
        }
    }
}
