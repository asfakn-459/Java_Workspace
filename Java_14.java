import java.util.Scanner;

public class Java_14 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = scan.nextInt();
        boolean leap = false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;

            }else
                leap =true;

        }else
            leap=false;
            if (leap)
                System.out.print(year + " is a leap year");
            else
                System.out.print(year + " is  not a leap year");


    }
}
