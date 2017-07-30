package pl.uzu.mk.a1listview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CustomArrayAdapter adapter ;
    Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext() ;

        // getting an Arraylist with prefined data
        ArrayList<Product> listOfItems = getItemsList() ;

        // Now we are initialising our adapter.
        // It takes three parameters, context, layout of a single row, and an arraylist
        adapter = new CustomArrayAdapter(context,R.layout.single_row, listOfItems) ;

        // Getting a reference to the list view to set the Adapter
        ListView lv = (ListView) findViewById(R.id.main_ListView_list);
        // Setting the adapter to the list view
        lv.setAdapter(adapter) ;
    }




    private ArrayList<Product> getItemsList() {
        // Here we are haking an ArrayList of objects i.e., Products
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product("Dog1", R.drawable.sample_0)) ;
        productList.add(new Product("Dog2", R.drawable.sample_1)) ;
        productList.add(new Product("Dog3", R.drawable.sample_2)) ;
        productList.add(new Product("Dog4", R.drawable.sample_3)) ;
        productList.add(new Product("Dog5", R.drawable.sample_4)) ;
        productList.add(new Product("Dog6", R.drawable.sample_5)) ;
        productList.add(new Product("Dog7", R.drawable.sample_6)) ;
        return  productList ;
    }

    public void Add(View v){
        /** method to add a new object in the arraylist
         * This method is called automaticaly, when the Button with add text is clicked
         * When we use a custom Arrayadapter,
         * then we can simply add new items to the adapter itself by using
         * adapterObject.add(Product) method
         */
        adapter.add(new Product("New doggy", R.drawable.sample_7));
    }

}
