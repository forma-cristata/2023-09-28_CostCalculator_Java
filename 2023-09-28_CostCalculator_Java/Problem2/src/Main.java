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

        final int GRADE_A_THRESH = 90;
        final int GRADE_B_THRESH = 80;
        final int GRADE_C_THRESH = 70;
        final int GRADE_D_THRESH = 60;

        System.out.print("What was the student's score? (out of 100): ");
        double score = input.nextDouble();
        input.close();


        if (score >= GRADE_A_THRESH)
        {
            System.out.println("For a score of "+score+" the student earned an A.");
        }
        else if (score >= GRADE_B_THRESH)
        {
            System.out.println("For a score of "+score+" the student earned a B.");
        }
        else if (score >= GRADE_C_THRESH)
        {
            System.out.println("For a score of "+score+" the student earned a C.");
        }
        else if (score >= GRADE_D_THRESH)
        {
            System.out.println("For a score of "+score+" the student earned a D.");
        }
        else
        {
            System.out.println("For a score of "+score+" the student Failed.");
        }
    }
}