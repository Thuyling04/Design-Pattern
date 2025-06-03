/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap8;

/**
 *
 * @author Mai Linh
 */
public abstract class PaymentProcessor {
    protected Mediator mediator;

    public PaymentProcessor(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract boolean processPayment(double amount);
}
