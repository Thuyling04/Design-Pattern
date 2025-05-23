/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Mai Linh
 */
public class Director {
    private PaymentBuilder builder;

    public Director(PaymentBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(PaymentBuilder builder) {
        this.builder = builder;
    }

    public void constructPayment(double amount) {
        builder.reset();
        builder.setAmount(amount);
        builder.buildProcessor();
    }
}