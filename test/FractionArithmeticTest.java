import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FractionArithmeticTest {
    @Test
    public void addFraction_fractionAdditionEqualsTwo()
    {
        Fraction fraction1 = new Fraction(4, 4);
        Fraction fraction2 = new Fraction(4, 4);
        Fraction expectedResult = new Fraction(2, 1);
        Fraction result = FractionArithmeticUtility.addFraction(fraction1, fraction2);
        assertTrue("Expected: " + expectedResult.numerator + "/" + expectedResult.denominator + "\n" +
                        "Actual: " + result.numerator + "/" + result.denominator
                , result.equals(expectedResult));
    }

    @Test
    public void addFraction_zeroPlusZero()
    {
        Fraction fraction1 = new Fraction(0, 10);
        Fraction fraction2 = new Fraction(0, 9);
        Fraction expectedResult = new Fraction(0, 1);
        Fraction result = FractionArithmeticUtility.addFraction(fraction1, fraction2);
        assertTrue("Expected: " + expectedResult.numerator + "/" + expectedResult.denominator + "\n" +
                        "Actual: " + result.numerator + "/" + result.denominator
                , result.equals(expectedResult));

    }

    @Test
    public void addFraction_addToCreateWholeNumber()
    {
        Fraction fraction1 = new Fraction(1, 1);
        Fraction fraction2 = new Fraction(2, 2);
        Fraction expectedResult = new Fraction(2, 1);
        Fraction result = FractionArithmeticUtility.addFraction(fraction1, fraction2);
        assertTrue("Expected: " + expectedResult.numerator + "/" + expectedResult.denominator + "\n" +
                        "Actual: " + result.numerator + "/" + result.denominator
                , result.equals(expectedResult));
    }
}
