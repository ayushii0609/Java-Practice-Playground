import java.util.Scanner;

public class ArrayManipulation {
    static int uniqueElement(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = (i + 1); j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    ar[i] = -1;
                    ar[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 0) {
                ans = ar[i];
            }
        }
        return ans;
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
        System.out.println("Unique element : "+uniqueElement(ar));
    }
}
