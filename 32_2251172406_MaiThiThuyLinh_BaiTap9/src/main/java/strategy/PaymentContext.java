/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Mai Linh
 */
public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean pay(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Chua thiet lap che do thanh toan");
        }
        return strategy.processPayment(amount);
    }
}
