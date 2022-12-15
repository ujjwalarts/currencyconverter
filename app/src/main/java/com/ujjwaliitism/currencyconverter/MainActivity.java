package com.ujjwaliitism.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText dollar = findViewById(R.id.editText);
        TextView inr= findViewById(R.id.textView);
        Button result = findViewById(R.id.convert);

        result.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View view){

                                          String doll = dollar.getText().toString();
                                          float dollarconvert = Float.parseFloat(doll);


                                          float converted = (float) (dollarconvert*82.5);
                                          inr.setText("INR = "+converted);



                                      }
                                  }


        );



    }
}