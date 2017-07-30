package pl.uzu.mk.a4listview.data;

import android.provider.BaseColumns;


public class DBContract {

    // When wwimplement the base columns class,
    // then we automatically get two variables_ID and _COUNT.
    // _ID is primary key, automatically incremented for each new row added in list
    // _COUNT is the total no. of the rows in the Table.
    public static final class ItemsTable implements BaseColumns{
        public static final String TABLE_NAME = "items_table" ;
        public static final String COLUMN_ITEM_ID = "item_id" ;
        public static final String COLUMN_ITEM_NAME = "item_name" ;
        public static final String COLUMN_ITEM_PRICE = "item_price" ;


    }
}
