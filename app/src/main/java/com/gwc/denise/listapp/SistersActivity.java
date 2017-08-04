package com.gwc.denise.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SistersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sisters_activity);

        //create a list of names
        ArrayList<Sisters> sister = new ArrayList<Sisters>();
        //sisters.add("Catherine");
        sister.add(new Sisters("Catherine","Catherine@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Talia","talia@gwc.com",R.mipmap.ic_launcher));
        sister.add(new Sisters("Isha","isha@gwc.com",R.mipmap.ic_launcher));
        sister.add(new Sisters("Hini","hini@gwc.com",R.mipmap.ic_launcher));
        sister.add(new Sisters("Nora","nora@gwc.com",R.mipmap.ic_launcher));
        sister.add(new Sisters("Peta","peta@gwc.com",R.mipmap.ic_launcher));
        sister.add(new Sisters("Sheira", "sheira@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Ella","ella@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Vivian", "vivian@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Sydney","sydney@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Liana", "liana@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Julia", "julia@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Lucy","lucy@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Briana", "briana@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Elisha", "elisha@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Mia", "mia@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Hannah", "hannah@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Whitney", "whitney@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Valerie", "valerie@gwc.com", R.mipmap.ic_launcher));
        sister.add(new Sisters("Tenzin", "tenzin@gwc.com", R.mipmap.ic_launcher));

        /*ArrayAdapter<Sisters> itemsAdapter = new ArrayAdapter<Sisters>(this, android.R.layout.simple_list_item_1, sister);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);*/

        SisterAdaptor adaptor = new SisterAdaptor(this, sister);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }
}
