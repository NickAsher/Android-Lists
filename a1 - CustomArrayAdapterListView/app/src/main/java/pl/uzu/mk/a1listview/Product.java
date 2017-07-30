package pl.uzu.mk.a1listview;

/**
 * Created by ABC on 2/9/2016.
 */
public class Product {
    private String title;
    private int imageId ;

    public Product(String title,int imageId){
        this.title = title;
        this.imageId = imageId;
    }

    public String getTitle(){
        return this.title;
    }

    public int getImageId(){
        return this.imageId ;
    }
}
