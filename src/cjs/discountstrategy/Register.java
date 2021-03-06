package cjs.discountstrategy;

public class Register {

    private Receipt receipt;
    private String storeName;
    

    public final void startNewSale(String custId, DataBaseStrategy db) {
        //needs validation
        receipt = new Receipt(custId, db, "Kohls");

    }

    public final void endSale(OutputStrategy output) {
        output.printReceipt(receipt);
    }

    public final void addItemToSale(String prodId, int qty) {
        //needs validation
        receipt.addItemToReceipt(prodId, qty);
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        //needs validation
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName) {
        //needs validation
        this.storeName = storeName;
    }

}
