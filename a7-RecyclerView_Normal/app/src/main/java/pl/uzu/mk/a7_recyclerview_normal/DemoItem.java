package pl.uzu.mk.a7_recyclerview_normal;


import android.graphics.drawable.Icon;

public class DemoItem {


    private String mHeading ;
    private int mIconId;
    private String mDescription ;



    public DemoItem(String Heading, int IconId, String Description){
        this.mHeading = Heading ;
        this.mIconId = IconId ;
        this.mDescription = Description ;
    }



    public String getDescription() {
        return mDescription;
    }


    public int getIconId() {
        return mIconId;
    }


    public String getHeading() {
        return mHeading;
    }




}
