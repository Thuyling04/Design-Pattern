/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Mai Linh
 */
public class CashPaymentFactory implements IPaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CashPayment();
    }
}
