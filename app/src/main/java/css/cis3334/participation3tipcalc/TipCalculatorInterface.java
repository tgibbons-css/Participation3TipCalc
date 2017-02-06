package css.cis3334.participation3tipcalc;

/**
 * Created by tgibbons on 2/6/2017.
 */
public interface TipCalculatorInterface {
    Double calcTotalTip(Double bill);

    Double calcTipPerPerson(Double bill, Integer numPeople);
}
