package Warehouse;

import Warehouse.Warehouse;

public class Item {
    private String description;
    private int value;
    private int weight;

    public Item(String desc, int price, int weight) {
        description = desc;
        this.value = price;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
    // i dont see any functions needed here aside from getters. Don't see a use for setters, unless we change name/price/postAddress.


}
