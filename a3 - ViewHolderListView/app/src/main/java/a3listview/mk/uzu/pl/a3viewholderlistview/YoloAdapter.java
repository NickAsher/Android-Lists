package a3listview.mk.uzu.pl.a3viewholderlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;




public class YoloAdapter extends BaseAdapter {
    public Context context ;
    ArrayList<Product> listOfitems ;



    public YoloAdapter(Context context,ArrayList<Product> listofItem){
        this.context = context;
        this.listOfitems = listofItem ;
    }
    @Override
    public int getCount() {
        return listOfitems.size();
    }

    @Override
    public Object getItem(int position) {
        return listOfitems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder  ;

        // when we are at the end postion in a list, we have to make a new view so
        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.single_row, parent, false);

            holder = new ViewHolder() ;
            holder.stringData = (TextView) convertView.findViewById(R.id.singleRow_TextView_text) ;
            holder.imgageData = (ImageView) convertView.findViewById(R.id.singleRow_ImageView_image) ;
            convertView.setTag(holder);



        }
        else {
            holder = (ViewHolder)convertView.getTag() ;
        }



        holder.stringData.setText(listOfitems.get(position).getTitle() );
        holder.imgageData.setImageResource(listOfitems.get(position).getImageId() );

        return convertView;

    }

    static class ViewHolder{
        TextView stringData ;
        ImageView imgageData ;


    }
}
