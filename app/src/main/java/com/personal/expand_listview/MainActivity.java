package com.personal.expand_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    // 변수 시작.
    ExpandableListView expandableListView;
    ArrayList<String> listGroup = new ArrayList<>();
    HashMap<String, ArrayList<String>> listChild = new HashMap<>();
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 변수 선언
        expandableListView = findViewById(R.id.exp_list_view);

        // 루프 사용.
        for (int g=0; g<=10; g++){
            // Add values in group list
            listGroup.add("Group"+g);
            // ArrayList 시작.
            ArrayList<String> arrayList = new ArrayList<>();
            // use for loop
            for (int c=0;c<=5;c++) {
                // Add values in arrayList
                arrayList.add("Item"+c);
            }
            // Put values in child list
            listChild.put(listGroup.get(g),arrayList);

        }

        // Initialize adapter
        adapter = new MainAdapter(listGroup,listChild);
        //set adapter
        expandableListView.setAdapter(adapter);
    }
}