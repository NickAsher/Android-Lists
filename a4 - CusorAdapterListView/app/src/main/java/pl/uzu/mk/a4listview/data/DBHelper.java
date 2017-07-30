package pl.uzu.mk.a4listview.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "items.db" ;
    public static final int DATABASE_VERSION = 3 ;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String CREATE_ITEMS_TABLE = "CREATE TABLE " + DBContract.ItemsTable.TABLE_NAME + " ( "
                + DBContract.ItemsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + DBContract.ItemsTable.COLUMN_ITEM_ID + " INTEGER NOT NULL, "
                + DBContract.ItemsTable.COLUMN_ITEM_NAME + " TEXT NOT NULL, "
                + DBContract.ItemsTable.COLUMN_ITEM_PRICE + " INTEGER NOT NULL "
                + ") ;" ;

        db.execSQL(CREATE_ITEMS_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DBContract.ItemsTable.TABLE_NAME);
        onCreate(db);

    }
}
