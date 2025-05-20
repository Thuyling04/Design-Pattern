/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Mai Linh
 */
public class PaymentClient {
    public void runPayment(IPaymentFactory factory, double amount) {
        PaymentProcessor processor = factory.createPaymentProcessor();

        if (!PaymentValidator.isValidAmount(amount)) {
            System.out.println("So tien khong hop le: " + amount);
            PaymentLogger.logResult(false);
            return;
        }

        boolean result = processor.processPayment(amount);
        PaymentLogger.logResult(result);
    }
}