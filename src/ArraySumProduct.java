import java.util.*;
public class ArraySumProduct {
    static void printArray(int[][] a,int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j<c; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void sum(int[][] a,int[][] b, int r1, int c1,int r2, int c2){
        if(r1==r2 && c1==c2) {
            int x[][] = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    x[i][j] = a[i][j] + b[i][j];
                }
                System.out.println();
            }
            printArray(x, r1, c1);
        }
        else System.out.println("Not possible");
    }
    static void product(int[][] a,int[][] b, int r1, int c1,int r2, int c2){
        if(c1!=r2) System.out.println("Not possible");
        else{
            int x[][]=new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        x[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            printArray(x, r1, c2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns for 1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter rows and columns for 2");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("Enter array elements for 1");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter array elements for 2");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Original 1st Array");
        printArray(a,r1,c1);
        System.out.println("Original 2nd Array");
        printArray(b,r2,c2);
        System.out.println("Sum is ");
        sum(a,b,r1,c1,r2,c2);
        System.out.println("Product is ");
        product(a,b,r1,c1,r2,c2);
    }
}
