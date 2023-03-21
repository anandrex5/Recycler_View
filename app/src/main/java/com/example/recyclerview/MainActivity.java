package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //define the recyclerView
    private RecyclerView recyclerView;
    //now we need to transfer the country flag ,country names and details info that we will show on
    //so we create arrayList

    private ArrayList<String>countryNameList = new ArrayList<>();
    private ArrayList<String>detailsList = new ArrayList<>();
    private ArrayList<Integer> imageList = new ArrayList<>();

    //Initialize the RecyclerAdapter
    private RecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryNameList.add("India");
        countryNameList.add("Canada");
        countryNameList.add("Isreal");

        //add some more CountryName to use scrollView
        countryNameList.add("India");
        countryNameList.add("Canada");
        countryNameList.add("Israel");
        countryNameList.add("India");
        countryNameList.add("Canada");
        countryNameList.add("Israel");
        countryNameList.add("India");
        countryNameList.add("Canada");
        countryNameList.add("Israel");
        countryNameList.add("India");
        countryNameList.add("Canada");
        countryNameList.add("Israel");
        countryNameList.add("India");
        countryNameList.add("Canada");
        countryNameList.add("Israel");//


        detailsList.add("This is Indian Flag");
        detailsList.add("This is Canada Flag");
        detailsList.add("This is Israel Flag");

        //add some more details to see scrollView
        detailsList.add("This is Indian Flag");
        detailsList.add("This is Canada Flag");
        detailsList.add("This is Israel Flag");
        detailsList.add("This is Indian Flag");
        detailsList.add("This is Canada Flag");
        detailsList.add("This is Israel Flag");
        detailsList.add("This is Indian Flag");
        detailsList.add("This is Canada Flag");
        detailsList.add("This is Israel Flag");
        detailsList.add("This is Indian Flag");
        detailsList.add("This is Canada Flag");
        detailsList.add("This is Israel Flag");
        detailsList.add("This is Indian Flag");
        detailsList.add("This is Canada Flag");
        detailsList.add("This is Israel Flag"); //

        imageList.add(R.drawable.india);
        imageList.add(R.drawable.cananda);
        imageList.add(R.drawable.israel);

        //add some more flags to see scrollView
        imageList.add(R.drawable.india);
        imageList.add(R.drawable.cananda);
        imageList.add(R.drawable.israel);
        imageList.add(R.drawable.india);
        imageList.add(R.drawable.cananda);
        imageList.add(R.drawable.israel);
        imageList.add(R.drawable.india);
        imageList.add(R.drawable.cananda);
        imageList.add(R.drawable.israel);
        imageList.add(R.drawable.india);
        imageList.add(R.drawable.cananda);
        imageList.add(R.drawable.israel);
        imageList.add(R.drawable.india);
        imageList.add(R.drawable.cananda);
        imageList.add(R.drawable.israel);//

        //To Do this , we will create an Object from the recycler adapter class in the main activity.
        //We will now define the adapter class after the array list methods.
        //after we need to write the four parameters which we declared in the RecyclerAdapter class
        adapter = new RecyclerAdapter(countryNameList,detailsList,imageList,MainActivity.this);
        //then ,We have to set the Adapter Object in the Recycler View
        //That will transfer the data from here to feed after class.
        recyclerView.setAdapter(adapter);
    }
}