package pl.uzu.mk.a4listview;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import pl.uzu.mk.a4listview.data.DBContract;
import pl.uzu.mk.a4listview.data.DBHelper;
import pl.uzu.mk.a4listview.utils.Message;
import pl.uzu.mk.a4listview.utils.helper;

public class MainActivity extends AppCompatActivity {
    Context context ;
    CustomCursorAdapter adapter ;
    ListView lv ;

    // Following  two variables --> cursor and db are declared as memeber variables, becuase
    // we need to close them in the onFinish method
    Cursor cursor ;
    SQLiteDatabase db ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext() ;
        loadDataInTable() ;


        cursor = getCusorOfDataFromTable() ;

        adapter = new CustomCursorAdapter(context, cursor, 0 ) ;
        lv = (ListView) findViewById(R.id.ListView) ;
        lv.setAdapter(adapter);




    }

    private void loadDataInTable() {
        helper.LoadData(context);
    }

    private Cursor getCusorOfDataFromTable(){
        DBHelper helperObj = new DBHelper(context) ;
        db = helperObj.getReadableDatabase() ;

        // It is mandatory that whenever we are using any kind of Cursor adapter,
        // that we must include the _ID column in the COlumnsProject array, otherwise
        // it will give the following error
        // java.lang.IllegalArgumentException: column '_id' does not exist
        String[] ColumnsArray = { DBContract.ItemsTable._ID, DBContract.ItemsTable.COLUMN_ITEM_ID,
                DBContract.ItemsTable.COLUMN_ITEM_NAME,  DBContract.ItemsTable.COLUMN_ITEM_PRICE } ;

        Cursor cursor = db.query(DBContract.ItemsTable.TABLE_NAME, ColumnsArray,
                null,null,null,null, null) ;



        return cursor ;


    }

    @Override
    public void finish() {
        super.finish();
        if (cursor.isClosed() == false){
            cursor.close();
            Message.display(context, "cursor is closed");
        }
        if (db.isOpen()){
            db.close();
            Message.display(context, "database is closed");
        }


    }
}
