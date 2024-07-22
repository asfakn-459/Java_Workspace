import java.util.Scanner;
class Solution {
    public static String checkAge(int age) {
        if(age >= 18){
            return "Can Enter";
        } else {
            return "Cannot Enter";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.println(checkAge(age));
    }
}
