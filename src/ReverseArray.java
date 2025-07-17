import java.util.Scanner;

public class ReverseArray {
 /*   static int[] reverseArray(int[] ar){
        int[] ans=new int[ar.length];
        int j=0;
        for (int i = ar.length-1; i >=0; i--) {
            ans[j++] = ar[i];   // j=0 pe i=n-1 ki value assign hoga and so on....
        }
        return ans;
    }*/
    static void swapInArray(int[] ar, int i, int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    static void reverseArray(int[] ar){
        int i=0, j=ar.length-1;
        while(i<j){
            swapInArray(ar,i,j);
            i++;
            j--;
        }
    }
    static int printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements :");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
     /*   int[] ans=reverseArray(ar);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }*/
        reverseArray(ar);
        printArray(ar);
    }
}
