package pl.uzu.mk.listview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this.getApplicationContext() ;


        // Here we are creating some fake data to populate our list
        // we can only pass a list of strings in this adapter
        // if you have an string array, then convert it into arraylist first.
        ArrayList<String> someData = new ArrayList<String>() ;
        for(int i = 1; i<=20; i++){
            someData.add("This is item " + i) ;
        }

        // Now we are initialising our adapter.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,
                R.layout.single_row,R.id.singleRow_TextView_text,someData) ;

        // Getting a reference to the list view to set the Adapter
        ListView lv = (ListView) findViewById(R.id.ListView);
        // Setting the adapter to the list view
        lv.setAdapter(adapter) ;
    }


}
