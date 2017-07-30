package pl.uzu.mk.a8_recyclerview_multipane;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class YoloRecyclerViewAdapter extends RecyclerView.Adapter<YoloRecyclerViewAdapter.YoloRecyclerHolder> {
    Context context ;
    ArrayList<DemoItem> listOfMessages ;
    int VIEWTYPE_1 = 1;
    int VIEWTYPE_2 = 2 ;




    public YoloRecyclerViewAdapter(Context context, ArrayList<DemoItem> listOfMessages){
        this.context = context ;
        this.listOfMessages = listOfMessages ;

    }


    @Override
    public int getItemViewType(int position) {
        if (listOfMessages.get(position).getType() == DemoItem.TPYE_1){
            return VIEWTYPE_1 ;
        } else if (listOfMessages.get(position).getType() == DemoItem.TPYE_2){
            return VIEWTYPE_2 ;
        } else {
            return VIEWTYPE_1 ;
        }
    }

    @Override
    public YoloRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType == VIEWTYPE_1){
            return new YoloSubRecyclerHolder1(LayoutInflater.from(context).inflate(R.layout.singlerow1, parent, false) ) ;
        } else if(viewType == VIEWTYPE_2){
            return new YoloSubRecyclerHolder2(LayoutInflater.from(context).inflate(R.layout.singlerow2, parent, false) ) ;
        } else {
            return new YoloSubRecyclerHolder1(LayoutInflater.from(context).inflate(R.layout.singlerow1, parent, false) ) ;
        }


    }

    @Override
    public void onBindViewHolder(YoloRecyclerHolder holder, final int position) {

        DemoItem currentItem = listOfMessages.get(position) ;
        if(currentItem.getType() == DemoItem.TPYE_1){

            Glide.with(context).load(currentItem.getIconId()).into(holder.iconImageView) ;
            holder.headingTextView.setText(currentItem.getHeading());
            holder.descriptionTextView.setText(currentItem.getDescription());


        }else  if(currentItem.getType() == DemoItem.TPYE_2){
            Glide.with(context).load(currentItem.getIconId()).into(holder.iconImageView) ;
            holder.headingTextView.setText(currentItem.getHeading());
        }




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
//            headingTextView = (TextView)itemView.findViewById(R.id.singleRow1_TextView_Heading) ;
//            iconImageView = (ImageView) itemView.findViewById(R.id.singleRow1_ImageView_Main) ;
//            descriptionTextView = (TextView)itemView.findViewById(R.id.singleRow1_TextView_Description) ;
        }
    }

    public class YoloSubRecyclerHolder1 extends YoloRecyclerHolder{

        public YoloSubRecyclerHolder1(View itemView) {
            super(itemView);
            headingTextView = (TextView)itemView.findViewById(R.id.singleRow1_TextView_Heading) ;
            iconImageView = (ImageView) itemView.findViewById(R.id.singleRow1_ImageView_Main) ;
            descriptionTextView = (TextView)itemView.findViewById(R.id.singleRow1_TextView_Description) ;
        }
    }


    public class YoloSubRecyclerHolder2 extends YoloRecyclerHolder{


        public YoloSubRecyclerHolder2(View itemView) {
            super(itemView);
            headingTextView = (TextView)itemView.findViewById(R.id.singleRow2_TextView_Heading) ;
            iconImageView = (ImageView) itemView.findViewById(R.id.singleRow2_ImageView_Main) ;
//            descriptionTextView = (TextView)itemView.findViewById(R.id.singleRow1_TextView_Description) ;
        }
    }

}

