import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the value of n :");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the value of x :");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("The value of pow(n,x) is : "+pow(n,x));
    }
    public static int pow(int n,int x){
        if(x == 0){
            return 1;
        }else if(x%2 == 0){
            return pow(n,x/2)*pow(n,x/2);
        }else{
            return n*pow(n,x/2)*pow(n,x/2);
        }
    }
    public static int mergeAnswer(int num1,int num2){
        return num1*num2;
    }
}
