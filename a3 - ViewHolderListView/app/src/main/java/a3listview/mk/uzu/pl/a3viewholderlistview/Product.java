package a3listview.mk.uzu.pl.a3viewholderlistview;


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