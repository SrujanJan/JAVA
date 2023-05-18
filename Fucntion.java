import java.util.Scanner;

public class Fucntion {
 public static void main(String[] args) {
//    System.out.println(solve()); 
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
System.out.println(solve(a,b));

 }    
 static int solve(int a,int b){
    return a+b;
 }
//  static int  solve(){
// Scanner in=new Scanner(System.in);
// System.out.println("enter a: ");
// int a=in.nextInt();
// System.out.println("enter b: ");
// int b=in.nextInt();
// return a+b;
// // System.out.println(a+" + "+b+" = "+(a+b));
//  }
}
