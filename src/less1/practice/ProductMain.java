package less1.practice;

import less1.practice.impl.HotDrink;
import less1.practice.impl.HotDrinkVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product hd1 = new HotDrink("Cofee", 70, LocalDate.of(2024, 2, 24), 60, 20);
        Product hd3 = new HotDrink("Cofee", 70, LocalDate.of(2024, 2, 24), 40, 20);
        Product hd2 = new HotDrink("Tea", 50, LocalDate.of(2024, 2, 24), 60, 20);
        Product hd4 = new HotDrink("Tea", 50, LocalDate.of(2024, 2, 24), 50, 20);

        VendingMachine vm2 = new HotDrinkVendingMachine();

        vm2.addProducts(List.of(hd1, hd2, hd3, hd4));
        Product temp = vm2.getProduct("Tea", 20, 50);
        // System.out.println(vm2.getProduct("Tea"));
        System.out.println(temp);
    }
}
