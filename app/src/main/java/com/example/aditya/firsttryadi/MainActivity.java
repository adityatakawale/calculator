package com.example.aditya.firsttryadi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnadd,btnsubstract,btndivide,btnmultiply;
    private TextView result;
    private EditText firstno,secondno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        btnadd = (Button)findViewById(R.id.btnadd);
        btnsubstract = (Button)findViewById(R.id.btnsubstract);
        btndivide = (Button)findViewById(R.id.btndivide);
        btnmultiply = (Button)findViewById(R.id.btnmultiply);
        firstno = (EditText)findViewById(R.id.firstno);
        secondno = (EditText)findViewById(R.id.secondno);
        result = (TextView)findViewById(R.id.result);

        btnadd.setOnClickListener(this);
        btnsubstract.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btndivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        String num1 = firstno.getText().toString();
        String num2 = secondno.getText().toString();
        switch(view.getId()){
            case R.id.btnadd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnsubstract:
                int substraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(substraction));
                break;
            case R.id.btndivide:
                try {
                    int dividation = Integer.parseInt(num1) / Integer.parseInt(num2);
                    result.setText(String.valueOf(dividation));
                }catch (Exception e){
                    result.setText("cannot Divide by Zero");
                }
                break;
            case R.id.btnmultiply:
                int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText(String.valueOf(multiplication));
                break;

        }

    }
}
