package Services;

import Entities.RightTriangle;

public class TrigServices {
    public static RightTriangle computeHypotenuse(@org.jetbrains.annotations.NotNull RightTriangle givenTri){
        double hypotenuse = Math.hypot(givenTri.getLeg1(),givenTri.getLeg2());
        givenTri.setHypotenuse(hypotenuse);
        return givenTri;
    }
    public static RightTriangle computeLeg2(@org.jetbrains.annotations.NotNull RightTriangle givenTri){
        double leg2 = givenTri.getHypotenuse()*(Math.sin(givenTri.getTheta()));
        givenTri.setLeg2(leg2);
        return givenTri;
    }
    public static RightTriangle computeLeg1(@org.jetbrains.annotations.NotNull RightTriangle givenTri){
        double leg1 = givenTri.getHypotenuse()*(Math.cos(givenTri.getTheta()));
        givenTri.setLeg1(leg1);
        return givenTri;
    }
    public static RightTriangle computeTheta(@org.jetbrains.annotations.NotNull RightTriangle givenTri){
        double theta = Math.asin(givenTri.getLeg1()/givenTri.getHypotenuse());
        givenTri.setTheta(theta);
        return givenTri;
    }
    public static RightTriangle computeArea(@org.jetbrains.annotations.NotNull RightTriangle givenTri){
        double area = ((1/2)*(givenTri.getLeg1()*givenTri.getLeg2()));
        givenTri.setArea(area);
        return givenTri;
    }

}
