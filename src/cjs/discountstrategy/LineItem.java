package cjs.discountstrategy;

public class LineItem {

    private Product product;
    private int qty;
    private double[] subtotals;

    public LineItem(String prodId, int qty, DataBaseStrategy db) {
        setProduct(db.findProductById(prodId));
        this.qty = qty;
        getSubTotal();
    }

    /**
     *
     * @return product info and quantity
     */
    public final String getLineItem() {
        String lineItem = this.getProduct().getProdId() + " " + this.getProduct().getProdName() + " " + this.getQty();
        return lineItem;
    }
    public final String getProductName(){
        return product.getProdName();
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }

    public final double getSubTotal() {
        return qty * product.getUnitCost();
    }

    public final double getDiscountAmt() {
        return product.getDiscount().getDiscountAmt(qty, product.getUnitCost());
    }

}
