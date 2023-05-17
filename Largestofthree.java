import java.util.Scanner;

public class Largestofthree {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=Math.max(Math.max(a,c), b);
        System.out.println("The maximum is : "+max);
    }
}
