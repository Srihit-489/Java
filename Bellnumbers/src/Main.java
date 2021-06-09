import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        int S[][] = new int[n+1][n+1];
        int B[] = new int[n+1];
        System.out.println("The nth bell number is : "+Bell(n-1,B,S));
    }
    public static int Bell(int n,int[] B,int S[][]){
        if(n == 1){
            return 1;
        }else if(B[n] != 0){
            return B[n];
        }else{
            int sum = 0;
            for(int i=1;i<=n;i++){
                sum = sum + part(n,i,S);
            }
            B[n] = sum;
            return B[n];
        }
    }
    public static int part(int n,int k,int[][] S){
        if(k == 1 || k == n){
            return 1;
        }else if(S[n][k] != 0){
            return S[n][k];
        }else{
            S[n][k] = k*part(n-1,k,S) + part(n-1,k-1,S);
            return S[n][k];
        }
    }
}
