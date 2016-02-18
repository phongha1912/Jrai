package com.phongha.learnbahnar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ListView;

public class UnitActivity extends AppCompatActivity {

    String index = null;
    ListView lstUnit;
    Button btnAudio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        int index = getIntent().getIntExtra(UnitsActivity.ID_EXTRA, -1);
        ListView lstUnit = (ListView) findViewById(R.id.listViewUnit);
        MyCustomAdapter adapter;
        if (index != -1) {
            switch (index) {
                case 0:
                    this.setTitle("Bài 1");
                    break;
                case 1:
                    this.setTitle("Bài 2");
                    //Set list of units
                    adapter = new MyCustomAdapter(getResources().getStringArray(R.array.listUnit2Jrai), getResources().getStringArray(R.array.listUnit2VN), AudioFile.unit2, R.id.textViewUnit, R.id.textViewUnitVN, this, R.layout.item_unit, R.id.buttonAudio);
                    //handle listview and assign adapter
                    lstUnit.setAdapter(adapter);
                    break;
                case 2:
                    this.setTitle("Bài 3");
                    break;
                case 3:
                    this.setTitle("Bài 4");
                    break;
                case 4:
                    this.setTitle("Bài 5");
                    break;
                case 5:
                    this.setTitle("Bài 6");
                    break;
                case 6:
                    this.setTitle("Bài 7");
                    break;
                case 7:
                    this.setTitle("Bài 8");
                    break;
                case 8:
                    this.setTitle("Bài 9");
                    break;
                case 9:
                    this.setTitle("Bài 10");
                    break;
                case 10:
                    this.setTitle("Bài 11");
                    break;
                case 11:
                    this.setTitle("Bài 12");
                    break;
                case 12:
                    this.setTitle("Bài 13");
                    break;
                case 13:
                    this.setTitle("Bài 14");
                    break;
                case 14:
                    this.setTitle("Bài 15");
                    break;
                case 15:
                    this.setTitle("Bài 16");
                    break;
                case 16:
                    this.setTitle("Bài 17");
                    break;
                case 17:
                    this.setTitle("Bài 18");
                    break;
                case 18:
                    this.setTitle("Bài 19");
                    break;
                case 19:
                    this.setTitle("Bài 20");
                    break;
                case 20:
                    this.setTitle("Bài 21");
                    break;
                case 21:
                    this.setTitle("Bài 22");
                    break;
                case 22:
                    this.setTitle("Bài 23");
                    break;
                case 23:
                    this.setTitle("Bài 24");
                    break;
                case 24:
                    this.setTitle("Bài 25");
                    break;
                case 25:
                    this.setTitle("Bài 26");
                    break;
                case 26:
                    this.setTitle("Bài 27");
                    break;
                case 27:
                    this.setTitle("Bài 28");
                    break;
                case 28:
                    this.setTitle("Bài 29");
                    break;
                case 29:
                    this.setTitle("Bài 30");
                    break;
                case 30:
                    this.setTitle("Bài 31");
                    break;
                case 31:
                    this.setTitle("Bài 32");
                    break;
                case 32:
                    this.setTitle("Bài 33");
                    break;
                case 33:
                    this.setTitle("Bài 34");
                    break;
                case 34:
                    this.setTitle("Bài 35");
                    break;
                case 35:
                    this.setTitle("Bài 36");
                    break;
                case 36:
                    this.setTitle("Bài 37");
                    break;
                case 37:
                    this.setTitle("Bài 38");
                    break;
                case 38:
                    this.setTitle("Bài 39");
                    break;
                case 39:
                    this.setTitle("Bài 40");
                    break;
                case 40:
                    this.setTitle("Bài 41");
                    break;
                case 41:
                    this.setTitle("Bài 42");
                    break;
                case 42:
                    this.setTitle("Bài 43");
                    break;
                case 43:
                    this.setTitle("Bài 44");
                    break;
                case 44:
                    this.setTitle("Bài 45");
                    break;
                case 45:
                    this.setTitle("Bài 46");
                    break;
                case 46:
                    this.setTitle("Bài 47");
                    break;

//        //instantiate custom adapter
//        MyCustomAdapter adapter = new MyCustomAdapter(list1, list2, this);
//
//        //handle listview and assign adapter
//        ListView lView = (ListView)findViewById(R.id.listView_1);
//        lView.setAdapter(adapter);

//        //Set list of units
//        ListView lstUnit1 = (ListView) findViewById(R.id.listView);
//        lstUnit1.setAdapter(new MyCustomAdapter(getResources().getStringArray(R.array.listUnit1), this);
            }
        }
    }
};
