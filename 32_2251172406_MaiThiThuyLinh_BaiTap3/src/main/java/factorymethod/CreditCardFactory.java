/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author Mai Linh
 */
public class CreditCardFactory extends PaymentFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new CreditCardPayment();
    }
}
