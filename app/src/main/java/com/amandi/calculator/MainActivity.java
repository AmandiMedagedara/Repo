package com.amandi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3;
    TextView txtv;
    EditText t1, t2;
    int no1, no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.btnAdd);
        b1 = (Button)findViewById(R.id.btnDiv);
        b1 = (Button)findViewById(R.id.btnMul);
        b1 = (Button)findViewById(R.id.btnSub);

        t1 = (EditText)findViewById(R.id.e1);
        t2 = (EditText)findViewById(R.id.e2);

        txtv = (TextView)findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText("");
                no1 = Integer.parseInt(t1.getText().toString());
                no2 = Integer.parseInt(t2.getText().toString());
                txtv.setText(Integer.toString(no1+no2));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText("");
                no1 = Integer.parseInt(t1.getText().toString());
                no2 = Integer.parseInt(t2.getText().toString());
                double ans = (double)no1/no2;
                txtv.setText(Double.toString(ans));

            }

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtv.setText("");
                    no1 = Integer.parseInt(t1.getText().toString());
                    no2 = Integer.parseInt(t2.getText().toString());
                    txtv.setText(Integer.toString(no1*no2));

                }

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txtv.setText("");
                        no1 = Integer.parseInt(t1.getText().toString());
                        no2 = Integer.parseInt(t2.getText().toString());
                        txtv.setText(Integer.toString(no1-no2));

                    }
                });

            });

        });


    }



    }
}
