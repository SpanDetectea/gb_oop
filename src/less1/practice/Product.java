package less1.practice;

import java.time.LocalDate;

public class Product {

    protected String name;
    protected double price;
    protected LocalDate releaseDate;
    private int volume;
    private int temperature;

    public Product(String name, double price, LocalDate releaseDate, int volume, int temperature) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        this.volume = volume;
        this.temperature = temperature;
    }
    public Product(String name, double price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }

}
