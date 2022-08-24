package Lexa10.interfaces;

public class FractionNumberOperations {


    public FractionNumber add (FractionNumber a, FractionNumber b){
        int resultDividend = a.getDividend() * b.getDivisor() +
                a.getDivisor() * b.getDividend(); // высчитали общий числитель
        int resultDivisor = a.getDivisor() * b.getDivisor();
        FractionNumber result = new FractionNumber(resultDividend, resultDivisor);
        result.reduction();
        return result;
    }

    public FractionNumber sub (FractionNumber a, FractionNumber b){
        return  null;
    }

    public FractionNumber mul (FractionNumber a, FractionNumber b){
        return  null;
    }



}
