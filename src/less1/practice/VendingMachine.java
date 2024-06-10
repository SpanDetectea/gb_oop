package less1.practice;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if ((product.getName().equals(name)) && (product.getVolume() == volume) && (product.getTemperature() == temperature)) {
                products.remove(product);
                return product;
            }
        }
        System.out.println("No such product: " + name);
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
}
