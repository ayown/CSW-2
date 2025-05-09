package JAVA1.src.OverRiding;
import java.util.*;

public class Shape {

   public static void draw() {
	   System.out.println("drawing a shape");
   }
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the shape you want to draw");
	   String str = sc.nextLine();
	   switch (str){
	      case "circle":
		      Circle s = new Circle();
		      s.draw();
		      break;
	      case "rectangle":
	    	  Rectangle r = new Rectangle();
	    	  r.draw();
	    	  break;
	      case "Triangle":
	    	  Triangle t = new Triangle();
	    	  t.draw();
	    	  break;
	      default:
	    	  System.out.println("invalid shape");
	   }
	  
   }
}

class Rectangle extends Shape {
	
	public static void draw() {
		System.out.println("drawing a rectangle");
   }
	
}
class Circle extends Shape{
	public static void draw() {

		System.out.println("drawing a circle");
   }
}

class Triangle extends Shape{
	public static void draw() {
		System.out.println("drawing a triangle");
   }
}