package JAVA1.src.OverRiding;

public class Payment {
	
	public static void pay() {

        System.out.println("processing payment");
	}

	public static void main(String[] args) {
		
		DebitcardPayment d = new DebitcardPayment();
		
		PaypalPayment p = new PaypalPayment();
		
		d.pay();
		p.pay();
		
	}

}

class DebitcardPayment extends Payment{
	public static void pay() {
		 System.out.println("debit card processing payment");
	}
}
class PaypalPayment extends Payment{
	public static void pay() {
		 System.out.println("paypal processing payment");
	}
}