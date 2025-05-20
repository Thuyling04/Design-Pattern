/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bai4;

/**
 *
 * @author Mai Linh
 */
public class Main {
    public static void main(String[] args) {
        PaymentClient client = new PaymentClient();

        // Thử với CreditCardPayment
        client.runPayment(new CreditCardFactory(), 500);
        client.runPayment(new CreditCardFactory(), -100);

        // Thử với CashPayment
        client.runPayment(new CashPaymentFactory(), 300);
        client.runPayment(new CashPaymentFactory(), -50);
    }
}