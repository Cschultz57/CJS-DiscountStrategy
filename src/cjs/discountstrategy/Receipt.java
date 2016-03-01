package cjs.discountstrategy;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;

public class Receipt {

    private DataBaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems;
    private String store;
    private double grandTotal;
    private final Date date = Calendar.getInstance().getTime();
    NumberFormat money = NumberFormat.getCurrencyInstance();

    public Receipt(String custId, DataBaseStrategy db, String store) {
        setDb(db);
        setCustomer(db.findCustomerById(custId));
        setStore(store);
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
        lineItems = origArray;
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

    public final String getStore() {
        return store;
    }

    public final void setStore(String store) {
        //needs validation
        this.store = store;
    }

    public final double getGrandTotal() {
        return grandTotal;
    }

    public final void setGrandTotal(double GrandTotal) {
        this.grandTotal = GrandTotal;
    }

    public final Date getDate() {
        return date;
    }

    public final double getTotalBeforeDiscount() {
        grandTotal = 0.0;
        for (LineItem item : lineItems) {
            grandTotal += item.getSubTotal();
        }
        return grandTotal;
    }

    public final double getTotalAfterDiscount() {
        grandTotal = 0.0;
        for (LineItem lI : lineItems) {
            grandTotal += lI.getSubTotal();
        }
        return grandTotal;
    }

    public final String ReceiptFormat() {
        double receiptTotal = getTotalAfterDiscount();
        StringBuilder sB;
        sB = new StringBuilder("Store: " + store + "\n" + "Customer: " + customer.getCustName() + "\n" + "Date: " + date + "\n");
        LineItem[] items = getLineItems();
        for (LineItem i : items) {
            sB.append(i.getLineItem());
        }
        sB.append("\n");
        sB.append("Total after applied discounts: ").append(money.format(receiptTotal));
        String BuildertoString = sB.toString();
        return BuildertoString;
    }

}
