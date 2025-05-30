/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tcp._2251172406_maithithuylinh_baitap7;

/**
 *
 * @author Mai Linh
 */
public class Client {
    public static void main(String[] args) {
        // Dùng CreditCard
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentProcessor creditProcessor = new ConcretePaymentProcessor(creditCard);
        creditProcessor.processPayment(500);
        creditProcessor.processPayment(-100);

        System.out.println("---------------");

        // Dùng Cash
        PaymentMethod cash = new CashPayment();
        PaymentProcessor cashProcessor = new ConcretePaymentProcessor(cash);
        cashProcessor.processPayment(200);
        cashProcessor.processPayment(-50);
    }
}
