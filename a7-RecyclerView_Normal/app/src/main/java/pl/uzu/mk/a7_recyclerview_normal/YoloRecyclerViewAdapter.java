package pl.uzu.mk.a7_recyclerview_normal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;



public class YoloRecyclerViewAdapter extends RecyclerView.Adapter<YoloRecyclerViewAdapter.YoloRecyclerHolder> {
    Context context ;
    ArrayList<DemoItem> listOfMessages ;
    int sizeOfList ;
    int ScrollSpeed ;


    public YoloRecyclerViewAdapter(Context context, ArrayList<DemoItem> listOfMessages){
        this.context = context ;
        this.listOfMessages = listOfMessages ;

    }


    @Override
    public YoloRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.singlerow, parent, false) ;
        return new YoloRecyclerHolder(v) ;


    }

    @Override
    public void onBindViewHolder(YoloRecyclerHolder holder, final int position) {

         final DemoItem currentItem = listOfMessages.get(position) ;

        Glide.with(context).load(currentItem.getIconId()).into(holder.iconImageView) ;
        holder.headingTextView.setText(currentItem.getHeading());
        holder.descriptionTextView.setText(currentItem.getDescription());


        holder.headingTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked at " +position, Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public int getItemCount() {
        return this.listOfMessages.size();
    }




    public class YoloRecyclerHolder extends RecyclerView.ViewHolder{

        TextView headingTextView ;
        ImageView iconImageView ;
        TextView descriptionTextView ;


        public YoloRecyclerHolder(View itemView) {
            super(itemView);
            headingTextView = (TextView)itemView.findViewById(R.id.singleRow1_TextView_Heading) ;
            iconImageView = (ImageView) itemView.findViewById(R.id.singleRow1_ImageView_Main) ;
            descriptionTextView = (TextView)itemView.findViewById(R.id.singleRow1_TextView_Description) ;
        }
    }
}

