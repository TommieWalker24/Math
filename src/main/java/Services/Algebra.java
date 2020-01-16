package Services;

import Entities.ImaginaryNumber;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Iterator;
>>>>>>> master
import java.util.List;
import java.util.ListIterator;

public class Algebra {


<<<<<<< HEAD


    //returns a list of the individual imaginary numbers

    public static List<ImaginaryNumber> addition(List<ImaginaryNumber> imaginaryNumList){

        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();

        double realNum;

        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();

=======
    //returns a list of the individual imaginary numbers
    public static List<ImaginaryNumber> addition(List<ImaginaryNumber> imaginaryNumList){
        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();
        double realNum;
        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();
>>>>>>> master
        String var;

        ImaginaryNumber next;
<<<<<<< HEAD

        ImaginaryNumber imaginaryNumber;

        Integer exponent;

        while (imaginaryNumList.isEmpty() != true){

            imaginaryNumber = imaginaryNumList.get(0);

            var = imaginaryNumber.getVariable();

            realNum = imaginaryNumber.getRealNumber();

=======
        ImaginaryNumber imaginaryNumber;
        Integer exponent;
        while (imaginaryNumList.isEmpty() != true){
            imaginaryNumber = imaginaryNumList.get(0);
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumber();
>>>>>>> master
            exponent = imaginaryNumber.getExponenet();

            imaginaryNumList.remove(imaginaryNumber);
<<<<<<< HEAD

            for(int i = 0; i < imaginaryNumList.size(); i++){

                next = imaginaryNumList.get(i);

                if(var.equals(next.getVariable())&& exponent.equals(next.getExponenet())){

                    realNum += next.getRealNumber();

=======
            for(int i = 0; i < imaginaryNumList.size(); i++){
                next = imaginaryNumList.get(i);
                if(var.equals(next.getVariable())&& exponent.equals(next.getExponenet())){
                    realNum += next.getRealNumber();
>>>>>>> master
                    imaginaryNumList.remove(next);

                }

            }
<<<<<<< HEAD

            ImaginaryNumber result = new ImaginaryNumber();

            result.setRealNumber(realNum);

            result.setVariable(var);

            result.setExponenet(exponent);

            totalResult.add(result);

            if(imaginaryNumList.isEmpty()){

                break;

            }

=======
            ImaginaryNumber result = new ImaginaryNumber();
            result.setRealNumnber(realNum);
            result.setVariable(var);
            result.setExponenet(exponent);
            totalResult.add(result);
            if(imaginaryNumList.isEmpty()){
                break;
            }
>>>>>>> master
        }

        return totalResult;

    }
<<<<<<< HEAD

    public static List<ImaginaryNumber> subtraction(List<ImaginaryNumber> imaginaryNumList){

        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();

=======
    public static List<ImaginaryNumber> subtraction(List<ImaginaryNumber> imaginaryNumList){
        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();
>>>>>>> master
        double realNum;

        ImaginaryNumber result = new ImaginaryNumber();
<<<<<<< HEAD

        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();

=======
        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();
>>>>>>> master
        String var;

        ImaginaryNumber next;
<<<<<<< HEAD

        ImaginaryNumber imaginaryNumber;

        Integer exponent;

        while (imaginaryNumList.isEmpty() != true){

            imaginaryNumber = imaginaryNumList.get(0);

            var = imaginaryNumber.getVariable();

            realNum = imaginaryNumber.getRealNumber();

=======
        ImaginaryNumber imaginaryNumber;
        Integer exponent;
        while (imaginaryNumList.isEmpty() != true){
            imaginaryNumber = imaginaryNumList.get(0);
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumber();
>>>>>>> master
            exponent = imaginaryNumber.getExponenet();

            imaginaryNumList.remove(imaginaryNumber);

<<<<<<< HEAD


            // for(ImaginaryNumber numInLoop : imaginaryNumList){

            for(int i = 0; i < imaginaryNumList.size(); i++){

                next = imaginaryNumList.get(i);

                if(var.equals(next.getVariable())&& exponent.equals(next.getExponenet())){

                    realNum -= next.getRealNumber();

=======
            // for(ImaginaryNumber numInLoop : imaginaryNumList){
            for(int i = 0; i < imaginaryNumList.size(); i++){
                next = imaginaryNumList.get(i);
                if(var.equals(next.getVariable())&& exponent.equals(next.getExponenet())){
                    realNum -= next.getRealNumber();
>>>>>>> master
                    imaginaryNumList.remove(next);

                }

            }

            result.setRealNumber(realNum);

            result.setVariable(var);

            result.setExponenet(exponent);

            totalResult.add(result);
<<<<<<< HEAD

            if(imaginaryNumList.isEmpty()){

                break;

            }

=======
            if(imaginaryNumList.isEmpty()){
                break;
            }
>>>>>>> master
        }

        return totalResult;

    }
<<<<<<< HEAD

    public static List<ImaginaryNumber> multiplication(List<ImaginaryNumber> imaginaryNumList){

        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();

=======
    public static List<ImaginaryNumber> multiplication(List<ImaginaryNumber> imaginaryNumList){
        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();
>>>>>>> master
        double realNum;

        ImaginaryNumber result = new ImaginaryNumber();
<<<<<<< HEAD

        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();

=======
        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();
>>>>>>> master
        String var;

        ImaginaryNumber next;
<<<<<<< HEAD

        ImaginaryNumber imaginaryNumber;

        Integer exponent;

        while (imaginaryNumList.isEmpty() != true){

            imaginaryNumber = imaginaryNumList.get(0);

            var = imaginaryNumber.getVariable();

            realNum = imaginaryNumber.getRealNumber();

=======
        ImaginaryNumber imaginaryNumber;
        Integer exponent;
        while (imaginaryNumList.isEmpty() != true){
            imaginaryNumber = imaginaryNumList.get(0);
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumber();
>>>>>>> master
            exponent = imaginaryNumber.getExponenet();

            imaginaryNumList.remove(imaginaryNumber);

<<<<<<< HEAD


            // for(ImaginaryNumber numInLoop : imaginaryNumList){

            for(int i = 0; i < imaginaryNumList.size(); i++){

                next = imaginaryNumList.get(i);

                if(var.equals(next.getVariable())){

                    realNum *= next.getRealNumber();

=======
            // for(ImaginaryNumber numInLoop : imaginaryNumList){
            for(int i = 0; i < imaginaryNumList.size(); i++){
                next = imaginaryNumList.get(i);
                if(var.equals(next.getVariable())){
                    realNum *= next.getRealNumber();
>>>>>>> master
                    exponent += next.getExponenet();

                    imaginaryNumList.remove(next);

                }

            }

            result.setRealNumber(realNum);

            result.setVariable(var);

            result.setExponenet(exponent);

            totalResult.add(result);
<<<<<<< HEAD

            if(imaginaryNumList.isEmpty()){

                break;

            }

=======
            if(imaginaryNumList.isEmpty()){
                break;
            }
>>>>>>> master
        }

        return totalResult;

    }

<<<<<<< HEAD


    public static List<ImaginaryNumber> division(List<ImaginaryNumber> imaginaryNumList){

        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();

=======
    public static List<ImaginaryNumber> division(List<ImaginaryNumber> imaginaryNumList){
        ListIterator<ImaginaryNumber> itr = imaginaryNumList.listIterator();
>>>>>>> master
        double realNum;

        ImaginaryNumber result = new ImaginaryNumber();
<<<<<<< HEAD

        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();

=======
        List<ImaginaryNumber> totalResult = new ArrayList<ImaginaryNumber>();
>>>>>>> master
        String var;

        ImaginaryNumber next;
<<<<<<< HEAD

        ImaginaryNumber imaginaryNumber;

        Integer exponent;

        while (imaginaryNumList.isEmpty() != true){

            imaginaryNumber = imaginaryNumList.get(0);

            var = imaginaryNumber.getVariable();

            realNum = imaginaryNumber.getRealNumber();

=======
        ImaginaryNumber imaginaryNumber;
        Integer exponent;
        while (imaginaryNumList.isEmpty() != true){
            imaginaryNumber = imaginaryNumList.get(0);
            var = imaginaryNumber.getVariable();
            realNum = imaginaryNumber.getRealNumber();
>>>>>>> master
            exponent = imaginaryNumber.getExponenet();

            imaginaryNumList.remove(imaginaryNumber);

<<<<<<< HEAD


            // for(ImaginaryNumber numInLoop : imaginaryNumList){

            for(int i = 0; i < imaginaryNumList.size(); i++){

                next = imaginaryNumList.get(i);

                if(var.equals(next.getVariable())){

                    realNum /= next.getRealNumber();

=======
            // for(ImaginaryNumber numInLoop : imaginaryNumList){
            for(int i = 0; i < imaginaryNumList.size(); i++){
                next = imaginaryNumList.get(i);
                if(var.equals(next.getVariable())){
                    realNum /= next.getRealNumber();
>>>>>>> master
                    exponent -= next.getExponenet();

                    imaginaryNumList.remove(next);

                }

            }

            result.setRealNumber(realNum);

            result.setVariable(var);

            result.setExponenet(exponent);

            totalResult.add(result);
<<<<<<< HEAD

            if(imaginaryNumList.isEmpty()){

                break;

            }

=======
            if(imaginaryNumList.isEmpty()){
                break;
            }
>>>>>>> master
        }

        return totalResult;

    }
}
