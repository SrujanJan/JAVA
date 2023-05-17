import java.util.Scanner;
public class Casting  {
    public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.println("enter a number for type casting(flaot):");
  float fs=input.nextFloat();
  System.out.println("enter a number for type casting:"+(int)(fs));
    }
}
