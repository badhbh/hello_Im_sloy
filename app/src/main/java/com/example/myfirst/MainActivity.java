package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textA;
    private TextView textB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String newstring = getString(R.string.new_text);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getColor(R.color.red);
        }

        ContextCompat.getColor(this, R.color.red);

        textA = findViewById(R.id.textV_1);
        Button clickB = findViewById(R.id.button_1);
        clickB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textA.setText(newstring);

            }
        });

        textB = findViewById(R.id.textView3);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        radioGroup.clearCheck();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case -1:
                        textA.setText("");
                        break;
                   case R.id.radio_pink:
                    textA.setText("yeeeaaa");
                    break;
                    case R.id.radio_green:
                        textA.setText("oaoaoao");
                        break;
                    default:
                        break;
                }

            }
        });

    }
}
