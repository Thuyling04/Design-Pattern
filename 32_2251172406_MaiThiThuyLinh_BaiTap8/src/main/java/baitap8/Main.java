/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package baitap8;

/**
 *
 * @author Mai Linh
 */
public class Main {
    public static void main(String[] args) {
        ConcretePaymentMediator mediator = new ConcretePaymentMediator();

        CreditCardPayment credit = new CreditCardPayment(mediator);
        CashPayment cash = new CashPayment(mediator);
        BankTransferPayment bank = new BankTransferPayment(mediator);
        VNPayPayment vnpay = new VNPayPayment(mediator);

        // Gán các component vào mediator
        mediator.setCreditCard(credit);
        mediator.setCash(cash);
        mediator.setBank(bank);
        mediator.setVNPay(vnpay);

        // Test
        System.out.println("---- CREDIT CARD ----");
        credit.processPayment(500);
        credit.processPayment(-100);

        System.out.println("---- CASH ----");
        cash.processPayment(200);
        cash.processPayment(-50);

        System.out.println("---- BANK TRANSFER ----");
        bank.processPayment(1000);
        bank.processPayment(0);

        System.out.println("---- VNPAY ----");
        vnpay.processPayment(150);
        vnpay.processPayment(-10);
    }
}
