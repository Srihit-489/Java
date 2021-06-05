public class Account {
    private int accountnumber;
    private int balance;
    private String name;
    private String phno;
    private String email;

    public void details(){
        System.out.println("account number is "+this.accountnumber+"The name is "+this.name+" with a balance of "+this.balance+".Contact him either through his email"+this.email+"or call him with phno"+this.phno);
    }
    public Account(int accountnumber, int balance, String name, String phno, String email) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.name = name;
        this.phno = phno;
        this.email = email;
    }

    public void setaccoutnumber(int number){
        this.accountnumber = number;
    }
    public void setphno(String phno){
        this.phno = phno;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setemail(String email){
        this.email = email;
    }
    public void setbalance(int balance){
        this.balance = balance;
    }
    public int getbalance(){
        return this.balance;
    }
    public int getaccountnumber(){
        return this.accountnumber;
    }
    public String getname(){
        return this.name;
    }
    public String getemail(){
        return this.email;
    }
    public String getphno(){
        return this.phno;
    }
    public void deposit(int data){
        this.balance = this.balance + data;
        System.out.println("current amount is"+this.balance);
    }
    public void withdraw(int data){
        if(data > this.balance){
            System.out.println("Insufficient funds!!!");
        }
        else{
            this.balance-=data;
            System.out.println("Current balance after withdraw is "+this.balance);
        }
    }
}
