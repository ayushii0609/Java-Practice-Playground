import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Questions{
    static int[] smallestAndLargest(int[] ar)
    {
        Arrays.sort(ar);
        int[] ans={ar[1],ar[ar.length-2]};
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] ar={1,8,99,45};
        Questions obj=new Questions();
        int[] arr = Questions.smallestAndLargest(ar);
        System.out.println("Smallest = "+arr[0]+ " Largest = "+arr[1]);
    }
}