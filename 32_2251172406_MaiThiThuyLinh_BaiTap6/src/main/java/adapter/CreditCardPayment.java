/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Mai Linh
 */
public class CreditCardPayment extends PaymentProcessor {
    @Override
    public boolean ProcessPayment(double amount) {
        if (amount > 0) {
            System.out.println("Thanh toan bang the tin dung thanh cong");
            return true;
        } else {
            System.out.println("That bai khi thanh toan bang the tin dung");
            return false;
        }
    }
}
