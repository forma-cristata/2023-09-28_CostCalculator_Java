//Kaci Craycraft
//kcraycraft45//




import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final int CUBE_SIDES = 6;

        System.out.print("What is the length of the edge of your cube? ");
        double sideLength = input.nextDouble();
        input.close();
        System.out.println("Your cube has a side of length "+sideLength+".");
        System.out.println("Your cube has a face area of "+(sideLength*sideLength));
        System.out.println("Your cube has a total area of "+(sideLength*sideLength*6));
        System.out.println("Your cube has a volume of "+(sideLength*sideLength*sideLength));

    }
}
