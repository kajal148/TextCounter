package com.kajal.textcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {



            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int length = editText.length();
                String convert = String.valueOf(length);
                if(length==0)
                {
                    textView.setText("0/5");
                }else{
                    textView.setText(convert);
                }
            }
            @Override
            public void afterTextChanged(Editable s) { }
        });
    }
}
