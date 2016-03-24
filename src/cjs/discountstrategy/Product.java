package cjs.discountstrategy;

/**
 *
 * @author Carson Schultz
 */
public class Product {

    private String prodId;
    private String prodName;
    private double unitCost;
    private DiscountStrategy discount;
    public static final int ID_MIN = 3;
    public static final int ID_MAX = 7;
    public static final double UC_MIN = 1.00;
    
    public Product(String prodId, String prodName, double unitCost, DiscountStrategy discount) {
        setProdId(prodId);
        setProdName(prodName);
        setUnitCost(unitCost);
        setDiscount(discount);
    }

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId)throws IllegalArgumentException {
        if (prodId == null || prodId.isEmpty() || prodId.length() < ID_MIN || prodId.length() < ID_MAX ) {
            throw new IllegalArgumentException();
        }
        this.prodId = prodId;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName)throws IllegalArgumentException {
        if (prodName == null || prodName.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.prodName = prodName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) throws IllegalArgumentException {
        if (unitCost < UC_MIN) {
            throw new IllegalArgumentException();
        }
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        //needs validation
        this.discount = discount;
    }

}
