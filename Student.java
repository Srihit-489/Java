import java.lang.*;
import java.util.*;

class Student{
	  private String name;
	  private int roll;
	  private int height;

	  public Student(String name,int roll,int height){
			this.name = name;
			this.roll = roll;
			this.height = height;
	  }

	  public int getheight(){
			return this.height;
	  }

	  public String getname(){
			return this.name;
	  }
}
