package Services;

import Entities.RightTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrigServicesTest extends TrigServices {

    @Test
    void testComputeHypotenuse() {
        RightTriangle triangle = new RightTriangle();
        triangle.setLeg1(3);
        triangle.setLeg2(4);
        triangle = TrigServices.computeHypotenuse(triangle);
        assertEquals(5, triangle.getHypotenuse());
        assertEquals(3, triangle.getLeg1());
        assertEquals(4,triangle.getLeg2());
       // todo: make triangle autocomplete area
        // todo: make triangle auto complete theta and remaining angle
    }

    @Test
    void testComputeLeg2() {
    }

    @Test
    void testComputeLeg1() {
    }

    @Test
    void testComputeTheta() {
    }

    @Test
    void testComputeArea() {
        RightTriangle triangle = new RightTriangle();
        triangle.setLeg1(3);
        triangle.setLeg2(4);
        triangle = TrigServices.computeArea(triangle);
        //todo: make triangle auto complete hypotenuse
        //todo: make triangle auto complete theta and remaining angle
        assertEquals(3, triangle.getLeg1());
        assertEquals(4,triangle.getLeg2());
        assertEquals(6, triangle.getArea());
    }
}