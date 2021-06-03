import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the fib number you want : ");
        int n = scanner.nextInt();
        System.out.println("The nth fib number is "+fib(n));
        long mem[] = new long[n+1];
        mem[1] = 1;
        mem[2] = 1;
        //System.out.println(modifiedFib(n,mem));
    }
    public static long modifiedFib(int n,long[] mem){
        if(mem[n] != 0){
            return mem[n];
        }else{
            mem[n] = modifiedFib(n-1,mem) + modifiedFib(n-2,mem);
            return mem[n];
        }
    }
    public static long fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
