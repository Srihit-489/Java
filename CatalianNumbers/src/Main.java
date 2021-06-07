import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] esr){
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int arr[] = new int[n+1];
        System.out.println("The nth catalian number is "+cat(n-1,arr));
        scanner.close();
    }
    public static int cat(int n,int[] arr){
        if(n == 0){
            return 1;
        }else if(arr[n] != 0){
            return arr[n];
        }
        else{
            int temp = 0;
            for(int i=0;i<n;i++){
                temp = temp + cat(i,arr)*cat(n-i-1,arr);
            }
            arr[n] = temp;
            return temp;
        }

    }
}
