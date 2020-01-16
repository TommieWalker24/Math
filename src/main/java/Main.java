<<<<<<< HEAD

public class Main {
    public static void main (String args[]){

=======
import Entities.ImaginaryNumber;
import Entities.RightTriangle;
import Services.Algebra;
import Services.TrigServices;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 3^2 and 4^2 for legs makes 5 as the hypotenuse
        Scanner input = new Scanner(System.in);
        RightTriangle test = new RightTriangle();
        System.out.println("input a double for one leg of the triangle");
        test.setLeg1(input.nextDouble());
        System.out.println("input a double for the second leg of the triangle");
        test.setLeg2(input.nextDouble());
        test = TrigServices.computeHypotenuse(test);
        System.out.println("The hypotenuse of the triangle is " + test.getHypotenuse());
        List<ImaginaryNumber> list = new ArrayList<ImaginaryNumber>();


        ImaginaryNumber testing = new ImaginaryNumber();
        System.out.println("Enter an imaginary number base");
        testing.setRealNumnber(input.nextDouble());
        System.out.println("Enter an imaginary number variable");
        testing.setVariable(input.next());
        System.out.println("Enter an imaginary number exponenet");
        testing.setExponenet(input.nextInt());
        list.add(testing);

        ImaginaryNumber testing2 = new ImaginaryNumber();
        System.out.println("Enter an imaginary number base");
        testing2.setRealNumnber(input.nextDouble());
        System.out.println("Enter an imaginary number variable");
        testing2.setVariable(input.next());
        System.out.println("Enter an imaginary number exponenet");
        testing2.setExponenet(input.nextInt());
        list.add(testing2);
        List<ImaginaryNumber> result = Algebra.addition(list);
        print(result);

    }

    private static void print(List<ImaginaryNumber> list) {
        ListIterator<ImaginaryNumber>itr = list.listIterator();
        System.out.print(" the result of this addition operation is: ");
        for (int i = 0; i < list.size();) {
            ImaginaryNumber imaginaryNumber = list.get(i);
            System.out.print(imaginaryNumber.getRealNumber() + imaginaryNumber.getVariable() + " to the "+ imaginaryNumber.getExponenet());
            list.remove(imaginaryNumber);
            if (list.isEmpty() == false) {
                System.out.print(" + ");
            }
            else
                break;
        }
>>>>>>> master
    }
}
