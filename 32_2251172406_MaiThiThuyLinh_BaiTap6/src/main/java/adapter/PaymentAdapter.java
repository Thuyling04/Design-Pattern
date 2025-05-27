/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Mai Linh
 */
public class PaymentAdapter implements PaymentInterface {
    private PaymentProcessor adaptee;

    public PaymentAdapter(PaymentProcessor adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public boolean process(double amount) {
        return adaptee.ProcessPayment(amount);
    }
}

