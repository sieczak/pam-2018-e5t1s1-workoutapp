package com.example.paulina.workoutapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.paulina.workoutapplication.Adapter.RecycleViewAdapter;
import com.example.paulina.workoutapplication.Model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class listExercise extends AppCompatActivity {

    List<Exercise> exerciseList = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    RecycleViewAdapter adapter;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercise);
        
        initData();

        recyclerView = (RecyclerView)findViewById(R.id.list_ex);
        adapter = new RecycleViewAdapter(exerciseList, getBaseContext());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void initData() {

        exerciseList.add(new Exercise(R.drawable.jeden,"Podchwyt w podporze"));
        exerciseList.add(new Exercise(R.drawable.dwa,"Szrugsy ze sztangą"));
        exerciseList.add(new Exercise(R.drawable.trzy,"Ściąganie linek"));
        exerciseList.add(new Exercise(R.drawable.cztery,"Rozpiętki na ławce"));
        exerciseList.add(new Exercise(R.drawable.piec,"Pompki z taśmą"));

    }
}
