import java.util.Scanner;

public class Main {
    public static Scanner scanf = new Scanner(System.in);
    public static Bank mybank = new Bank();

    public static void main(String[] args) {
        System.out.println("-------------------Welcome to SBI-------------------");
        ShowInstructions();
        while(true){
            int choice;
            System.out.print("Enter your choice : ");
            choice = scanf.nextInt();
            scanf.nextLine();
            switch (choice){
                case 0:
                    ShowInstructions();
                    System.out.println();
                    break;
                case 1:
                    createNewBranch(mybank);
                    System.out.println();
                    break;
                case 2:
                    mybank.display();
                    System.out.println();
                    break;
                case 3:
                    removeBranch(mybank);
                    System.out.println();
                    break;
                case 4:
                    operateBranch(mybank);
                    System.out.println("Back to Bank");
                    System.out.println();
                    break;
                case 5:
                    System.exit(1);
            }
        }

    }

    public static void operateBranch(Bank mybank){
        System.out.print("Enter the branch name you wanted to look into : ");
        String mystring = scanf.nextLine();
        Branch mybranch = mybank.getBranches().get(mybank.search(mystring));
        System.out.println("Now you are in "+mystring+" Branch ");
        System.out.println();
        ShowInstructions2();
        while(true){
            System.out.print("Enter the choice you want : ");
            int choice = scanf.nextInt();
            scanf.nextLine();
            switch (choice){
                case 0:
                    ShowInstructions2();
                    System.out.println();
                    break;
                case 1:
                    System.out.print("Enter the name of the custmor : ");
                    String name = scanf.nextLine();
                    System.out.print("Enter the initial balance of the custmor : ");
                    int initial = scanf.nextInt();
                    scanf.nextLine();
                    mybranch.addCustmor(name,initial);
                    System.out.println();
                    break;
                case 2:
                    mybranch.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the name of the custmor : ");
                    String custname = scanf.nextLine();
                    mybranch.deleteCustmor(custname);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter the name of the Custmor : ");
                    String transectorname = scanf.nextLine();
                    System.out.print("Enter transection amount : ");
                    int transect = scanf.nextInt();
                    scanf.nextLine();
                    mybranch.CustmorTransection(transectorname,transect);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Enter the name of the Custmor : ");
                    String reqname = scanf.nextLine();
                    mybranch.custmorTransectionDetails(reqname);
                    System.out.println();
                    break;
                case 6:
                    return;
            }

        }

    }

    public static void ShowInstructions2(){
        System.out.println("0.Show the options available here ");
        System.out.println("1.Add a new custmor");
        System.out.println("2.Display all the custmors");
        System.out.println("3.Remove a custmor ");
        System.out.println("4.Do transections for a custmor");
        System.out.println("5.Show transection history of a Custmor ");
        System.out.println("6.Leave the Branch");
    }

    public static void removeBranch(Bank mybank){
        System.out.print("Enter the name the branch that you want to remove : ");
        String mystring = scanf.nextLine();
        mybank.closeBranch(mystring);
    }

    public static void createNewBranch(Bank mybank){
        System.out.print("Enter the name you want to assign to the bank : ");
        String name = scanf.nextLine();
        mybank.newBranch(name);
    }

    public static void ShowInstructions(){
        System.out.println("0.Show the options available");
        System.out.println("1.Set a new branch");
        System.out.println("2.Display all branches available");
        System.out.println("3.Remove Branch");
        System.out.println("4.Enter a Branch ");
    }
}
