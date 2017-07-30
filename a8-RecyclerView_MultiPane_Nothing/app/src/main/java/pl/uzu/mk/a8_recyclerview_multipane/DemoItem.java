package pl.uzu.mk.a8_recyclerview_multipane;


public class DemoItem {


    private String mHeading ;
    private int mIconId;
    private String mDescription ;
    private int mType ;

    public static final int TPYE_1 = 1 ;
    public static final int TPYE_2 = 2 ;




    public DemoItem(String Heading, int IconId, String Description, int Type){
        this.mHeading = Heading ;
        this.mIconId = IconId ;
        this.mDescription = Description ;
        this.mType = Type ;
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

    public int getType() {
        return mType;
    }




}
