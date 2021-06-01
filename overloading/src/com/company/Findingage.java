package com.company;

//import javax.swing.text.html.StyleSheet;

import java.util.Scanner;

public class Findingage {

    public static void main(String[] args) {
        System.out.println("The scanner is very complex bro but lets try");
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter your birth year bro");
        boolean checkvalidity;
        checkvalidity = scanf.hasNextInt();
        if(checkvalidity){
            int birthyear = scanf.nextInt();
            scanf.nextLine();
            System.out.println("Enter you name bro");
            String myname = scanf.nextLine();
            int age = 2021 - birthyear;
            if(0 < age && age < 100){
                System.out.println("Your name is "+myname+" and your age is "+ (2021-birthyear));
            }else{
                System.out.println("Invalid year of birth");
            }
            //System.out.println("Your name is "+myname+" and your age is "+ (2021-birthyear));

        }else{
            System.out.println("Give correct year bro");
        }

    }

}
