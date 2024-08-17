public class Java_19 {
    public static String replaceSmiley(String text) {
        return text.replace(":)","\uD83D\uDE0A");
    }
    public static void main(String [] args){
        String input = "Hello there :)";
        String output = replaceSmiley(input);
        System.out.println(output);
    }
}
