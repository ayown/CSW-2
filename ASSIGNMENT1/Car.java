package ASSIGNMENT1;

public class Car{
    private String make;
    private String model;
    public Car(String Mk,String Mo){
        this.make=Mk;
        this.model=Mo;
    }
    public void setMake(String mk){
        this.make=mk;
    }
    public void setModel(String mo){
        this.model=mo;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
}


class CarTester {
    public static void main(String[] args) {
        Car myCar1=new Car("Tata","Nexon");
        Car myCar2=new Car(null,null);
        System.out.println("First Car Make = "+myCar1.getMake()+" and its model = "+myCar1.getModel());
        System.out.println("Second Car Make = "+myCar2.getMake()+" and its model = "+myCar2.getModel());
        myCar2.setMake("Hyundai");
        myCar2.setModel("Santro");
        System.out.println("After Updation the make and model of second car = "+myCar2.getMake()+" and its model = "+myCar2.getModel());
    }
}
