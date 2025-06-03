/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap8;

/**
 *
 * @author Mai Linh
 */
public class ConcretePaymentMediator implements Mediator {
    private CreditCardPayment creditCard;
    private CashPayment cash;
    private BankTransferPayment bank;
    private VNPayPayment vnpay;

    public void setCreditCard(CreditCardPayment creditCard) {
        this.creditCard = creditCard;
    }

    public void setCash(CashPayment cash) {
        this.cash = cash;
    }

    public void setBank(BankTransferPayment bank) {
        this.bank = bank;
    }

    public void setVNPay(VNPayPayment vnpay) {
        this.vnpay = vnpay;
    }

    public void notify(PaymentProcessor sender, double amount) {
        if (sender == creditCard) {
            reactOnCreditCard(amount);
        } else if (sender == cash) {
            reactOnCash(amount);
        } else if (sender == bank) {
            reactOnBankTransfer(amount);
        } else if (sender == vnpay) {
            reactOnVNPay(amount);
        }
    }

    private void reactOnCreditCard(double amount) {
        if (amount > 0) {
            System.out.println("Thanh toan bang the tin dung thanh cong.");
        } else {
            System.out.println("Thanh toan bang the tin dung that bai.");
        }
    }

    private void reactOnCash(double amount) {
        if (amount > 0) {
            System.out.println("Thanh toan bang tien mat thanh cong.");
        } else {
            System.out.println("Thanh toan bang tien mat that bai.");
        }
    }

    private void reactOnBankTransfer(double amount) {
        if (amount > 0) {
            System.out.println("Thanh toan chuyen khoan ngan hang thanh cong.");
        } else {
            System.out.println("Thanh toan chuyen khoan ngan hang that bai.");
        }
    }

    private void reactOnVNPay(double amount) {
        if (amount > 0) {
            System.out.println("Thanh toan bang VNPay thanh cong.");
        } else {
            System.out.println("Thanh toan bang VNPay that bai.");
        }
    }
}
