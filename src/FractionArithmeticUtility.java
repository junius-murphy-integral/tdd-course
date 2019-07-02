public final class FractionArithmeticUtility {

    public static Fraction addFraction(Fraction fractionOne, Fraction fractionTwo){

        Fraction newFraction = getCombinedFraction(fractionOne, fractionTwo);

        if(newFraction.numerator == 0){
            newFraction.denominator = 1;
            return newFraction;
        }

        int greatestCommonDenominator = getGreatestCommonDenominator(newFraction.numerator, newFraction.denominator);
        newFraction.numerator /= greatestCommonDenominator;
        newFraction.denominator /= greatestCommonDenominator;
        return newFraction;
    }

    private static Fraction getCombinedFraction(Fraction fractionOne, Fraction fractionTwo){
        int newDenominator = fractionOne.denominator * fractionTwo.denominator;
        fractionOne.numerator *= fractionTwo.denominator;
        fractionTwo.numerator *= fractionOne.denominator;
        return new Fraction(fractionOne.numerator + fractionTwo.numerator, newDenominator);
    }

    private static int getGreatestCommonDenominator(int numberOne, int numberTwo){
        int greatestCommonDenominator = 1;
        int smallestNumber = numberOne;
        if (numberTwo < numberOne){
            smallestNumber = numberTwo;
        }
        for(int i = 2; i <= smallestNumber; ++i){
            if(numberOne % i == 0 && numberTwo % i == 0 ){
                greatestCommonDenominator = i;
            }
        }
        return greatestCommonDenominator;
    }
}
