/*
 * Name: [YOUR NAME HERE]
 * South Hills Username: [YOUR SOUTH HILLS USERNAME HERE]
 */
//Remember to put your name and SH username above

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What year is it? ");
        int year = input.nextInt();
        input.close();

        if((year%4) == 0)
        {
            System.out.println(year + " is a leap year!");
        }
        else
        {
            System.out.println(year + " is not a leap year :(");
        }
    }
}