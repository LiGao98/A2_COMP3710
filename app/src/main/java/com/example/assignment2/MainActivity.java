package com.example.assignment2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtkm, txtMi, txtKg, txtLb, txtL, txtGal;


    DecimalFormat df = new DecimalFormat("#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtkm = findViewById(R.id.txtkm);
        txtMi = findViewById(R.id.txtMi);
        txtKg = findViewById(R.id.txtKg);
        txtLb = findViewById(R.id.txtLb);
        txtL = findViewById(R.id.txtL);
        txtGal = findViewById(R.id.txtGal);
        

        // temperature converter
        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = df.format(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = df.format(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        // Weight converter
        txtkm.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strkm = s.toString();
                Log.i("UnitConverter", "Value in txtkm = " + strkm);

                if (!txtkm.isFocused()) return;
                if (strkm.length() == 0) return;


                try {
                    double valkm = Double.parseDouble(strkm);
                    double valMi = valkm * 0.621;
                    String strMi = df.format(valMi);
                    Log.i("UnitConverter", "Value in txtMi = " + strMi);

                    MainActivity.this.txtMi.setText(strMi);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtMi.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strMi = s.toString();
                Log.i("UnitConverter", "Value in txtMi = " + strMi);

                if (!txtMi.isFocused()) return;
                if (strMi.length() == 0) return;

                try {
                    double valMi = Double.parseDouble(strMi);
                    double valkm = valMi / 0.621;
                    String strkm = df.format(valkm);
                    Log.i("UnitConverter", "Value in txtkm = " + strkm);

                    MainActivity.this.txtkm.setText(strkm);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        // Weight converter
        txtKg.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKg = s.toString();
                Log.i("UnitConverter", "Value in txtKg = " + strKg);

                if (!txtKg.isFocused()) return;
                if (strKg.length() == 0) return;


                try {
                    double valKg = Double.parseDouble(strKg);
                    double valLb = valKg * 2.205;
                    String strLb = df.format(valLb);
                    Log.i("UnitConverter", "Value in txtLb = " + strLb);

                    MainActivity.this.txtLb.setText(strLb);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLb.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLb = s.toString();
                Log.i("UnitConverter", "Value in txtLb = " + strLb);

                if (!txtLb.isFocused()) return;
                if (strLb.length() == 0) return;

                try {
                    double valLb = Double.parseDouble(strLb);
                    double valKg = valLb / 2.205;
                    String strKg = df.format(valKg);
                    Log.i("UnitConverter", "Value in txtKg = " + strKg);

                    MainActivity.this.txtKg.setText(strKg);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );
        
        // Volume converter
        txtL.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strL = s.toString();
                Log.i("UnitConverter", "Value in txtL = " + strL);

                if (!txtL.isFocused()) return;
                if (strL.length() == 0) return;


                try {
                    double valL = Double.parseDouble(strL);
                    double valGal = valL * 0.264;
                    String strGal = df.format(valGal);
                    Log.i("UnitConverter", "Value in txtGal = " + strGal);

                    MainActivity.this.txtGal.setText(strGal);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtGal.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strGal = s.toString();
                Log.i("UnitConverter", "Value in txtGal = " + strGal);

                if (!txtGal.isFocused()) return;
                if (strGal.length() == 0) return;

                try {
                    double valGal = Double.parseDouble(strGal);
                    double valL = valGal / 0.264;
                    String strL = df.format(valL);
                    Log.i("UnitConverter", "Value in txtL = " + strL);

                    MainActivity.this.txtL.setText(strL);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

    }


}
