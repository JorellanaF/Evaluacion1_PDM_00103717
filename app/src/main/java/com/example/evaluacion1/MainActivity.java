package com.example.evaluacion1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView p1,p2,p3;
    private LinearLayout l1,l2,l3;
    private Button btn1;
    private Integer cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cont = 0;
        l1 = findViewById(R.id.ll_p1);
        l2 = findViewById(R.id.ll_p2);
        l3 = findViewById(R.id.ll_p3);

        p1 = findViewById(R.id.et_p1);
        p2 = findViewById(R.id.et_p2);
        p3 = findViewById(R.id.et_p3);

        btn1 = findViewById(R.id.btn_enviar);

        l1.setOnClickListener(v -> {
            cont = Integer.valueOf(p1.getText().toString());
            cont = cont + 1;
            p1.setText(cont.toString());
        });

        l2.setOnClickListener(v -> {
            cont = Integer.valueOf(p2.getText().toString());
            cont = cont + 1;
            p2.setText(cont.toString());
        });

        l3.setOnClickListener(v -> {
            cont = Integer.valueOf(p3.getText().toString());
            cont = cont + 1;
            p3.setText(cont.toString());
        });

        btn1.setOnClickListener(v ->{
            Intent mIntent = new Intent(this, Main2Activity.class);
        });
    }
}
