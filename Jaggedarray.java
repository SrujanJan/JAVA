public class Jaggedarray {
    public static void main(String[] args) {
        // int [] a1={1,2,3};
        // int [] a2={12,3,4,56};
        // int [] A3={1,2,3,4,5};
        // int [][] a={a1,a2,A3};
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int[][] arr=new int [3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[5];
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=cnt++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
