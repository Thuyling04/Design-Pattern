/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Mai Linh
 */
public class CreditCardBuilder implements PaymentBuilder {
    private CreditCardPayment creditCardPayment;
    
    public CreditCardBuilder() {
        reset();
    }
    
    @Override
    public void reset() {
        this.creditCardPayment = new CreditCardPayment();
    }

    @Override
    public void setAmount(double amount) {
        creditCardPayment.setAmount(amount);
    }

    @Override
    public void buildProcessor() {
        
    }

    @Override
    public PaymentProcessor getResult() {
        return creditCardPayment;
    }
}