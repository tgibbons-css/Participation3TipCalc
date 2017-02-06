package css.cis3334.participation3tipcalc;

/**
 * Created by tgibbons on 2/6/2017.
 */
public class TipCalculator implements TipCalculatorInterface {

    //private Double bill;
    //private Integer numPeple;
    private Double totTip;
    private Double tipPerPerson;
    final Double BASIC_TIP = 0.1;

    @Override
    public Double calcTotalTip(Double bill) {
        totTip = bill * BASIC_TIP;
        return totTip;
    }

    @Override
    public Double calcTipPerPerson(Double bill, Integer numPeople) {

        tipPerPerson = calcTotalTip(bill) / numPeople;
        return tipPerPerson;
    }
}
