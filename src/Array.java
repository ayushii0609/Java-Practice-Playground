import java.util.Scanner;

class Ques{
 /**   int count(int[] ar, int x){
        int c=0;
        for(int i=0;i<ar.length;i++) {
            if(ar[i]==x) c++;
            else continue;
        }
        return c;
    }*/

 //Last Occurrence of element x in array
 /*    int lastOccurrenece(int[] ar,int x)
     {
         int last=-1;
         for(int i=0;i<ar.length;i++){
             if(ar[i]==x){
                 last=i;
             }
         }
         return last;
     }*/

    //Count number of elements strictly greater than x
/*     int countElements(int[] ar, int x){
         int c=0;
         for(int i=0;i<ar.length;i++)
         {
             if(ar[i]>x) c++;
         }
         return c;
     }*/

    //To check if array is sorted or not
    boolean isSorted(int[] ar){
        boolean check=true;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i+1]<ar[i]){
                check = false;
                break;
            }
        }
        return check;
    }




}
public class Array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
    /*    System.out.println("Enter x ");
        int x=sc.nextInt();*/
        Ques obj=new Ques();
        System.out.println("Is Sorted "+obj.isSorted(ar));
    }
}
