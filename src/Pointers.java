import java.util.Scanner;

import static java.lang.Math.abs;

public class Pointers {

 /*   static void sortZerosOnes(int[] ar){
        int n=ar.length;
        int c=0;
        for (int i = 0; i < n; i++) {
            if(ar[i]==0) c++;
        }
        for (int i = 0; i < n; i++) {
            if(i<c) ar[i]=0;
            else ar[i]=1;
        }
    }*/
/*    static void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    static void reverseArray(int[] ar){
        int i=0, j=ar.length-1;
        while(i<j){
            swap(ar,i,j);
            i++;
            j--;
        }
    }*/

    static int[] sortSquares(int[] ar){
        int n=ar.length;
        int left=0, right=n-1;
        int[] ans=new int[n];
        int k=n-1;

        while(left<=right){
            if(abs(ar[left])>abs(ar[right])){
                ans[k--]=ar[left]*ar[left];
                left++;
            }
            else{
                ans[k--]=ar[right]*ar[right];
                right--;
            }
        }
        return ans;
    }


 /*   static void sortZeroesAndOnes(int[] ar){
        int n=ar.length;
        int left=0;
        int right=n-1;
        while(left<right) {
            if(ar[left]==1 && ar[right]==0){
                swap(ar,left,right);
                left++;
                right--;
            }
            else if(ar[left]==0) left++;
            else if(ar[right]==1) right--;
            }
        }*/

/*    static void sortEvenOdd(int[] ar){
        int n=ar.length;
        int left=0;    // left and right are called pointers
        int right=n-1;
        while(left<right) {
            if(ar[left]%2!=0 && ar[right]%2==0){
                swap(ar,left,right);
                left++;
                right--;
            }
            else if(ar[left]%2==0) left++;
            else if(ar[right]%2!=0) right--;
        }
    }*/




    static void printArray(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
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
        System.out.println("Original Array");
        printArray(ar);
    //    sortZerosOnes(ar);
    //    sortZeroesAndOnes(ar);
    //    sortEvenOdd(ar);
        int[] ans = sortSquares(ar);
        System.out.println("Sorted Array");
    //    reverseArray(ans);
        printArray(ans);
    }
}
