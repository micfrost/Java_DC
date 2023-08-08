package D20.D20_T3_AreaOfRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the length of the rectangle: ");
        double givenLength = Double.valueOf(scanner.nextLine());
        System.out.println("Type the width of the rectangle: ");
        double givenWidth = Double.valueOf(scanner.nextLine());

        System.out.println("Provided length: " + givenLength);
        System.out.println("Provided width: " + givenWidth);

        RectangleCalculator RectCalc = new RectangleCalculator();
        double area = RectCalc.areaOfRectangle(givenLength, givenWidth);
        System.out.println(area);

        double perimeter = RectCalc.perimeterOfRectangle(givenLength, givenWidth);
        System.out.println(perimeter);


    }
}
