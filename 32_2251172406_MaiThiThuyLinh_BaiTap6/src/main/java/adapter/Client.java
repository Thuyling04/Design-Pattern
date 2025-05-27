/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adapter;

/**
 *
 * @author Mai Linh
 */
public class Client {
    public static void main(String[] args) {
        PaymentInterface creditPayment = new PaymentAdapter(new CreditCardPayment());
        PaymentInterface cashPayment = new PaymentAdapter(new CashPayment());

        creditPayment.process(500);
        creditPayment.process(-100);

        cashPayment.process(500);
        cashPayment.process(-100);
    }
}

