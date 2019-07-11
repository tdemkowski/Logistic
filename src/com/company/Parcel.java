package com.company;
import java.util.ArrayList;

public class Parcel {
    // a Parcel's components are Items and Items only (for this).
    private Company COMPANY;
    private String postAddress;
    private String name;
    private ArrayList<Item> items;
    private boolean inFactory;
    private int weight=0;
    private int value=0;

    public Parcel(Company COM, String address, String Name, ArrayList<Item> Items) {
        COMPANY = COM;
        postAddress = address;
        name = Name;
        items = Items;
        inFactory = true;

        for(Item i : items) {
            weight += i.getWeight();
            value += i.getValue();
        }

    }

    public Company getCompany() {
        return COMPANY;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public String getName() {
        return name;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setInFactory(boolean A) {
        inFactory = A;
    }

    public int getValue() {
        return value;
    }

    public void listValues() {
        System.out.println("Items for " + name);
        for(Item i : items)
            System.out.println(i.getDescription() + ": $" + i.getValue());
    }

    public void listItems() {
        for(Item i : items) {
            System.out.println("    "+ i.getDescription() +" - $"+ i.getValue() +" - "+ i.getWeight() +" kg");
        }
    }

    public int getWeight() {
        return weight;
    }


}
