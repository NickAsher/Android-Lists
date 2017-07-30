package pl.uzu.mk.a2listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomBaseAdapter extends BaseAdapter {
    public Context context ;
    ArrayList<String> mTextList ;
    ArrayList<Integer> mImageIdList ;


    public CustomBaseAdapter(Context context,ArrayList<String> TextList, ArrayList<Integer> ImageIdList){
        this.context = context;
        this.mTextList = TextList ;
        this.mImageIdList = ImageIdList ;
    }
    @Override
    public int getCount() {
        return mTextList.size();
    }

    @Override
    public Object getItem(int position) {
        return mTextList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // when we are at the end postion in a list, we have to make a new view so
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.single_row, parent, false);
        }

        TextView stringData = (TextView) convertView.findViewById(R.id.singleRow_TextView_text) ;
        ImageView imgageData = (ImageView) convertView.findViewById(R.id.singleRow_ImageView_image) ;

        stringData.setText(mTextList.get(position) );
        imgageData.setImageResource(mImageIdList.get(position) );

        return convertView;

    }
}
