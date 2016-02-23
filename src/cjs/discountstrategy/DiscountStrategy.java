package cjs.discountstrategy;

public interface DiscountStrategy {

    public abstract double getDiscountAmt(int qty, double unitCost);
}
