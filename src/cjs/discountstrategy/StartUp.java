package cjs.discountstrategy;

public class StartUp {

    public static void main(String[] args) {
        //KLUDGE: do configuration here
        DataBaseStrategy db = new FakeDataBase();
        ConsoleOutput output = new ConsoleOutput();
        GuiOutput screen = new GuiOutput();
        

        //Start talking to objects
        Register register = new Register();
        register.startNewSale("100", db);

        
        //add products and quantity to sale
        register.addItemToSale("11", 2);
        register.addItemToSale("22", 3);
        register.addItemToSale("33", 3);
        
        //output to screen and console
        register.endSale(screen);
        register.endSale(output);
    }

}
