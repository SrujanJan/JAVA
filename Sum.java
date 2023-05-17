import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a and b values: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("The sum: "+(a+b));
        System.out.println("enter a and b values as float: ");
        float a1=input.nextFloat();
        float b1=input.nextFloat();
        System.out.println("The sum: "+(a1+b1));

    }
}
