package cjs.discountstrategy;

public class CJSDiscountStrategy {

    public static void main(String[] args) {
        //KLUDGE: do configuration here
        DataBaseStrategy db = new FakeDataBase();

        //Start talking to objects
        Register register = new Register();
        register.startNewSale("100", db);
        
        //test so far
        Customer customer = register.getReceipt().getCustomer();
        System.out.println("Customer "+ customer.getCustName()+ " found and added to receipt.");
        
        register.addItemToSale("11", 2);
        register.addItemToSale("22",3);
        register.addItemToSale("33", 3);
        //test...
         LineItem[] items = register.getReceipt().getLineItems();
         for(LineItem item : items){
             System.out.println(item.getProduct().getProdName());
         }
    }
    

}
