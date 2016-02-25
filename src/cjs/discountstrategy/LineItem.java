
package cjs.discountstrategy;

public class LineItem {
    private Product product;
    private int qty;

    public LineItem(String prodId, int qty, DataBaseStrategy db) {
        setProduct(db.findProductById(prodId));
        this.qty = qty;
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

    
}
