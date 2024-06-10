package less1.practice.impl;

import java.time.LocalDate;

import less1.practice.Product;

public class HotDrink extends Product {
    private int temperature;
    private int volume;

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, int volume) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink [name=" + name + ", price=" + price + ", temperature=" + temperature + ", releaseDate="
                + releaseDate + ", volume=" + volume + "]";
    }

}
