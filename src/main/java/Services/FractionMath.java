package Services;

        import Entities.Fraction;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class FractionMath {
    public static List<Fraction> normalize (List<Fraction> fractionList){
        //simplify fraction
        List<Integer> denominators = new ArrayList<Integer>();
        for(int i = 0; i < fractionList.size(); i++){
            fractionList.set(i,simplify(fractionList.get(i)));
            denominators.add(fractionList.get(i).getDenominator());
        }
        //sort the list of denominators
        Collections.sort(denominators);
        while(!fractionList.isEmpty()){
            for(int i = 0; i < denominators.size(); i++){
                while(i == 0){
                    if(denominators.get(i) % denominators.get(i+1)== 0){

                    }
                }

            }
        }
//todo: Create a return statement here
    }
    public static Fraction simplify(Fraction largeFraction){
        Fraction result = new Fraction();
        boolean reduced = false;
        while(reduced == false) {
            for (int i = 2; i < 10; i++) {
                if ((largeFraction.getNumerator() % i) == 0 && (largeFraction.getDenominator() % i) == 0) {
                    largeFraction.setNumerator(largeFraction.getNumerator() / i);
                    largeFraction.setDenominator(largeFraction.getDenominator() / i);
                }
                else{
                    reduced = true;
                }
            }
        }
        return result;
    }

    public static Fraction addition(List<Fraction> fractionList){
            Fraction result = new Fraction();
            result.setNumerator(0);
            int preNumerator = fractionList.get(0).getNumerator();
            result.setDenominator(fractionList.get(0).getDenominator());

            for(int i = 1; i < fractionList.size(); i++){
                Fraction current = fractionList.get(i);
                preNumerator = result.getNumerator() + current.getNumerator();
            }
            result.setNumerator(preNumerator);
        return result;
    }

    public static Fraction subtraction(List<Fraction> fractionList){
        Fraction result = new Fraction();
        result.setNumerator(0);
        int preNumerator = fractionList.get(0).getNumerator();
        result.setDenominator(fractionList.get(0).getDenominator());

        for(int i = 1; i < fractionList.size(); i++){
            Fraction current = fractionList.get(i);
            preNumerator = result.getNumerator() - current.getNumerator();
        }
        result.setNumerator(preNumerator);
        return result;
    }
}
