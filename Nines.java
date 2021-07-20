import java.util.Scanner;

class Nines{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("Enter the value of n : ");
		int n = scanner.nextInt();
		int[] arr = new int[n+1];
		System.out.println(Nines(n,arr));
	}
	public static int Nines(int n,int[] arr){
		if(arr[n] != 0){
			return arr[n];
		}else if(n%10 == 9){
			return 1;
		}else{
			int var = n;
			int rem = n%9;
			if(rem == 0) return n/9;
			rem = n%10;
			rem = rem+1;
			int i = 0;
			while(i != (n-rem)/10){
				int a = Nines(var-rem-10*i,arr);
				int b = Nines(rem+10*i,arr); 
				if(  a != -1 && b != -1){
					arr[n] = a + b;
					return arr[n];
				}
				i++;
			}
			return -1;
		}
	}
	
	
}
