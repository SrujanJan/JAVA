import java.util.Scanner;
public class Switch {

    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("enter a fruit");
        String k=input.next();
    //    switch (k) {
    //     case "mango":
    //         System.out.println("The fruit is: "+k);
    //         break;
    //    case "grape":
    //         System.out.println("The fruit is :"+k);
    //         break;
    //     default:
    //         System.out.println("the entered value is : "+k);
    //         break;
    //    }
    switch(k){
        case "mango"->System.out.println("The fruit is: "+k);
        case "grape"->System.out.println("The fruit is :"+k);
        default->System.out.println("the entered value is : "+k);
    }
    }
}
