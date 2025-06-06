/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package strategy;

/**
 *
 * @author Mai Linh
 */
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Thanh toán bằng thẻ tín dụng
        context.setStrategy(new CreditCardPayment());
        context.pay(500);       
        context.pay(-100);      

        // Thanh toán bằng tiền mặt
        context.setStrategy(new CashPayment());
        context.pay(300);      
        context.pay(-50);     
    }
}

