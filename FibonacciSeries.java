import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci series: ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Please enter a positive integer.");
        }else{
            System.out.println("Fibonacci series up to " + n + " terms:");
            int first=0,second=1;
            for(int i=1;i<=n;i++){
                System.out.println(first+" ");
                int next=first+second;
                first=second;
                second=next;
            }
        }

        sc.close();
    }
}
