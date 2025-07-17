import java.util.*;
public class ArraySearch {
/*    static int linearSearch(int[] a, int n, int t){
        for(int i=0;i<n;i++){
            if(a[i]==t){
                return i;
            }
        }
        return -1;
    }*/

    //Method 1
    /*static int binarySearch(int[] a,int b,int e,int t){
        while(b<=e)
        {
            int m=(b+e)/2;
            if(t==a[m]) return m;
            else if(t>a[m]) b=m+1;
            else e=m-1;
        }
        return -1;
    }*/

    //Method 2
    static int binarySearch(int[] a,int n, int t){
        int pos=-1;
        int b=0;
        int e=n-1;
        while(b<=e)
        {
            int m=(b+e)/2;
            if(t==a[m]){
                pos=m;
                break;
            }
            else if(t>a[m]) b=m+1;
            else e=m-1;
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int t=sc.nextInt();
    //    int r=linearSearch(a,n,t);
    //    int r=binarySearch(a,0,n-1,t);
        int r=binarySearch(a,n,t);
        if(r==-1) System.out.println("Element not found");
        else System.out.println("Element found at "+r);
    }
}
