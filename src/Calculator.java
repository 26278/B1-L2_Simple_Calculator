import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        int getal1 = 0;
        int getal2 = 0;
        String operarion;

        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Je eerste getal");
        getal1 = input.nextInt();

        System.out.println("Je tweede getal");
        getal2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Wil je deze getallen optellen, aftrekken, vermenigvuldigen, delen of de modulo berekenen?? (plus, min, :, x, %)");
        operation = op.next();



        if (operation.equals("plus"))
        {
            System.out.println("Je antwoord is " + (getal1 + getal2));
        }
        if  (operation.equals("min"))
        {
            System.out.println("Je antwoord is " + (getal1 - getal2));
        }

        if (operation.equals(":"))
        {
            System.out.println("Je antwoord is " + (getal1 / getal2));
        }
        if (operation.equals("x"))
        {
            System.out.println("Je antwoord is " + (getal1 * getal2));
        }
        if (operation.equals("%"))
        {
            System.out.println("Je antwoord is " + (getal1 % getal2));
        }
    }
}