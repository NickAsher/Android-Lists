package pl.uzu.mk.a2listview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> yoloDataList ;
    ArrayList<Integer> yoloImageIdList  ;
    CustomBaseAdapter adapter1 ;
    Context context  ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext() ;

        // here we are adding data to our two lists
        yoloDataList = new ArrayList<String>() ;
        yoloImageIdList = new ArrayList<Integer>() ;
        yoloDataList.add("yolo0") ;
        yoloDataList.add("yolo1") ;
        yoloDataList.add("yolo2") ;
        yoloDataList.add("yolo3") ;
        yoloDataList.add("yolo4") ;
        yoloDataList.add("yolo5") ;
        yoloImageIdList.add(R.drawable.sample_0) ;
        yoloImageIdList.add(R.drawable.sample_1) ;
        yoloImageIdList.add(R.drawable.sample_2) ;
        yoloImageIdList.add(R.drawable.sample_3) ;
        yoloImageIdList.add(R.drawable.sample_4) ;
        yoloImageIdList.add(R.drawable.sample_5) ;


        // Now we are initialising our adapter.
        adapter1= new CustomBaseAdapter(context,yoloDataList, yoloImageIdList) ;

        // Getting a reference to the list view to set the Adapter
        ListView lv = (ListView) findViewById(R.id.ListView);
        // Setting the adapter to the list view
        lv.setAdapter(adapter1) ;
    }

    public void Add(View v){
        /**
         * When we want to add a new item in the base adapter,
         * we add the new item to the data source directly and after adding it
         * we notify the adapter tat the data source has changed.
         * So adapter refreshes its whole data and shows the new data
         */
        int lastIndex = yoloDataList.size() - 1 ;
        yoloDataList.add("new dog") ;
        yoloImageIdList.add(R.drawable.sample_7) ;
        adapter1.notifyDataSetChanged();



    }
    public void Remove(View v){
        /**
         * When we want to remove an new item from the base adapter,
         * we use the same approach as add and change the data source directly
         * and then notify the adapter of thae change
         */
        int lastIndex = yoloDataList.size() - 1 ;
        if (lastIndex > 0){
            yoloDataList.remove(lastIndex) ;
            yoloImageIdList.remove(lastIndex) ;
            adapter1.notifyDataSetChanged();
        }


    }


}
