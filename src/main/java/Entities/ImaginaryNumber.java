package Entities;

public class ImaginaryNumber {
    double realNumnber;
    String variable;
    int exponenet;

    public String getVariable() {
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
