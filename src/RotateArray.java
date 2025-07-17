import java.util.Scanner;

public class RotateArray {
   /* static int[] rotate(int[] ar, int k){
        int n=ar.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;

        for (int i = n-k; i <n ; i++) {   //right part of array
            ans[j++] = ar[i];
        }
        for (int i = 0; i < n-k; i++) { ////remaining left part
            ans[j++]=ar[i];
        }
        return ans;
    }*/
   static void swapInArray(int[] ar, int i, int j){
       int temp=ar[i];
       ar[i]=ar[j];
       ar[j]=temp;
   }
    static void reverse(int[] ar, int i, int j){
        while(i<j){
            swapInArray(ar,i,j);
            i++;
            j--;
        }
    }
    static void rotateArrayInPlace(int[] ar,int k){
        int n=ar.length;
        k=k%n;
        reverse(ar,0,n-k-1);
        reverse(ar, n-k, n-1);
        reverse(ar,0,n-1);
    }



    static int printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k");
        int k=sc.nextInt();
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements :");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Original array");
        printArray(ar);
    /*    int[] ans=rotate(ar,k);
        System.out.println("Array after rotation :");
        printArray(ans);*/
        rotateArrayInPlace(ar,k);
        System.out.println("Array after rotation ");
        printArray(ar);
    }
}
