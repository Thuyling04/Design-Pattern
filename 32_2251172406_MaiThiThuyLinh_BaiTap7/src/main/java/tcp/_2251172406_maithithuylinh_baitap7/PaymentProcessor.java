/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp._2251172406_maithithuylinh_baitap7;

/**
 *
 * @author Mai Linh
 */
public class PaymentProcessor {
    protected PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean processPayment(double amount) {
        return paymentMethod.process(amount);
    }
}
