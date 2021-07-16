package com.example.motomaintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
    private Button move;
    String merkmotor;
    String tipemotor;
    String speedometer;
    EditText editText;

    Spinner sp_namamotor, sp_merkmotor;
    ArrayList<String> arrayList_merkmotor;
    ArrayAdapter<String> arrayAdapter_merkmotor;

    ArrayList<String>arrayList_honda, arrayList_yamaha, arrayList_suzuki;
    ArrayAdapter<String> arrayAdapter_namamotor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_merkmotor = (Spinner) findViewById(R.id.sp_merkmotor);
        sp_namamotor = (Spinner) findViewById(R.id.sp_namamotor);

        arrayList_merkmotor=new ArrayList<>();
        arrayList_merkmotor.add("HONDA");
        arrayList_merkmotor.add("YAMAHA");
        arrayList_merkmotor.add("SUZUKI");

        arrayAdapter_merkmotor=new ArrayAdapter<>(getApplicationContext(), R.layout.textview_blue,arrayList_merkmotor);

        sp_merkmotor.setAdapter(arrayAdapter_merkmotor);

        //============ NAMA MOTOR ===========
        arrayList_honda=new ArrayList<>();
        arrayList_honda.add("REVO");
        arrayList_honda.add("SUPRA X 125");
        arrayList_honda.add("GTR 150");
        arrayList_honda.add("BEAT");
        arrayList_honda.add("GENIO");
        arrayList_honda.add("SCOOPY");
        arrayList_honda.add("VARIO");
        arrayList_honda.add("PCX");
        arrayList_honda.add("ADV 150");
        arrayList_honda.add("VERZA");
        arrayList_honda.add("MEGA PRO");
        arrayList_honda.add("CBR 150");

        arrayList_yamaha=new ArrayList<>();
        arrayList_yamaha.add("JUPITER MX");
        arrayList_yamaha.add("JUPITER Z1");
        arrayList_yamaha.add("VEGA");
        arrayList_yamaha.add("MX KING");
        arrayList_yamaha.add("FREEGO");
        arrayList_yamaha.add("MIO");
        arrayList_yamaha.add("XRIDE");
        arrayList_yamaha.add("FINO");
        arrayList_yamaha.add("SOUL");
        arrayList_yamaha.add("NMAX");
        arrayList_yamaha.add("AEROX");
        arrayList_yamaha.add("VIXION");

        arrayList_suzuki=new ArrayList<>();
        arrayList_suzuki.add("SMASH");
        arrayList_suzuki.add("ADDRESS");
        arrayList_suzuki.add("NEX");
        arrayList_suzuki.add("SATRIA 150");
        arrayList_suzuki.add("GSX R150");
        arrayList_suzuki.add("GSX 150");

        sp_merkmotor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    if (position==0)
                    {
                        arrayAdapter_namamotor=new ArrayAdapter<>(getApplicationContext(), R.layout.textview_blue,arrayList_honda);
                        merkmotor = sp_merkmotor.getSelectedItem().toString();
                    }

                    if (position==1)
                    {
                        arrayAdapter_namamotor=new ArrayAdapter<>(getApplicationContext(), R.layout.textview_blue,arrayList_yamaha);
                        merkmotor = sp_merkmotor.getSelectedItem().toString();
                    }

                    if (position==2)
                    {
                        arrayAdapter_namamotor=new ArrayAdapter<>(getApplicationContext(), R.layout.textview_blue,arrayList_suzuki);
                        merkmotor = sp_merkmotor.getSelectedItem().toString();
                    }

                sp_namamotor.setAdapter(arrayAdapter_namamotor);
                sp_namamotor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        tipemotor = sp_namamotor.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //============ NAMA MOTOR ===========

        editText = findViewById(R.id.textInputEdit);

        move=findViewById(R.id.Move);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speedometer = editText.getText().toString();

                Intent intent=new Intent(MainActivity.this,Item_Selected.class);
                intent.putExtra("namamotor",merkmotor);
                intent.putExtra("tipemotor",tipemotor);
                intent.putExtra("speedometer",speedometer);
                Log.d(TAG, "onClick: "+speedometer);
                startActivity(intent);
            }
        });

    }

}