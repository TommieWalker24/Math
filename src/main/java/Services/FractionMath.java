package Services;

        import Entities.Fraction;

        import java.util.*;

public class FractionMath {
    public static List<Fraction> normalize (List<Fraction> fractionList){
        //simplify fraction
        List<Integer> denominators = new ArrayList<Integer>();
        List<Fraction> normalized = new ArrayList<Fraction>();

        for(int i = 0; i < fractionList.size(); i++){
            fractionList.set(i,simplify(fractionList.get(i)));
            denominators.add(fractionList.get(i).getDenominator());
        }
        //sort the list of denominators from greatest to least
        Collections.sort(denominators, Collections.<Integer>reverseOrder());
        HashMap factor = leastCommonDenominator(denominators);
            for(int i = 0; i < fractionList.size();i++){
                Integer numerator = (Integer) factor.get(fractionList.get(i).getDenominator()) *(fractionList.get(i).getNumerator()) ;
                Integer denominator = (Integer) factor.get(fractionList.get(i).getDenominator()) *(fractionList.get(i).getDenominator()) ;
                Fraction fraction = new Fraction(numerator,denominator);
                normalized.add(fraction);
            }
        return normalized;
    }
    public static HashMap<Integer,Integer> leastCommonDenominator(List<Integer> fractionList){
        HashMap<Integer,Integer> commonDenominator = new HashMap<Integer, Integer>();
        boolean lookingForFactor = true;
        int multiplier = 1;
        while (lookingForFactor){
            //multiply first denominator by multiplier;
            int possibleLcd = fractionList.get(0) * multiplier;
            for(int i = 1; i < fractionList.size(); i++){

                if(possibleLcd % fractionList.get(i) == 0){
                    int factor = possibleLcd / fractionList.get(i);
                    commonDenominator.put(fractionList.get(i), factor);
                    if (i == (fractionList.size() -1)){
                        lookingForFactor = false;
                        commonDenominator.put(fractionList.get(0), (possibleLcd / fractionList.get(0)));
                    }
                } else{
                    multiplier++;
                    commonDenominator.clear();
                    break;
                }
            }
        }
        return commonDenominator;
    }

    public static Fraction simplify(Fraction largeFraction){
        Fraction result = new Fraction();
        boolean startReducing = false;
        boolean reduced = false;

        while(startReducing == false) {
            for (int i = 2; i < 10; i++) {
                if ((largeFraction.getNumerator() % i) == 0 && (largeFraction.getDenominator() % i) == 0) {
                    result.setNumerator(largeFraction.getNumerator() / i);
                    result.setDenominator(largeFraction.getDenominator() / i);
                    reduced = true;
                }
                else{
                    startReducing = true;
                }
            }
        }
        if(!reduced){
            result.setDenominator(largeFraction.getDenominator());
            result.setNumerator(largeFraction.getNumerator());
        }
        return result;
    }

    public static Fraction addition(List<Fraction> fractionList){
            Fraction result = new Fraction(0,fractionList.get(0).getDenominator());
            int preNumerator = fractionList.get(0).getNumerator();
            for(int i = 1; i < fractionList.size(); i++){
                Fraction current = fractionList.get(i);
                if(result.getNumerator() != 0)
                preNumerator = result.getNumerator() + current.getNumerator();
                else{
                    preNumerator = current.getNumerator();
                }
            }
            result.setNumerator(preNumerator);
        return result;
    }

    public static Fraction subtraction(List<Fraction> fractionList){
        Fraction result = new Fraction(0,fractionList.get(0).getDenominator());
        int preNumerator = fractionList.get(0).getNumerator();
        for(int i = 1; i < fractionList.size(); i++){
            Fraction current = fractionList.get(i);
            if(result.getNumerator() != 0)
                preNumerator = result.getNumerator() - current.getNumerator();
            else{
                preNumerator = current.getNumerator();
            }
        }
        result.setNumerator(preNumerator);
        return result;
    }
}
