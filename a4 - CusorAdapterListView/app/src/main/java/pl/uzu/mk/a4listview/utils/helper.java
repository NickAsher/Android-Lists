package pl.uzu.mk.a4listview.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import pl.uzu.mk.a4listview.data.DBContract;
import pl.uzu.mk.a4listview.data.DBHelper;

public class helper {

    public static void LoadData(Context context){

        DBHelper mHelper = new DBHelper(context);
        SQLiteDatabase db = mHelper.getWritableDatabase() ;

        // checking if the database is empty or not. We do this check
        // because every time we start this app, in the main activity
        // This LoadData method will be called and if we don't do this check
        // Then every time new items will be added in the database. And we want to add items only once
        String select_everything = "SELECT * FROM " + DBContract.ItemsTable.TABLE_NAME  ;
        Cursor cursor = db.rawQuery(select_everything, null) ;
        if (cursor.getCount() == 0){

            Message.display(context, "addinmg items");

            InsertOrder(db, 111, "Espresso", 10);
            InsertOrder(db, 112, "Irish Coffee", 20);
            InsertOrder(db, 113, "Mocha", 13);
            InsertOrder(db, 114, "Choccolate Coffee", 22);
            InsertOrder(db, 115, "Strawberry Coffee", 56);
            InsertOrder(db, 116, "Devil Frappe", 89);
            InsertOrder(db, 117, "Choco mochoc Sunday", 45);
            InsertOrder(db, 118, "My Nasal fluid", 1000);

        }
        else{
            Message.display(context, "There are already items in the database");
        }

        cursor.close();
        db.close();

    }

    public static void InsertOrder(SQLiteDatabase db, int itemID, String itemName, int itemPrice){
        ContentValues cv = new ContentValues() ;
        cv.put(DBContract.ItemsTable.COLUMN_ITEM_ID, itemID);
        cv.put(DBContract.ItemsTable.COLUMN_ITEM_NAME, itemName);
        cv.put(DBContract.ItemsTable.COLUMN_ITEM_PRICE, itemPrice);
        db.insert(DBContract.ItemsTable.TABLE_NAME, null, cv) ;
    }



}
