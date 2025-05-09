/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltt;

/**
 *
 * @author Mai Linh
 */

public class CreditCardPayment extends PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        if (super.processPayment(amount)) {
            System.out.println("Thanh toán bằng thẻ tín dụng thành công");
            return true;
        }
        return false;
    }
}
