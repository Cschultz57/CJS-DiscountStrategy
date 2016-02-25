package cjs.discountstrategy;

public class Receipt {

    private DataBaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems;

    public Receipt(String custId, DataBaseStrategy db) {
        setDb(db);
        setCustomer(db.findCustomerById(custId));
        lineItems = new LineItem[0];

    }

    public final void addItemToReceipt(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty, db);
        addItemToArray(lineItems, item);
    }

    private void addItemToArray(LineItem[] origArray, LineItem item) {
        LineItem[] tempArray = new LineItem[origArray.length + 1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length - 1] = item;
        origArray = tempArray;
        lineItems=origArray;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        //needs validation
        this.customer = customer;
    }

    public final DataBaseStrategy getDb() {
        return db;
    }

    public final void setDb(DataBaseStrategy db) {
        //needs validation
        this.db = db;
    }

}
