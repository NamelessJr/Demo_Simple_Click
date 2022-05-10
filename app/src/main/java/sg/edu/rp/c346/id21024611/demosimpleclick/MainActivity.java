package sg.edu.rp.c346.id21024611.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textView);
        btnDisplay= findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.TextPersonName);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.RadioGroupGender);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                Toast.makeText(MainActivity.this,"Display button clicked",
                        Toast.LENGTH_SHORT).show();
                String stringResponse = etInput.getText().toString();

                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    stringResponse = "He says " + stringResponse;

                }
                else{
                    // Write the code when female selected
                    stringResponse = "She says " + stringResponse;

                }

                tvDisplay.setText(stringResponse);

            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if(tbtn.isChecked()) {
                    etInput.setEnabled(true);
                }
                else {
                    etInput.setEnabled(false);
                }

            }
        });


    }
}