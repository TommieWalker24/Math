package Entities;

public class RightTriangle {
    double leg1, leg2, hypotenuse, theta, area;
     final double right_angle = 90;

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getLeg1() {
        return leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public void setLeg1(double leg1) {
        this.leg1 = leg1;
    }

    public void setLeg2(double leg2) {
        this.leg2 = leg2;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
