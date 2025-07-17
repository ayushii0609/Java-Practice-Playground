import java.util.*;
public class QuickSort {
    static void printArray(int[] a,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void quickSort(int[] a, int b, int e){
        if(b<e){
            int l=b;
            int r=e;
            int k=b;
            while(true){
                while(a[r]>=a[k] && k!=r) r=r-1;
                if(k==r) break;
                if(a[r]<a[k]){
                    int t=a[r];
                    a[r]=a[k];
                    a[k]=t;
                    k=r;
                }
                while(a[l]<=a[k] && l!=k) l=l+1;
                if(k==l) break;
                if(a[l]>a[k]){
                    int t=a[l];
                    a[l]=a[k];
                    a[k]=t;
                    k=l;
                }
            }
            quickSort(a,b,k-1);
            quickSort(a,k+1,e);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int[] a=new int[10];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Original array");
        printArray(a,n);
        quickSort(a,0,n-1);
        System.out.println("Sorted array");
        printArray(a,n);
    }
}
