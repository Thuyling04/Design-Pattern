/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Mai Linh
 */
public class CashPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Thanh toan bang tien mat thanh cong");
            return true;
        } else {
            System.out.println("So tien khong hop le de thạn toan bang tien mat");
            return false;
        }
    }
}
