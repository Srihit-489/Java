import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;


class Main{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			PriorityQueue<Student> pq = new PriorityQueue<Student>(new Comp());
			for(int i=0;i<5;i++){
				System.out.print("Name of student "+i+" : ");
				  String name = scanner.nextLine();
				  System.out.print("Marks of student "+i+" : ");
				  int marks = scanner.nextInt();
				  scanner.nextLine();
				  pq.add(new Student(name,marks));
			}

			for(int i=0;i<5;i++){
				  Student stu = pq.poll();
				  System.out.println("Name is "+stu.getname()+" marks are +"+stu.getmarks());

			}
		


	  }
}
