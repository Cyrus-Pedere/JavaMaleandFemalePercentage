/* Cyrus Jayson A. Pedere
   Bscpe 1-1 Programming Logic and Design
   FSw1 Module 2: Input, Processing, and Output

   **** 1. Male and Female Percentages *****
        JAVA LANGUAGE
 */

import java.util.Scanner ;

public class MaleandFemalePercentage
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int female, male, classTotal, percentage;
        double malePercentage, femalePercentage;

        System.out.println("How many males are in the class?");
        male = keyboard.nextInt();
        System.out.println("How many females are in the class?");
        female = keyboard.nextInt();

        classTotal = male + female;
        percentage = 100;
        femalePercentage = (female*percentage)/classTotal;
        malePercentage = (male*percentage)/classTotal;
    
        System.out.println("The total number of students registered in the class is: " + classTotal );
        System.out.println("The percentage of male students:" + " " + malePercentage + "%. ");
        System.out.println("The percentage of female students:" + " " + femalePercentage+ "%. ");

        

    }
}