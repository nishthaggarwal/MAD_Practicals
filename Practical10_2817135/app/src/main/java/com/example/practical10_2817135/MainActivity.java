package com.example.practical10_2817135;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textview;
    EditText edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textview=findViewById(R.id.textView);
        edittext=findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = edittext.getText().toString();

                SharedPreferences shrd = MainActivity.this.getSharedPreferences("demo", MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();


                editor.putString("str2", "msg");
                editor.apply();

                textview.setText(msg);
            }
        });

        SharedPreferences getShared=getSharedPreferences("demo",MODE_PRIVATE);
        String value1=getShared.getString("str2","enter number");
        textview.setText(value1 );
    }



}
