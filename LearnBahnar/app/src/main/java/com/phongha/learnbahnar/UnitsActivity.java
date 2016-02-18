package com.phongha.learnbahnar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class UnitsActivity extends AppCompatActivity {

    ListView lstUnits;

    //use a string to hold the name our extra, it must include the full package name
    public final static String ID_EXTRA = "com.phongha.learnbahnar.UnitsActivity._ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Set list of units
        lstUnits = (ListView) findViewById(R.id.listViewUnits);
        MyCustomAdapter adapter = new MyCustomAdapter(getResources().getStringArray(R.array.listUnitsJrai) , getResources().getStringArray(R.array.listUnitsVN), R.id.textViewUnitsJrai, R.id.textViewUnitsVN, this, R.layout.item_units);
        //handle listview and assign adapter
        lstUnits.setAdapter(adapter);
        lstUnits.setOnItemClickListener(onListClick);
    }

    private AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent,
                                View view, int position,
                                long id){
            Intent intent = new Intent(UnitsActivity.this, UnitActivity.class);
            intent.putExtra(ID_EXTRA, position);
            startActivity(intent);
        }
    };
}
