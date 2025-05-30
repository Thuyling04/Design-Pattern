/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp._2251172406_maithithuylinh_baitap7;

/**
 *
 * @author Mai Linh
 */
public class ConcretePaymentProcessor extends PaymentProcessor {

    public ConcretePaymentProcessor(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Bat dau xu ly thanh toan...");
        boolean result = super.processPayment(amount);
        System.out.println("Ket thuc xu ly.");
        return result;
    }
}
