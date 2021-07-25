import java.util.*;


class Comp implements Comparator<Student>{
	 public int compare(Student o1,Student o2){
		  if(o1.getname().equals(o2.getname())){
				return o2.getmarks()-o1.getmarks();
		  }
		  return o1.getname().compareTo(o2.getname());
	 }
}
