package css.cis3334.participation3tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declare variable here
    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init varaibles
        etBill = (EditText) findViewById(R.id.editTextBill);
        etNumParty = (EditText) findViewById(R.id.editTextNumParty);
        tvTotalTip = (TextView) findViewById(R.id.textViewTotalTip);
        tvTipPerPerson = (TextView) findViewById(R.id.textViewTipPerPerson);

    }

    public void onClickCalcButton(View view) {
        Double bill = Double.parseDouble( etBill.getText());
        Double numPeple = Double.parseDouble( etNumParty.getText());
        Double totTip = bill * 0.1;
        Double tipPerPerson = totTip / numPeple;
        tvTotalTip.setText("Total tip: " + totTip.toString());
        tvTipPerPerson.setText("Total tip: " + tipPerPerson.toString());
    }
}
