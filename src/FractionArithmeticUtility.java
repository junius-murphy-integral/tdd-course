public final class FractionArithmeticUtility {

    public static Fraction addFraction(Fraction fractionOne, Fraction fractionTwo){

        Fraction combinedFraction = combineFraction(fractionOne, fractionTwo);
        return simplifyFraction(combinedFraction);
    }

    private static Fraction combineFraction(Fraction fractionOne, Fraction fractionTwo){
        int newDenominator = fractionOne.denominator * fractionTwo.denominator;
        fractionOne.numerator *= fractionTwo.denominator;
        fractionTwo.numerator *= fractionOne.denominator;
        return new Fraction(fractionOne.numerator + fractionTwo.numerator, newDenominator);
    }

    private static Fraction simplifyFraction(Fraction fraction){
        if(fraction.numerator == 0){
            fraction.denominator = 1;
            return fraction;
        }

        int greatestCommonDenominator = getGreatestCommonDenominator(fraction.numerator, fraction.denominator);
        fraction.numerator /= greatestCommonDenominator;
        fraction.denominator /= greatestCommonDenominator;
        return fraction;
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
