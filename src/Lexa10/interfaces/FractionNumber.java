package Lexa10.interfaces;

import java.util.Objects;

public class FractionNumber {

    private int dividend;
    private int divisor;

    public FractionNumber() {
    }

    public FractionNumber(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public double value() {
        return dividend / (double) divisor;
    }

    public void reduction() { //метод по сокращению дроби
        //5/15, 2/16, 3/9
        for (int i = Math.min(dividend, divisor); i >= 2; i--) {
            if (dividend % i == 0 && divisor % i == 0) {
                dividend = dividend / i;
                divisor = divisor / i;
            }
        }
    }

    @Override
    public String toString() {
        return dividend + "/" + divisor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumber that = (FractionNumber) o;
        return dividend == that.dividend && divisor == that.divisor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dividend, divisor);
    }
}
