import java.util.*;
public class TowerOfHanoi {
    static void TOH(int n,char S,char T,char D){
        if(n>0){
            TOH(n-1,S,D,T);
            System.out.println(S+"-->"+D);
            TOH(n-1,T,S,D);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of disks:");
        int n=sc.nextInt();
        char start='L',temp='C',end='R';
        TOH(n,start,temp,end);
    }
}
