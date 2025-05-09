/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package qltt;

/**
 *
 * @author Mai Linh
 */

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardPayment();
        PaymentProcessor cash = new CashPayment();

        System.out.println("Kiểm tra CreditCardPayment:");
        creditCard.processPayment(500);     
        creditCard.processPayment(-100);   

        System.out.println("Kiểm tra CashPayment:");
        cash.processPayment(500);         
    }
}
