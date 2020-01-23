package Services;

import Entities.ImaginaryNumber;

public class CalculusServices {
    public static ImaginaryNumber derivative(ImaginaryNumber num){
        ImaginaryNumber newNum = new ImaginaryNumber();
        newNum.setRealNumber((num.getRealNumber()* num.getExponenet()));
        newNum.setExponenet((num.getExponenet() -1));
        int exponentCheck = newNum.getExponenet();
        if(exponentCheck == 0){
            newNum.setVariable("no variable");
        }else{
            newNum.setVariable(num.getVariable());
        }


        return newNum;
    }
}
