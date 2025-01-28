package JAVA1.src.Overloading;
public class UnitConverter {
    public static double convert(double value,String uf, String ut){
        Double ans=value/1.5;
        return ans;
    }
    public static int convert(int value,String unit){
        return value*60;
    }
    public static int convert(String time){
        int a,b,c;
        int count=0;
        int h=Integer.parseInt(time.substring(0,2));
        int m=Integer.parseInt(time.substring(3,5));
        int s=Integer.parseInt(time.substring(6,8));
        return h*3600+m*60+s;
    }

    public static void main(String[] args) {
        System.out.println("Time in seconds: "+convert("02:00:23"));
    }
}
