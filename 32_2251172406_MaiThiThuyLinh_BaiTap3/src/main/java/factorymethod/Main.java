/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package factorymethod;

/**
 *
 * @author Mai Linh
 */
public class Main {
    public static void main(String[] args) {
        // Credit Card Payment
        PaymentFactory creditFactory = new CreditCardFactory();
        PaymentProcessor creditProcessor = creditFactory.createProcessor();
        System.out.println("CreditCardPayment với amount = 500:");
        creditProcessor.processPayment(500);

        System.out.println("CreditCardPayment với amount = -100:");
        creditProcessor.processPayment(-100); 

        // Cash Payment
        PaymentFactory cashFactory = new CashFactory();
        PaymentProcessor cashProcessor = cashFactory.createProcessor();
        System.out.println("CashPayment với amount = 500:");
        cashProcessor.processPayment(500); 
        System.out.println("CashPayment với amount = -100:");
        cashProcessor.processPayment(-100); 
    }
}

