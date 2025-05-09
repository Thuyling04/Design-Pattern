/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltt;

/**
 *
 * @author Mai Linh
 */

public abstract class PaymentProcessor {
    public boolean processPayment(double amount) {
        if (amount > 0) {
            return true;
        }
        return false;
    }
}
