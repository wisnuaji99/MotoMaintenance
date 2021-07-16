package com.example.motomaintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Item_Selected extends AppCompatActivity {

    Button browser;

    TextView tipemotor, merkmotor, speedometer, services;

    int isiservice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_selected);

        browser=findViewById(R.id.Browser);
        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Item_Selected.this, WebService.class);
                startActivity(intent);
            }
        });

        Bundle bundle = getIntent().getExtras();
        tipemotor = findViewById(R.id.tipemotor);
        merkmotor = findViewById(R.id.merkmotor);
        speedometer = findViewById(R.id.isispeedometer);
        services = findViewById(R.id.isiservice);

        merkmotor.setText(bundle.getString("namamotor"));
        tipemotor.setText(bundle.getString("tipemotor"));
        speedometer.setText(bundle.getString("speedometer"));

        isiservice = Integer.parseInt(bundle.getString("speedometer"));
        Integer.toString(isiservice);

        if  (isiservice < 1000){
            services.setText("1. Penggantian oli "+"2. Pengecekan filter udara "+" 3. Pengecekan busi dan tekanan ban "+"4. Servis mesin");
        }

        else if (isiservice < 5000){
            services.setText("1. Penggantian oli "+"2. Pembersihan filter udara "+" 3. Pengecekan busi "+"4. Pengecekan rantai/cvt "+"5. Servis mesin");
        }

        else if (isiservice < 10000 ){
            services.setText("1. Penggantian oli "+"2. Pengecekan filter udara "+" 3. Penggantian busi "+"4. Pengecekan oli rem "+"5. Penggantian oli matic "+"6. Servis mesin");
        }

        else if (isiservice < 15000 ){
            services.setText("1. Penggantian oli"+"2. Pengecekan filter udara "+"3. Pengecekan busi"+"4. Servis mesin");
        }

        else if (isiservice < 20000 ){
            services.setText("1. Penggantian oli "+"2. Penggantian oli matic "+"3. Pembersihan filter udara "+"4. Pengecekan busi "+"5. Pengecekan rantai/cvt "+"6. Servis mesin");
        }

        else if (isiservice < 25000) {
            services.setText("1. Penggantian oli"+"2. Pengecekan filter udara "+"3. Pengecekan busi"+"4. Servis mesin "+"5. Pengecekan oli rem "+"6. Pengecekan alur dan tekanan ban");
        }

        else if (isiservice < 30000){
            services.setText("1. Penggantian oli"+"2. Pengecekan filter udara "+"3. Pengecekan busi"+"4. Servis mesin "+"5. Pengecekan oli rem "+"6. Penggantian kanvas rem");
        }

        else if (isiservice < 35000 ){
            services.setText("1. Penggantian oli"+"2. Pengecekan filter udara "+"3. Pengecekan busi"+"4. Servis mesin "+"5. Pengecekan oli rem "+"6. pengecekan lampu");
        }

        else if (isiservice < 40000 ){
            services.setText("1. Penggantian oli "+"2. Penggantian oli matic "+"3. Pembersihan filter udara "+"4. Pengecekan busi "+"5. Pengecekan rantai/cvt "+"6. Servis mesin");
        }

        else if (isiservice < 45000 ){
            services.setText("1. Penggantian oli"+"2. Pengecekan filter udara "+"3. Pengecekan busi "+"4. Servis mesin "+"5. Pengecekan oli rem "+"6. Penggantian ban ");
        }

        else if (isiservice <= 50000){
            services.setText("1. Penggantian oli"+"2. Pengecekan filter udara "+"3. Pengecekan busi "+"4. Servis mesin "+"5. Pengecekan ban "+"6. Servis mesin ");
        }

        else {
            services.setText("MOHON HUBUNGI AUTHORIZED SERVICE CENTRE TERDEKAT ANDA");
        }
    }
}
