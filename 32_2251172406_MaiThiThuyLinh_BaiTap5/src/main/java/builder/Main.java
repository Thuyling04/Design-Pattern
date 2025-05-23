/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package builder;

/**
 *
 * @author Mai Linh
 */
public class Main {
    public static void main(String[] args) {
        PaymentBuilder creditCardBuilder = new CreditCardBuilder();
        Director director = new Director(creditCardBuilder);

        // Tạo thanh toán qua thẻ tín dụng
        director.constructPayment(500);
        PaymentProcessor processor = creditCardBuilder.getResult();
        processor.processPayment();  

        // Tạo thanh toán bằng tiền mặt
        PaymentBuilder cashBuilder = new CashBuilder();
        director.setBuilder(cashBuilder);
        director.constructPayment(300);
        PaymentProcessor cashProcessor = cashBuilder.getResult();
        cashProcessor.processPayment();  
    }
}
