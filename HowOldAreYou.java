package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/5/15.
 *
 * 
 */

import java.util.Scanner;

public class HowOldAreYou

{
    public static void  main(String[] args) {

        int age;
        String name;

        Scanner input = new Scanner (System.in);
        System.out.println(" Hey, What's your name?");
        name = input.nextLine();

        System.out.println("Ok, " +name + " how old are you?");
        age= input.nextInt();

        if ( age < 16) {

            System.out.println(" You can't drive " +name);
        }

        if (age < 18) {
            System.out.println(" You can't vote, " +name);
        }

        if (age < 26) {
            System.out.println( " You can't rent a car, " + name);
        }

        if (age >= 25) {
            System.out.println( " You can do anything that's legal, " +name);
        }



    }

}
