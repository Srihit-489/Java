import java.util.ArrayList;

public class Custmor {
    private String name;
    private ArrayList<Integer> transections = new ArrayList<Integer>();
    private int currentBalance;

    public Custmor(String name, int initial) {
        this.name = name;
        this.transections.add(initial);
        currentBalance = initial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public int getbalance(){
        return this.currentBalance;
   }

    public ArrayList<Integer> getTransections() {
        return transections;
    }

    public void transection(int data){
        if(data > 0){
            deposit(data);
        }
        else{
            withdraw(data);
        }
    }

    public void deposit(int amount){
        if(amount > 0){
            System.out.println(amount + ".Rs is added to "+this.name+"'s account");
            transections.add(amount);
            currentBalance+=amount;
            return;
        }
        System.out.println("Negitive balance cannot be deposited !!!");
    }

    public void withdraw(int amount){
        if(this.currentBalance < amount){
            System.out.println("Insufficient Funds, Withdraw failed !!!");
            return;
        }
        else{
            this.currentBalance+=amount;
            transections.add(amount);

        }
    }
}
