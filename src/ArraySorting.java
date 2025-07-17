import java.util.*;
public class ArraySorting {
    static void printArray(int[] a,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
/*    static void BubbleSort(int[] a, int n){
        for (int i = 0; i < n-1; i++) {
            for (int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }*/
  /*  static void selectionSort(int[] a,int n){
        for (int i = 0; i < n; i++) {
            int min=a[i];
            int pos=i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<min){
                    min=a[j];
                    pos=j;
                }
            }
            int t=a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
    }*/
    static void insertionSort(int[] a,int n){
        for(int i=1;i<n;i++){
            int t=a[i];
            int j=0;
            for(j=i-1;j>=0;j--){
                if(a[j]>t){
                    a[j+1]=a[j];
                }
                else
                    break;
            }
            a[j+1]=t;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int a[]=new int[10];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    //    BubbleSort(a,n);
    //    selectionSort(a,n);
        insertionSort(a,n);
        printArray(a,n);
    }
}
