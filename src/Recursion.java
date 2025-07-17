import java.util.*;
public class Recursion {
/*    static int factorial(int n){
        if(n==0 || n==1) return 1;
        else return n*factorial(n-1);
    }*/

/*    static int power(int a,int b){
        if(b==0) return 1;
        else if(b==1) return a;
        else return a*power(a,b-1);
    }*/


    static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a% b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    /*    System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println(factorial(n));*/


        System.out.println("Enter numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
    //    System.out.println(power(a,b));
        System.out.println(gcd(a,b));

    }
}
