package Entities;

public class ImaginaryNumber {
    double realNumber;
    String variable;
    int exponenet;

    public String getVariable() {
        return variable;
    }

    public double getRealNumber() {
        return realNumber;

    }

    public int getExponenet() {
        return exponenet;
    }

    public void setExponenet(int exponenet) {
        this.exponenet = exponenet;
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
