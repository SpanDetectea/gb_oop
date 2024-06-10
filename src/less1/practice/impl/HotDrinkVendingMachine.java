package less1.practice.impl;

import java.util.List;

import less1.practice.Product;
import less1.practice.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine {
    public HotDrinkVendingMachine() {
        super();
    }
    public HotDrinkVendingMachine(List<Product> products) {
        super(products);
    }    
}
