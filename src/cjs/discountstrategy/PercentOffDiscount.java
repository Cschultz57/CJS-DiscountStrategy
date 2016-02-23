
package cjs.discountstrategy;

/**
 *
 * @author Carson Schultz
 */
public class PercentOffDiscount implements DiscountStrategy{
    private double discountRate;
    
    public PercentOffDiscount(double discountRate){
        setDiscountRate(discountRate);
    }
    
    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        //needs validation
        return unitCost*qty*discountRate;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }
    
}
