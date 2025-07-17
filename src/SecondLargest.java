import java.util.Scanner;

public class SecondLargest {
    static int findMax(int[] ar) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] ar) {
        int max = findMax(ar);
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == max) {
                ar[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(ar);
        return secondMax;
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
        System.out.println("Second Largest is : " + findSecondMax(ar));
    }
}
