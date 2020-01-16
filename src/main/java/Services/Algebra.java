package Services;

import Entities.ImaginaryNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Algebra {
    //returns a list of the individual imaginary numbers
    public static List<ImaginaryNumber> addition(List<ImaginaryNumber> imaginaryNumList){
        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();
        double realNum;
        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();

        String var;

        ImaginaryNumber next;
        ImaginaryNumber imaginaryNumber;
        Integer exponent;
        while (imaginaryNumList.isEmpty() != true){
            imaginaryNumber = imaginaryNumList.get(0);
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumber();
            exponent = imaginaryNumber.getExponenet();

            imaginaryNumList.remove(imaginaryNumber);

            for(int i = 0; i < imaginaryNumList.size(); i++){
                next = imaginaryNumList.get(i);
                if(var.equals(next.getVariable())&& exponent.equals(next.getExponenet())){
                    realNum += next.getRealNumber();
                    imaginaryNumList.remove(next);
                }

            }
            ImaginaryNumber result = new ImaginaryNumber();
            result.setRealNumber(realNum);
            result.setVariable(var);
            result.setExponenet(exponent);
            totalResult.add(result);
            if(imaginaryNumList.isEmpty()){
                break;
            }
        }
        return totalResult;
    }
    public static List<ImaginaryNumber> subtraction(List<ImaginaryNumber> imaginaryNumList){
        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();
        double realNum;
        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();

        String var;

        ImaginaryNumber next;
        ImaginaryNumber imaginaryNumber;
        Integer exponent;
        while (imaginaryNumList.isEmpty() != true){
            imaginaryNumber = imaginaryNumList.get(0);
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumber();
            exponent = imaginaryNumber.getExponenet();

            imaginaryNumList.remove(imaginaryNumber);

            for(int i = 0; i < imaginaryNumList.size(); i++){
                next = imaginaryNumList.get(i);
                if(var.equals(next.getVariable())&& exponent.equals(next.getExponenet())){
                    realNum -= next.getRealNumber();
                    imaginaryNumList.remove(next);
                }

            }
            ImaginaryNumber result = new ImaginaryNumber();
            result.setRealNumber(realNum);
            result.setVariable(var);
            result.setExponenet(exponent);
            totalResult.add(result);
            if(imaginaryNumList.isEmpty()){
                break;
            }
        }
        return totalResult;
    }

    public static List<ImaginaryNumber> multiplication(List<ImaginaryNumber> imaginaryNumList){
        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();
        double realNum;

        ImaginaryNumber result = new ImaginaryNumber();
    List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();
        String var;
        ImaginaryNumber next;
        ImaginaryNumber imaginaryNumber;
        Integer exponent;
        while (imaginaryNumList.isEmpty() != true){
            imaginaryNumber = imaginaryNumList.get(0);
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumber();
            exponent = imaginaryNumber.getExponenet();

            imaginaryNumList.remove(imaginaryNumber);

            for(int i = 0; i < imaginaryNumList.size(); i++){
                next = imaginaryNumList.get(i);
                if(var.equals(next.getVariable())){
                    realNum *= next.getRealNumber();
                    exponent += next.getExponenet();

                    imaginaryNumList.remove(next);

                }

            }

            result.setRealNumber(realNum);

            result.setVariable(var);

            result.setExponenet(exponent);

            totalResult.add(result);
            if(imaginaryNumList.isEmpty()){
                break;
            }
        }
        return totalResult;
    }

    public static List<ImaginaryNumber> division(List<ImaginaryNumber> imaginaryNumList){
        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();
        double realNum;
        ImaginaryNumber result = new ImaginaryNumber();
        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();
        String var;
        ImaginaryNumber next;

        ImaginaryNumber imaginaryNumber;
        Integer exponent;
        while (imaginaryNumList.isEmpty() != true){
            imaginaryNumber = imaginaryNumList.get(0);
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumber();
            exponent = imaginaryNumber.getExponenet();
            imaginaryNumList.remove(imaginaryNumber);
            // for(ImaginaryNumber numInLoop : imaginaryNumList){
            for(int i = 0; i < imaginaryNumList.size(); i++){
                next = imaginaryNumList.get(i);
                if(var.equals(next.getVariable())){
                    realNum /= next.getRealNumber();
                    exponent -= next.getExponenet();
                    imaginaryNumList.remove(next);
                }
            }

            result.setRealNumber(realNum);

            result.setVariable(var);

            result.setExponenet(exponent);

            totalResult.add(result);
            if(imaginaryNumList.isEmpty()){
                break;
            }
        }
        return totalResult;
    }
}
