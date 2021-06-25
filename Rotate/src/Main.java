import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the size of Array (n) : ");
        n = scanner.nextInt();
        System.out.println("Enter the array elements :");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
           // scanner.nextLine();
        }
        System.out.print("Enter the value of k :");
        int k = scanner.nextInt();
        int[] arrayAfterRotation = rotateArray(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(arrayAfterRotation[i]+" ");
        }
        System.out.println();
    }

    public static int[] rotateArray(int[] arr,int k){
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[(i+k)%arr.length] = arr[i];
        }
        return result;
    }


}
