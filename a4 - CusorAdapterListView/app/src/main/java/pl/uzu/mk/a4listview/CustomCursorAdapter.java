package pl.uzu.mk.a4listview;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomCursorAdapter extends CursorAdapter {
    // to use the Cursor, we must know the indices of the column
    int INDEX_COLUMN_ITEM_ID = 1, INDEX_COLUMN_ITEM_NAME = 2, INDEX_COLUMN_ITEM_PRICE =  3 ;
    Context context ;



    public CustomCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.single_row,null) ;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView idTextView = (TextView) view.findViewById(R.id.singleRow_TextView_ID) ;
        TextView nameTextView = (TextView) view.findViewById(R.id.singleRow_TextView_Name) ;
        TextView priceTextView = (TextView) view.findViewById(R.id.singleRow_TextView_Price) ;

        idTextView.setText("" + cursor.getInt(INDEX_COLUMN_ITEM_ID));
        nameTextView.setText(cursor.getString(INDEX_COLUMN_ITEM_NAME));
        priceTextView.setText("$ " + cursor.getInt(INDEX_COLUMN_ITEM_PRICE));

    }
}
