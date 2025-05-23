/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Mai Linh
 */
public class CreditCardPayment implements PaymentProcessor {
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean processPayment() {
        if (amount > 0) {
            System.out.println("Thanh toan bang the tin dung thanh cong");
            return true;
        } else {
            System.out.println("Thanh toan bang the tin dung that bai");
            return false;
        }
    }
}
