package Services;

import Entities.ImaginaryNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculusServicesTest extends TrigServices {

    @Test
    void testDerivative() {
        ImaginaryNumber imaginaryNumber = new ImaginaryNumber();
        imaginaryNumber.setRealNumber(5);
        imaginaryNumber.setVariable("x");
        imaginaryNumber.setExponent(3);

        ImaginaryNumber result = CalculusServices.derivative(imaginaryNumber);

        assertEquals(15, result.getRealNumber());
        assertEquals("x", result.getVariable());
        assertEquals(2, result.getExponent());

        ImaginaryNumber imaginaryNumber2 = new ImaginaryNumber();
        imaginaryNumber.setRealNumber(3);
        imaginaryNumber.setVariable("x");
        imaginaryNumber.setExponent(1);

        ImaginaryNumber result2 = CalculusServices.derivative(imaginaryNumber);
        assertEquals(3, result2.getRealNumber());
        assertEquals("no variable", result2.getVariable());
        assertEquals(0, result2.getExponent());
    }
}