import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int input = scanner.nextInt();
        double[] data = new double[input+1];
        data[1] = 1;
        data[2] = 2;
        double result = getseries(input,data);
        System.out.println("The result is "+result);
    }

    public static double getseries(int input,double[] data){
        if(input == 1){
            return 1;
        }else{
            return (input/fact(input,data))+getseries(input-1,data);
        }
    }

    public static double fact(int n,double[] data){
        if(data[n] != 0){
            return data[n];
        }else{
            return n*fact(n-1,data);
        }
    }


}
