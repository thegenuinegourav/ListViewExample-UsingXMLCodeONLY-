package com.example.sourabh.listviewexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            /*
             * Parameters:
               adapter - The AdapterView where the click happened.
               view - The view within the AdapterView that was clicked
               position - The position of the view in the adapter.
               id - The row id of the item that was clicked.
             */
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView itemSelected = (TextView) view;
                Toast.makeText(MainActivity.this, "You have selected " + itemSelected.getText().toString() + " flavour", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
