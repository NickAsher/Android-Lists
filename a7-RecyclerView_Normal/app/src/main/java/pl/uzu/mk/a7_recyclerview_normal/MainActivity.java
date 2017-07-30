package pl.uzu.mk.a7_recyclerview_normal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv ;
    ArrayList<DemoItem> listOfItems ;
    YoloRecyclerViewAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfItems = new ArrayList<>() ;


        getReferenceId() ;
        makeFakeData();
        initRecyclerView();

    }

    private void getReferenceId(){
        rv = (RecyclerView)findViewById(R.id.rv) ;
    }


    private void makeFakeData(){
        listOfItems.add(new DemoItem("Heading 1", R.drawable.a2, "This is some yolo text ")) ;
        listOfItems.add(new DemoItem("Heading 2", R.drawable.a3, "This is some yolo text ")) ;
        listOfItems.add(new DemoItem("Heading 3", R.drawable.a4, "This is some yolo text ")) ;
        listOfItems.add(new DemoItem("Heading 4", R.drawable.a5, "This is some yolo text ")) ;
        listOfItems.add(new DemoItem("Heading 5", R.drawable.a6, "This is some yolo text ")) ;
        listOfItems.add(new DemoItem("Heading 6", R.drawable.a7, "This is some yolo text ")) ;
        listOfItems.add(new DemoItem("Heading 7", R.drawable.a8, "This is some yolo text ")) ;
        listOfItems.add(new DemoItem("Heading 8", R.drawable.a9, "This is some yolo text ")) ;
    }

    private void initRecyclerView(){
        adapter = new YoloRecyclerViewAdapter(this, listOfItems) ;
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

    }

}
