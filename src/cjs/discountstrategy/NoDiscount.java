package cjs.discountstrategy;

/**
 *
 * @author Carson Schultz
 */
public class NoDiscount implements DiscountStrategy {

    private double discountRate;
    private final int NO_DISCOUNT = 0;

    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        //needs validation
        return NO_DISCOUNT;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }

}
