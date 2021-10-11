package by.jonline.oop.payment.main;

import by.jonline.oop.payment.bean.Payment;
import by.jonline.oop.payment.logic.PaymentLogic;

public class Main {

	public static void main(String[] args) {
		
		Payment payment = new Payment();
		PaymentLogic pLogic = new PaymentLogic();
		
		payment.addProduct("Milk", 1.20);
		payment.addProduct("Bread", 1.15);
		payment.addProduct("Butter", 3.00);
		payment.addProduct("Cheese", 4.58);
		
		System.out.println("Your choice of " + payment.toString());
		System.out.printf("Total price is %.2f", pLogic.totalPrice(payment));

	}

}
