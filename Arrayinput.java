import java.util.Scanner;

public class Arrayinput {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int [][]arr=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++)arr[i][j]=in.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    

}
