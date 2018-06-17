package com.example.paulina.workoutapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Notes extends AppCompatActivity implements View.OnClickListener {

    EditText miejsce;
    Button zapisz;
    TextView pozapisie;
    String str_miejsce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        miejsce=findViewById(R.id.miejsce); // łączenie kodu z elementem interfejsu
        zapisz=findViewById(R.id.zapisz);  // łączenie kodu z elementem interfejsu
        pozapisie=findViewById(R.id.pozapisie); // łączenie kodu z elementem interfejsu

        zapisz.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {  //tworzenie metody
        int viewId=v.getId(); //  Przypisanie do zmiennej
        if(viewId==R.id.zapisz){ //sprawdzenie warunku
            str_miejsce=miejsce.getText().toString().trim(); // Usuwa wszystkie białe znaki poczatkowe i koncowej
            String name=str_miejsce; //  Przypisanie do zmiennej
            pozapisie.setText(name);
        }
    }
}