package Services;

import Entities.ImaginaryNumber;

import java.util.Iterator;
import java.util.List;

public class Algebra {
    //returns a list of the individual imaginary numbers
    public List<ImaginaryNumber> addition(List<ImaginaryNumber> imaginaryNumList){
        Iterator itr = null;
        double realNum;
        ImaginaryNumber result = new ImaginaryNumber();
        List<ImaginaryNumber> totalResult = null;
        String var;
        ImaginaryNumber next;
        Integer exponent;
        for (ImaginaryNumber imaginaryNumber: imaginaryNumList){
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumnber();
            exponent = imaginaryNumber.getExponenet();
            imaginaryNumList.remove(imaginaryNumber);

            for(ImaginaryNumber numInLoop : imaginaryNumList){
                next = (ImaginaryNumber) itr.next();
                if(var.equals(next.getVariable())&& exponent.equals(next.getExponenet())){
                    realNum += next.getRealNumnber();
                    imaginaryNumList.remove(next);
                }
            }
            result.setRealNumnber(realNum);
            result.setVariable(var);
            totalResult.add(result);
        }
        return totalResult;
    }
    public List<ImaginaryNumber> subtraction(List<ImaginaryNumber> imaginaryNumList){
        Iterator itr = null;
        double realNum;
        ImaginaryNumber result = new ImaginaryNumber();
        List<ImaginaryNumber> totalResult = null;
        String var;
        ImaginaryNumber next;
        Integer exponent;
        for (ImaginaryNumber imaginaryNumber: imaginaryNumList){
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumnber();
            exponent = imaginaryNumber.getExponenet();
            imaginaryNumList.remove(imaginaryNumber);

            for(ImaginaryNumber numInLoop : imaginaryNumList){
                next = (ImaginaryNumber) itr.next();
                if(var.equals(next.getVariable())&& exponent.equals(next.getExponenet())){
                    realNum -= next.getRealNumnber();
                    imaginaryNumList.remove(next);
                }
            }
            result.setRealNumnber(realNum);
            result.setVariable(var);
            result.setExponenet(exponent);
            totalResult.add(result);
        }
        return totalResult;
    }
    public List<ImaginaryNumber> multiplication(List<ImaginaryNumber> imaginaryNumList){
        Iterator itr = null;
        double realNum;
        ImaginaryNumber result = new ImaginaryNumber();
        List<ImaginaryNumber> totalResult = null;
        String var;
        ImaginaryNumber next;
        Integer exponent;
        for (ImaginaryNumber imaginaryNumber: imaginaryNumList){
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumnber();
            exponent = imaginaryNumber.getExponenet();
            imaginaryNumList.remove(imaginaryNumber);

            for(ImaginaryNumber numInLoop : imaginaryNumList){
                next = (ImaginaryNumber) itr.next();
                if(var.equals(next.getVariable())){
                    realNum *= next.getRealNumnber();
                    exponent += next.getExponenet();
                    imaginaryNumList.remove(next);
                }
            }
            result.setRealNumnber(realNum);
            result.setVariable(var);
            result.setExponenet(exponent);
            totalResult.add(result);

        }
        return totalResult;
    }

    public List<ImaginaryNumber> division(List<ImaginaryNumber> imaginaryNumList){
        Iterator itr = null;
        double realNum;
        ImaginaryNumber result = new ImaginaryNumber();
        List<ImaginaryNumber> totalResult = null;
        String var;
        ImaginaryNumber next;
        Integer exponent;
        for (ImaginaryNumber imaginaryNumber: imaginaryNumList){
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumnber();
            exponent = imaginaryNumber.getExponenet();
            imaginaryNumList.remove(imaginaryNumber);

            for(ImaginaryNumber numInLoop : imaginaryNumList){
                next = (ImaginaryNumber) itr.next();
                if(var.equals(next.getVariable())){
                    realNum /= next.getRealNumnber();
                    exponent -= next.getExponenet();
                    imaginaryNumList.remove(next);
                }
            }
            result.setRealNumnber(realNum);
            result.setVariable(var);
            result.setExponenet(exponent);
            totalResult.add(result);

        }
        return totalResult;
    }
}
