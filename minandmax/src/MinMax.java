import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int minnumber = 1000000;
        int maxnumber = -1;
        while(true){
            System.out.println("Enter the number = ");
            boolean check;
            check = scanf.hasNextInt();
            if(check){
                int temp;
                temp = scanf.nextInt();
                if(temp > maxnumber)
                    maxnumber = temp;
                if(temp < minnumber)
                    minnumber = temp;
                scanf.nextLine();

            }else{
                System.out.println("The minimum number is "+minnumber+" and the maximum number is "+maxnumber);
                break;
            }
        }
    }
}
