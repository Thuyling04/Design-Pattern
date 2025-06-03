/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap8;

/**
 *
 * @author Mai Linh
 */
public class VNPayPayment extends PaymentProcessor {
    public VNPayPayment(Mediator mediator) {
        super(mediator);
    }

    @Override
    public boolean processPayment(double amount) {
        mediator.notify(this, amount);
        return amount > 0;
    }
}
