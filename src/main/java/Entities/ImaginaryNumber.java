package Entities;

public class ImaginaryNumber {
    double realNumber;
    String variable;
    int exponent;

    public String getVariable() {
        return variable;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "ImaginaryNumber{" +
                "variable=" + variable +
                '}';
    }
}
