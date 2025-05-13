/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author Mai Linh
 */
public class CashPayment implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return false;
        }
        System.out.println("Thanh toán bằng tiền mặt thành công.");
        return true;
    }
}

