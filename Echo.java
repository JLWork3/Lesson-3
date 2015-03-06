package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/5/15.
 * This class prompts the user for some personal data and then repeats it back to them.
 */


import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner( System.in);
        System.out.println("Please say something.");
        /* String

        String something  = keyboard.next();
         */

        String something  = keyboard.nextLine();


        System.out.println(something);


    }

}
