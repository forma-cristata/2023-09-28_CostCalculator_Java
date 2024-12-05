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
        final double SALES_THRESH = 1399.99;
        Scanner input = new Scanner(System.in);

        double runningBrickTotal = 0;

        while(runningBrickTotal < SALES_THRESH)
        {
            System.out.print("What item did you sell? ");
            String isItABrick = input.next();
            System.out.print("How much did the item cost? $");
            double itemCost = input.nextDouble();
            System.out.println("You sold a(n) " + isItABrick + " and it cost $" + itemCost);

            if(isItABrick.equalsIgnoreCase("brick"))
            {
                runningBrickTotal += itemCost;
                System.out.println("You have sold $" + runningBrickTotal + " in bricks thus far.");
            }

        }
        input.close();
        System.out.println("You won a pack of gum!!");
    }
}