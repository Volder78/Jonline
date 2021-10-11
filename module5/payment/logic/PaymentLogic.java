package by.jonline.oop.payment.logic;

import by.jonline.oop.payment.bean.Payment;
import by.jonline.oop.payment.bean.Payment.Product;

public class PaymentLogic {

	public double totalPrice(Payment payment) {
		double total = 0;

		for (Product p : payment.getProducts()) {
			total += p.getPrice();
		}

		return total;

	}
	


}
