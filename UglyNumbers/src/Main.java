import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the value n : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("The nth ugly number is "+ugly(n));
        scanner.close();
    }
    public static int ugly(int n){
        int count = 0;
        int runner  = 1;
        while(true){
            if(checkUgly(runner)){
                count++;
                if(count == n){
                    return runner;
                }
            }
            runner = runner+1;
        }
    }

    public static boolean checkUgly(int num){
        int req = num;
        double count = 0;
        while(true){
            if(req%Math.pow(2.0,count) != 0){
                break;
            }
            count = count + 1;
        }
        req = (int) (req/Math.pow(2.0,count-1));
        if(req == 1){
            return true;
        }
        count = 0;
        while(true){
            if(req%Math.pow(3.0,count) != 0){
                break;
            }
            count = count + 1;
        }
        req = (int) (req/Math.pow(3.0,count-1));
        if(req == 1){
            return true;
        }
        count = 0;
        while(true){
            if(req%Math.pow(5.0,count) != 0){
                break;
            }
            count = count + 1;
        }
        req = (int) (req/Math.pow(5.0,count-1));
        if(req == 1){
            return true;
        }
        return false;
    }
}

