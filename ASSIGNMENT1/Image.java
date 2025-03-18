package ASSIGNMENT1;

public class Image {
    public int imgwidth;
    public int imgheight;
    public String colorcode;
    public Image(int a, int b, String c){
        this.imgwidth=a;
        this.imgheight=b;
        this.colorcode=c;
    }

    public void setter(int a,int b,String c){
        this.imgwidth=a;
        this.imgheight=b;
        this.colorcode=c;
    }
    public int getImgwidth(){
        return imgwidth;
    }
    public int getImgheight(){
        return imgheight;
    }
    public String getColorcode(){
        return colorcode;
    }

    public static void main(String[] args) {
        Image i=new Image(10,20,"ABF00");
        System.out.println("Image width: "+i.getImgwidth()+", Image height: "+i.getImgheight()+", Color Code: "+i.getColorcode());
        i.setter(21,25,"CFE");
        System.out.println("After Update:- Image width: "+i.getImgwidth()+", Image height: "+i.getImgheight()+", Color Code: "+i.getColorcode());
    }
}
