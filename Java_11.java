import java.util.Scanner;

public class Java_11 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        String Alphabet = reader.next();
        if (Alphabet.equals("a")  || Alphabet.equals ("e") || Alphabet.equals("i") || Alphabet.equals("o") || Alphabet.equals("u"))
            System.out.println(Alphabet + " is a Vowel");
        else
            System.out.println(Alphabet + " is a consonant");

    }

}
