package Entities;

public class ImaginaryNumber {
    double realNumnber;
    char variable;
    int exponenet;

    public char getVariable() {
        return variable;
    }

    public double getRealNumnber() {
        return realNumnber;
    }

    public int getExponenet() {
        return exponenet;
    }

    public void setExponenet(int exponenet) {
        this.exponenet = exponenet;
    }

    public void setRealNumnber(double realNumnber) {
        this.realNumnber = realNumnber;
    }

    public void setVariable(char variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "ImaginaryNumber{" +
                "variable=" + variable +
                '}';
    }
}
