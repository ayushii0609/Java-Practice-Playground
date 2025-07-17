import java.util.*;
public class PrefixSum {
//    static int[] makePrefixSumArray(int[] a){
        //Using a new array
    /*    int[] pref=new int[n];
        pref[0]=a[0];
        for (int i = 1; i < n; i++) {
            pref[i]=pref[i-1]+a[i];
        }
        return pref;*/

        //Without using new array
    /*    for (int i = 1; i < a.length; i++) {
            a[i]=a[i]+a[i-1];
        }
        return a;
    }*/

  /*  static int[] makeSuffixSumArray(int[] a){
        for(int i=a.length-1;i>=0;i--){
            a[i]=a[i]+a[i+1];
        }
        return a;
    }*/

    static int findArraySum(int[] a) {
        int totalSum = 0;
        for (int i = 0; i < a.length; i++) {
            totalSum=totalSum+a[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] a){
        int totalSum=findArraySum(a);
        int prefSum=0;
        for (int i = 0; i < a.length; i++) {
            prefSum=prefSum+a[i];
            int suffixSum=totalSum-prefSum;
            if(prefSum==suffixSum){
                return true;
            }
        }
        return false;
    }
/*    static void printArray(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] a=new int[n];
    //    int[] a=new int[n+1];
        System.out.println("Enter array elements");
        //0 based indexing
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        //1 based indexing
    /*    for (int i = 1; i <=n; i++) {
            a[i]=sc.nextInt();
        }*/
   /*     System.out.println("Array is");
        printArray(a);*/
    //    int[] pref=makePrefixSumArray(a);
    //    int[] suf=makeSuffixSumArray(a);

    /*    System.out.println("New Array");
        printArray(pref);
        System.out.println("Enter number of queries");
        int q=sc.nextInt();
        while(q-- >0){
            System.out.println("Enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=pref[r]-pref[l-1];
            System.out.println("Sum "+ans);
        }*/
        System.out.println("Equal Sum Partition possible :"+equalSumPartition(a));
    }
}
