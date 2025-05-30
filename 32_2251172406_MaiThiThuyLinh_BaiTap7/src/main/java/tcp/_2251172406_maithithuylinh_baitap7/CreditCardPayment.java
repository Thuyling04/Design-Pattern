/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp._2251172406_maithithuylinh_baitap7;

/**
 *
 * @author Mai Linh
 */
public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean process(double amount) {
        if (amount > 0) {
            System.out.println("Thanh toan bang the tin dung thanh cong");
            return true;
        }
        System.out.println("So tien khong hop le)");
        return false;
    }
}
