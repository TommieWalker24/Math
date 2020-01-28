package Services;

import Entities.Fraction;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionMathTest extends TrigServices {
    private FractionMath services;
    @Before
    public void init(){
        services = new FractionMath();
    }

    @Test
    void normalize() {
        Fraction twoSixth = new Fraction(2,6);
        Fraction threeTwelves = new Fraction(3,12);
        Fraction oneEighth = new Fraction(1,8);
        Fraction oneFifth = new Fraction(1,5);

        List<Fraction> fractions  = new ArrayList<Fraction>();
        fractions.add(twoSixth);
        fractions.add(threeTwelves);
        fractions.add(oneEighth);
      //  fractions.add(oneFifth);
        List<Fraction> result = services.normalize(fractions);

        assertEquals(8,result.get(0).getNumerator());
        assertEquals(24,result.get(0).getDenominator());
        assertEquals(6,result.get(1).getNumerator());
        assertEquals(24,result.get(1).getDenominator());
        assertEquals(3,result.get(2).getNumerator());
        assertEquals(24,result.get(2).getDenominator());
    }

    @Test
    void leastCommonDenominator() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(4);
        list.add(3);

       HashMap<Integer, Integer> result = services.leastCommonDenominator(list);
        assertEquals(6, result.get(4));
        assertEquals(8, result.get(3));
        assertEquals(3, result.get(8));
        }

    @Test
    void simplify() {
       Fraction test = new Fraction(9,15);
       Fraction result = services.simplify(test);
        assertEquals(3, result.getNumerator());
        assertEquals(5, result.getDenominator());
    }

    @Test
    void addition() {
        Fraction oneSixth = new Fraction(1,6);
        Fraction sixSixths = new Fraction(6,6);
        List<Fraction> fracList = new ArrayList<Fraction>();
        fracList.add(oneSixth);
        fracList.add(sixSixths);
        Fraction result = services.addition(fracList);
        assertEquals(6,result.getDenominator());
        assertEquals(6,result.getNumerator());
    }

    @Test
    void subtraction() {
        Fraction sevenSixths = new Fraction(7,6);
        Fraction fiveSixths = new Fraction(5,6);
        List<Fraction> fracList = new ArrayList<Fraction>();
        fracList.add(sevenSixths);
        fracList.add(fiveSixths);
        Fraction result = services.subtraction(fracList);
        assertEquals(6,result.getDenominator());
        assertEquals(2,result.getNumerator());
    }
}