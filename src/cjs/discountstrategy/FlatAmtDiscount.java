
package cjs.discountstrategy;

/**
 *
 * @author Carson Schultz
 */
public class FlatAmtDiscount implements DiscountStrategy{
    private double discountRate= 5.00;
    
    public FlatAmtDiscount(double discountRate){
        setDiscountRate(discountRate);
    }
    
    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        //needs validation
        return discountRate;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }
    
}
