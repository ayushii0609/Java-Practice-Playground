import java.util.*;
public class TargetSum{
    static int tripletSum(int[] ar,int x){
        int c=0;
        for (int i = 0; i < ar.length; i++) {      //first number
            for (int j =(i+1); j < ar.length; j++) {         //2nd number
                for(int k=(j+1);k<ar.length;k++)   ///3rd number
                {
                    if(ar[i]+ar[j]+ar[k]==x)
                        c++;
                }
            }
        }
        return c;
    }


 /*   static int pairSum(int[] ar, int x)
    {
        int c=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = (i+1); j<ar.length; j++) {
                if (ar[i] + ar[j] == x)
                    c++;
            }
        }
        return c;
    }*/


 /*   static int printArray(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        return 0;
    }*/

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter array elements :");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter sum value");
        int x=sc.nextInt();
    //    printArray(ar);
     //   System.out.println("Number of pairs : "+pairSum(ar,x));
        System.out.println("Number of triplets : "+tripletSum(ar,x));
    }
}

