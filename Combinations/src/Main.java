import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the values of n and r : ");
        double n = scanner.nextDouble();
        double r = scanner.nextDouble();
        System.out.println("The value of C(n,r) is "+(int)C(n,r));
    }
    public static double C(double n,double r){
        if(r == 0){
            return 1;
        }else if(r == 1){
            return n;
        }else{
            return (n/r)*C(n-1,r-1);
        }
    }
}
