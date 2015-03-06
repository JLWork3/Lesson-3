package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/5/15.
 */
 import java.util.Scanner;

public class BMICalculator
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float height;
        int weight;
        float bmi;

        System.out.println(" What is your height in meters?");
        height = input.nextFloat();
        System.out.println("What is your weight in kilo grams?");
        weight = input.nextInt();
        bmi = (weight / (height *height));
        System.out.println(" Your BMI is " + bmi);







    }
}
