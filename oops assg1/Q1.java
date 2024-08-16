import java.util.*;
public class Q1{
    public static int fact(int n){
        if (n==1 || n==0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num= sc.nextInt();
        if (num<0){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        System.out.println("Factorial: "+ fact(num));
        sc.close();
    }
}