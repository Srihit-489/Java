import java.util.ArrayList;

public class Branch {
    private ArrayList<Custmor> custmorList = new ArrayList<Custmor>();
    private String Branchname;

    public Branch(String name){
        this.Branchname = name;
    }

    public ArrayList<Custmor> getCustmorList() {
        return custmorList;
    }

    public void display(){
        for(int i=0;i<custmorList.size();i++){
            System.out.println("name : "+custmorList.get(i).getName()+" Balance : "+custmorList.get(i).getbalance());
        }
    }

    public String getBranchname() {
        return Branchname;
    }

    public void addCustmor(String name, int initial){
        System.out.println("Account is creating ...");
        if(initial < 0){
            System.out.println("Account creation failed due to invalid initial balance ...");
            return;
        }
        Custmor newcustmor = new Custmor(name,initial);
        custmorList.add(newcustmor);
        System.out.println("The new Custmor is succesfully added...");
    }

    public void CustmorTransection(String name,int amount){
        for(int i=0;i<custmorList.size();i++){
            if(custmorList.get(i).getName().equals(name)){
                custmorList.get(i).transection(amount);
                System.out.println("Transection succesful for "+name);
                return;
            }
        }
        System.out.println("Custmor doesnt exit in record.Please recheck spelling or add a new account !!!");
    }

    public void custmorTransectionDetails(String name){
        for(int i=0;i<custmorList.size();i++){
            if(custmorList.get(i).getName().equals(name)){
                System.out.println("The transections of "+name+" are :");
                System.out.println(custmorList.get(i).getTransections());
            }
        }
    }

    public void deleteCustmor(String name){
        for(int i=0;i<custmorList.size();i++){
            if(custmorList.get(i).getName().equals(name)){
                custmorList.remove(i);
                System.out.println("Custmor"+name+" Removed succesfully ...");
                return;
            }
        }
        System.out.println("No such Custmor !!! ");
    }
}
