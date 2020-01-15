import Entities.RightTriangle;
import Services.TrigServices;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        // 3^2 and 4^2 for legs makes 5 as the hypotenuse
        Scanner input = new Scanner(System.in);
        RightTriangle test = new RightTriangle();
        System.out.println("input a double for one leg of the triangle");
        test.setLeg1(input.nextDouble());
        System.out.println("input a double for the second leg of the triangle");
        test.setLeg2(input.nextDouble());
        test = TrigServices.computeHypotenuse(test);
        System.out.println("The hypotenuse of the triangle is "+ test.getHypotenuse());
    }
}
