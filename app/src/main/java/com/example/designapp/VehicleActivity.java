package com.example.designapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VehicleActivity extends AppCompatActivity implements View.OnClickListener {
    EditText make,year,color,price,engine;
    String getMake,getYear,getColor,getPrice,getEngine,str1;
    Button btn_create;
    TextView setresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);
        initializeViews();
    }

    public void initializeViews(){
        make=(EditText)findViewById(R.id.make);
        year=(EditText)findViewById(R.id.year);
        color=(EditText)findViewById(R.id.color);
        price=(EditText)findViewById(R.id.price);
        engine=(EditText)findViewById(R.id.engine);

        setresult=(TextView)findViewById(R.id.setresult);

        btn_create=(Button)findViewById(R.id.btn_create);
        btn_create.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_create:
                getMake=make.getText().toString();
                getYear=year.getText().toString();
                getColor=color.getText().toString();
                getPrice=price.getText().toString();
                getEngine=engine.getText().toString();
                str1=("Make: "+getMake+" "+"Year: "+getYear+" "+ "Color: "+getColor+" "+
                        "Price "+getPrice+" "+"Engine: "+getEngine)+"";
                setresult.setText(str1);

        }
    }
}
