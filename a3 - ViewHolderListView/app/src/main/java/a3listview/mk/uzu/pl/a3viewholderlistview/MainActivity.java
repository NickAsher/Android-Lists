package a3listview.mk.uzu.pl.a3viewholderlistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    YoloAdapter adapter ;
    Context context ;
    ArrayList<Product> listOfItems ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext() ;

        listOfItems = getItemsList() ;
        adapter = new YoloAdapter(context, listOfItems) ;
        ListView lv = (ListView) findViewById(R.id.ListView);
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
        productList.add(new Product("Dog11", R.drawable.sample_0)) ;
        productList.add(new Product("Dog12", R.drawable.sample_1)) ;
        productList.add(new Product("Dog13", R.drawable.sample_2)) ;
        productList.add(new Product("Dog14", R.drawable.sample_3)) ;
        productList.add(new Product("Dog15", R.drawable.sample_4)) ;
        productList.add(new Product("Dog16", R.drawable.sample_5)) ;
        productList.add(new Product("Dog17", R.drawable.sample_6)) ;
        productList.add(new Product("Dog21", R.drawable.sample_0)) ;
        productList.add(new Product("Dog22", R.drawable.sample_1)) ;
        productList.add(new Product("Dog23", R.drawable.sample_2)) ;
        productList.add(new Product("Dog24", R.drawable.sample_3)) ;
        productList.add(new Product("Dog25", R.drawable.sample_4)) ;
        productList.add(new Product("Dog26", R.drawable.sample_5)) ;
        productList.add(new Product("Dog27", R.drawable.sample_6)) ;
        return  productList ;
    }


}
