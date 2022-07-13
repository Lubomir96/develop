package Homework3;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name :");
        String name = scan.nextLine();
        System.out.println("password");
        String mypassword = scan.nextLine();
        String password = "2005";


        int wrongPasswordCounter = 0 ;

        while(!password.equals(mypassword)){

            wrongPasswordCounter++;

            System.out.print("try again :");
            mypassword = scan.nextLine();
            if (wrongPasswordCounter > 5 ){
                System.out.println("no motr tries ");
                break;
            }
        }
        if (mypassword.equals(password)){
            System.out.println("Welcome"+ name);
        }

    }
}
