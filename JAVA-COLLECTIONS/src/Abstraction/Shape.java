package JAVA1.src.Abstraction;

abstract class Shape {
    abstract public double calculateArea();
    abstract public void displayDetails();
}
class Circle extends Shape{
    int r;
    Circle(int r){
        this.r=r;
    }
    public double calculateArea() {
        return (Math.PI*this.r*this.r);
    }

    public void displayDetails() {
        System.out.println("the radius of circle: "+r);
    }
}
class Rectangle extends Shape{
    int l,b;
    Rectangle(int a, int b){
        l=a;
        this.b=b;
    }
    public double calculateArea(){
        return (this.l*this.b);
    }

    public void displayDetails() {
        System.out.println("the length and breadth of rectangle: "+l+" "+b);
    }
}