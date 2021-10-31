package com.test.pokemonguide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DamageCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_damage_calculator);
    }
    public  void  ButtonClick(View v){
        EditText level = (EditText)findViewById(R.id.level1);
        EditText atk = (EditText)findViewById(R.id.atk1);
        EditText def = (EditText)findViewById(R.id.def1);
        EditText power = (EditText)findViewById(R.id.power1);
        TextView dammin1 = (TextView)findViewById(R.id.dammin);
        TextView dammax1 = (TextView)findViewById(R.id.dammax);
        Double level2 = Double.parseDouble(level.getText().toString());
        Double atk2 = Double.parseDouble(atk.getText().toString());
        Double def2 = Double.parseDouble(def.getText().toString());
        Double power2 = Double.parseDouble(power.getText().toString());
        double v1 = (level2 * 2 / 5 + 2) * power2 * atk2 / def2 / 50;
        Double min1 = (v1 +2)* 0.85;
        Double max1 = v1 +2;
        int min2 = (int)Math.round(min1);
        int max2 = (int)Math.round(max1);
        String min = String.valueOf(min2);
        String max = String.valueOf(max2);
        dammin1.setText(min);
        dammax1.setText(max);
    }
}