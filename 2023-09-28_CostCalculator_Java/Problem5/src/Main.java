/*
 * Name: [YOUR NAME HERE]
 * South Hills Username: [YOUR SOUTH HILLS USERNAME HERE]
 */
//Remember to put your name and SH username above

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final int LABOR_RATE = 30;
        final double NO_WHOLESALE_RATE_FOR_U = 1.2;
        Scanner input = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("#0.00");

        System.out.print("How many hours do you estimate this job will take? If you are done calculating, type '0' please: ");
        double hours = input.nextDouble();
        double jobTotal;

        while (hours != 0)
        {
            System.out.print("How much do the materials this job requires cost from a wholesaler? $");
            double wholeCost = input.nextDouble();

            System.out.println("This job requires materials costing $" + moneyFormat.format(wholeCost) + " wholesale, and labor totalling " + hours + " in hours.");
            jobTotal = ((LABOR_RATE*hours) + (NO_WHOLESALE_RATE_FOR_U*wholeCost));
            System.out.println("This job will cost $" + moneyFormat.format(jobTotal) + " including labor and materials.");
        }
        input.close();
        System.out.println("Thanks for calculating with me!!");

    }
}