package com.example.calculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView r;
    Button a,s,m,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fadd(View v){
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        r = findViewById(R.id.res);
        if(TextUtils.isEmpty(n1.getText()) || TextUtils.isEmpty(n2.getText())){
            Toast.makeText(this,"One or more fields empty!",Toast.LENGTH_SHORT).show();
            return;
        }
        float f = Float.parseFloat(n1.getText().toString());
        float s = Float.parseFloat(n2.getText().toString());
        float ans = f+s;
        r.setText(Float.toString(ans));
    }
    public void fsub(View v){
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        r = findViewById(R.id.res);
        if(TextUtils.isEmpty(n1.getText()) || TextUtils.isEmpty(n2.getText())){
            Toast.makeText(this,"One or more fields empty!",Toast.LENGTH_SHORT).show();
            return;
        }
        float f = Float.parseFloat(n1.getText().toString());
        float s = Float.parseFloat(n2.getText().toString());
        float ans = f-s;
        r.setText(Float.toString(ans));
    }
    public void fmul(View v){
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        r = findViewById(R.id.res);
        if(TextUtils.isEmpty(n1.getText()) || TextUtils.isEmpty(n2.getText())){
            Toast.makeText(this,"One or more fields empty!",Toast.LENGTH_SHORT).show();
            return;
        }
        float f = Float.parseFloat(n1.getText().toString());
        float s = Float.parseFloat(n2.getText().toString());
        float ans = f*s;
        r.setText(Float.toString(ans));
    }
    public void fdiv(View v){
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        r = findViewById(R.id.res);
        if(TextUtils.isEmpty(n1.getText()) || TextUtils.isEmpty(n2.getText())){
            Toast.makeText(this,"One or more fields empty!",Toast.LENGTH_SHORT).show();
            return;
        }
        float f = Float.parseFloat(n1.getText().toString());
        float s = Float.parseFloat(n2.getText().toString());
        if(s==0) {
            Toast.makeText(this,"Devide by zero!",Toast.LENGTH_SHORT).show();
            return;
        }
        float ans = f/s;
        r.setText(Float.toString(ans));
    }
}