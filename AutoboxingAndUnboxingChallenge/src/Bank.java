import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void newBranch(String Name){
        Branch newBranch = new Branch(Name);
        branches.add(newBranch);
        System.out.println("New branch launched with name "+Name);
    }

    public int search(String name){
        for(int i=0;i<branches.size();i++){
            if(branches.get(i).getBranchname().equals(name)){
                return i;
            }
        }
        System.out.println("No such branch exist !!!");
        return -1;
    }



    public void closeBranch(String name){
        for(int i=0;i<branches.size();i++){
            if(branches.get(i).getBranchname().equals(name)){
                branches.remove(i);
                System.out.println(name+" Branch closed succesfully ");
            }
        }
        System.out.println("No such branch exists !!! ");
    }

    public void display(){
        for(int i=0;i<branches.size();i++){
            System.out.println((i+1)+"."+branches.get(i).getBranchname());
        }
    }

}
