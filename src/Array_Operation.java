import java.util.*;
public class Array_Operation {
    static void printArray(int[] ar,int n ){
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    static void insertArray(int[] ar,int I, int v, int n){
        for(int i=n-1;i>=I;i--){
            ar[i+1]=ar[i];
        }
        ar[I]=v;
        n=n+1;
        System.out.println("Array after insertion:");
        printArray(ar,n);
    }


    static void deleteArray(int[] ar,int n,int I){
        for (int i = I; i <=n ; i++) {
            ar[i]=ar[i+1];
        }
       // n=n-1;
        System.out.println("Array after deletion:");
        printArray(ar,n);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] ar=new int[10];
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        printArray(ar,n);
        System.out.println("Enter index and value:");
        int I=sc.nextInt();
        int v=sc.nextInt();
        insertArray(ar,I,v,n);
        deleteArray(ar,n,I);
    /*    System.out.println("Array after insertion:");
        printArray(ar,n);*/
    }
}
