public class Java_13 {
    public static void main(String[]args){
        double n1=-4.5, n2=3.9,n3=2.5;
        if(n1>=n2 && n1>=n3){
            System.out.print(n1 + "is the largest number");
        }
        else if(n2>=n1 && n2>=n3){
            System.out.print(n2 + "is the largest number");
        }else{
            System.out.print(n3 + "is the largest number");
        }
    }
}
