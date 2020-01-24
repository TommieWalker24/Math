package Services;

import Entities.ImaginaryNumber;

public class CalculusServices {
    public static ImaginaryNumber derivative(ImaginaryNumber num){
        ImaginaryNumber newNum = new ImaginaryNumber();
        newNum.setRealNumber((num.getRealNumber()* num.getExponent()));
        newNum.setExponent((num.getExponent() -1));
        if(newNum.getExponent() == 0){
            newNum.setVariable("no variable");
        }else{
            newNum.setVariable(num.getVariable());
        }
        return newNum;
    }
}
