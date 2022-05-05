package tampa;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;

        System.out.println("Enter a number, i'll square it for you");
        i = scan.nextInt();


        System.out.println(meth1(i));

        System.out.println("would you like me to save this?");

        scan.nextLine();
        String answer = scan.nextLine();

        if (answer.equals("yes")) {
            System.out.println("SAVED");
        } else if (answer.equals("no")) {
            System.out.println("NOT SAVED");
        } else {
                System.out.println("please answer yes or no");
            }

meth2();


    }

    public static int meth1(int i) {

        return i * i;


    }

    public static void meth2 ()   {
        try {
            File myObj = new File("C:\\Users\\after\\Downloads\\thefile.txt");

            if (myObj.createNewFile()) {
                System.out.println("filecreated: " + myObj.getName());
            }
        else{
                    System.out.println("file already exists.");
                }

        }
        catch (IOException e){
            System.out.println("an error occured.");
            e.printStackTrace();
        }

    }

}
