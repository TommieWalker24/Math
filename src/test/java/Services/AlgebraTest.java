package Services;

import Entities.ImaginaryNumber;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlgebraTest extends Algebra {

    @org.junit.jupiter.api.Test
    void testAddition() {
        ImaginaryNumber imaginaryNumber1 = new ImaginaryNumber();
        imaginaryNumber1.setExponent(2);
        imaginaryNumber1.setVariable("x");
        imaginaryNumber1.setRealNumber(4);

        ImaginaryNumber imaginaryNumber2 = new ImaginaryNumber();
        imaginaryNumber2.setExponent(2);
        imaginaryNumber2.setVariable("x");
        imaginaryNumber2.setRealNumber(5);

        List<ImaginaryNumber> testingList  = new ArrayList<ImaginaryNumber>();
        testingList.add(imaginaryNumber1);
        testingList.add(imaginaryNumber2);
        List<ImaginaryNumber> results = Algebra.addition(testingList);

        assertEquals("x", results.get(0).getVariable());
        assertEquals(9, results.get(0).getRealNumber());
        assertEquals(2, results.get(0).getExponent());
    }

    @org.junit.jupiter.api.Test
    void testSubtraction() {
        ImaginaryNumber imaginaryNumber1 = new ImaginaryNumber();
        imaginaryNumber1.setExponent(2);
        imaginaryNumber1.setVariable("x");
        imaginaryNumber1.setRealNumber(10);

        ImaginaryNumber imaginaryNumber2 = new ImaginaryNumber();
        imaginaryNumber2.setExponent(2);
        imaginaryNumber2.setVariable("x");
        imaginaryNumber2.setRealNumber(5);

        List<ImaginaryNumber> testingList  = new ArrayList<ImaginaryNumber>();
        testingList.add(imaginaryNumber1);
        testingList.add(imaginaryNumber2);
        List<ImaginaryNumber> results = Algebra.subtraction(testingList);

        assertEquals("x", results.get(0).getVariable());
        assertEquals(5, results.get(0).getRealNumber());
        assertEquals(2, results.get(0).getExponent());
    }

    @org.junit.jupiter.api.Test
    void testMultiplication() {
        ImaginaryNumber imaginaryNumber1 = new ImaginaryNumber();
        imaginaryNumber1.setExponent(2);
        imaginaryNumber1.setVariable("x");
        imaginaryNumber1.setRealNumber(4);

        ImaginaryNumber imaginaryNumber2 = new ImaginaryNumber();
        imaginaryNumber2.setExponent(2);
        imaginaryNumber2.setVariable("x");
        imaginaryNumber2.setRealNumber(5);

        List<ImaginaryNumber> testingList  = new ArrayList<ImaginaryNumber>();
        testingList.add(imaginaryNumber1);
        testingList.add(imaginaryNumber2);
        List<ImaginaryNumber> results = Algebra.multiplication(testingList);

        assertEquals("x", results.get(0).getVariable());
        assertEquals(20, results.get(0).getRealNumber());
        assertEquals(4, results.get(0).getExponent());
    }

    @org.junit.jupiter.api.Test
    void testDivision() {
        ImaginaryNumber imaginaryNumber1 = new ImaginaryNumber();
        imaginaryNumber1.setExponent(3);
        imaginaryNumber1.setVariable("x");
        imaginaryNumber1.setRealNumber(18);

        ImaginaryNumber imaginaryNumber2 = new ImaginaryNumber();
        imaginaryNumber2.setExponent(2);
        imaginaryNumber2.setVariable("x");
        imaginaryNumber2.setRealNumber(9);

        List<ImaginaryNumber> testingList  = new ArrayList<ImaginaryNumber>();
        testingList.add(imaginaryNumber1);
        testingList.add(imaginaryNumber2);
        List<ImaginaryNumber> results = Algebra.division(testingList);

        assertEquals("x", results.get(0).getVariable());
        assertEquals(2, results.get(0).getRealNumber());
        assertEquals(1, results.get(0).getExponent());
    }
}