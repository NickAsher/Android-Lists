package pl.uzu.mk.a1listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ABC on 2/9/2016.
 */
public class CustomArrayAdapter extends ArrayAdapter<Product>{
    private ArrayList<Product> productArrayList ;

    public CustomArrayAdapter(Context context, int resource, ArrayList<Product> objects) {
        super(context, resource, objects);
        this.productArrayList = objects ;
    }


    @Override
    public View getView(int position,View convertView, ViewGroup parent){

        ImageView imageView ;
        TextView textView ;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.single_row, null) ;
        }
        Product obj = productArrayList.get(position);
        if(obj != null){

            imageView = (ImageView) convertView.findViewById(R.id.singleRow_ImageView_image);
            textView = (TextView) convertView.findViewById(R.id.singleRow_TetView_text);
            imageView.setImageResource(productArrayList.get(position).getImageId());
            //Picasso.with(getContext()).load(MovieList.get(position).getImageUrl()).fit().into(imageView);
            textView.setText(productArrayList.get(position).getTitle()) ;
        }
        return convertView ;
    }
}
