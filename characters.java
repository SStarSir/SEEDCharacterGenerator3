package com.example.seedcharactergenerator3;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class characters extends ListActivity {
    TextView selection;
    public int idToModify;
    DatabaseManipulator dm;
    List<String[]> list = new ArrayList<String[]>();
    List<String[]> names2 = null;
    String[] stg1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        dm = new DatabaseManipulator(this);
        names2 = dm.selectAll();
        stg1 = new String[names2.size()];
        int x = 0;
        String stg;

        for (String[] name : names2) {
            stg = name[1] + " - "
                    + name[2] + " - "
                    + name[3] + " - "
                    + name[4];
            stg1[x] = stg;
            x++;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                stg1);
        this.setListAdapter(adapter);
        selection = (TextView) findViewById(R.id.check_selection);
    }

    public void onListItemClick(ListView parent, View v, int position, long id) {
        selection.setText(stg1[position]);
    }
}

