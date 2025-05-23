/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Mai Linh
 */
public class CashBuilder implements PaymentBuilder {
    private CashPayment cashPayment;
    
    public CashBuilder() {
        reset();
    }
    
    @Override
    public void reset() {
        this.cashPayment = new CashPayment();
    }

    @Override
    public void setAmount(double amount) {
        cashPayment.setAmount(amount);
    }

    @Override
    public void buildProcessor() {
       
    }

    @Override
    public PaymentProcessor getResult() {
        return cashPayment;
    }
}
