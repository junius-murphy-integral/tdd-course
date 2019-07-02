import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FractionArithmeticTest {
    @Test
    public void addFraction_fractionAdditionEqualsTwo_true() {
        Fraction fraction1 = new Fraction(4, 4);
        Fraction fraction2 = new Fraction(4, 4);
        Fraction result = new Fraction(2, 1);
        assertTrue(FractionArithmeticUtility.addFraction(fraction1, fraction2).equals(result));
    }

    @Test
    public void addFraction_ZeroPlusZero_true() {
        Fraction fraction1 = new Fraction(0, 10);
        Fraction fraction2 = new Fraction(0, 9);
        Fraction result = new Fraction(0, 1);
        assertTrue("Expected: " + result.numerator + "/" + result.denominator + "\n" + "Actual: " + FractionArithmeticUtility.addFraction(fraction1, fraction2).numerator + "/" +
                        FractionArithmeticUtility.addFraction(fraction1, fraction2).denominator
                , FractionArithmeticUtility.addFraction(fraction1, fraction2).equals(result));

    }
}
