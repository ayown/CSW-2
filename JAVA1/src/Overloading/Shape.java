package JAVA1.src.Overloading;
import java.util.*;
public class Shape {
    public void  calculateArea(int side){
        double ar=Math.pow(side,2);
        System.out.println("area of square: "+ar);
    }
    public void calculateArea(int length, int breadth){
        double ar=length*breadth;
        System.out.println("area of rectangle: "+ar);
    }
    public void  calculateArea(double radius){
        double ar=Math.PI*radius*radius;
        System.out.println("area of circle: "+ar);
    }
    public void calculateArea(double base, double height){
        double ar=0.5*base*height;
        System.out.println("area of traingle: "+ar);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Shape sp=new Shape();
        System.out.println("Enter the side for square \n radius for circle \n length and breadth for rectangle \n base and height for triangle respectively: ");
        int s=in.nextInt();
        int l=in.nextInt();
        int b=in.nextInt();
        double r=in.nextDouble();
        double ba=in.nextDouble();
        double h=in.nextDouble();
        sp.calculateArea(s);
        sp.calculateArea(l,b);
        sp.calculateArea(r);
        sp.calculateArea(ba,h);
    }
}
