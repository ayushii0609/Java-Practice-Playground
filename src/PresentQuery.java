import java.util.Scanner;

public class PresentQuery {
    static int[] makeFrequencyArray(int[] ar){
        int[] freq=new int[100005];
        for (int i = 0; i < ar.length; i++) {
            freq[ar[i]]++;
        }
        return freq;
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
        int[] freq=makeFrequencyArray(ar);
        System.out.println("Enter number of queries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter number to be searched ");
            int x=sc.nextInt();
            if(freq[x]>0) System.out.println("YES");
            else System.out.println("NO");
            q--;
        }

    }
}
