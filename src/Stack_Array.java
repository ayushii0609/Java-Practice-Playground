import java.util.*;
public class Main
{
    static void printArray(int[] a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void mergeSort(int[] a,int b,int e){
        if(e>b){
            int m=(b+e)/2;
            mergeSort(a,b,m);
            mergeSort(a,m+1,e);
            merge(a,b,m,e);
        }
    }
    static void merge(int[] a,int b,int m,int e){
        int i=b;
        int j=m+1;
        int k=b;
        int c[]=new int[50];
        while(i<=m && j<=e){
            if(a[i]<a[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=a[j++];
            }
        }
        while(i<=m){
            c[k++]=a[i++];
        }
        while(j<=e){
            c[k++]=a[j++];
        }
        for(int p=b;p<=e;p++){
            a[p]=c[p];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[50];
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array:");
        printArray(a,n);
        mergeSort(a,0,n-1);
        System.out.println("Sorted Array:");
        printArray(a,n);
    }
}
