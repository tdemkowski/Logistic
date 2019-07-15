package com.company;
import java.util.ArrayList;
import java.lang.NullPointerException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Company AVON = Company.AVON;
        Company ISAGENIX = Company.ISAGENIX;
        Company NUTRIMETRICS = Company.NUTRIMETRICS;
        Company OTHER = Company.OTHER;

        Warehouse WH = new Warehouse();
        Item I1 = new Item("oil",10,1);
        Item I2 = new Item("cream", 12,3);
        Item I3 = new Item("brush",20,2);
        Item I4 = new Item("stamps",22,1);
        Item I5 = new Item("soaps",30,10);
        Item I6 = new Item("pills",220,1);
        Item I7 = new Item("wine",145,20);
        Item I8 = new Item("protein powder",500,20);
        Item I9 = new Item("protein powder",500,20);
        Item I10 = new Item("protein powder",500,20);

        ArrayList<Item> listP1 = new ArrayList<>();
        ArrayList<Item> listP2 = new ArrayList<>();
        ArrayList<Item> listP3 = new ArrayList<>();
        ArrayList<Item> listP4 = new ArrayList<>();
        ArrayList<Item> listP5 = new ArrayList<>();
        ArrayList<Item> listP6 = new ArrayList<>();
        listP1.add(I1);
        listP1.add(I2);
        listP1.add(I3);
        listP1.add(I4);
        listP2.add(I5);
        listP2.add(I6);
        listP2.add(I7);
        listP3.add(I8);
        listP5.add(I9);
        listP6.add(I10);

        Parcel P1 = new Parcel(AVON, "18 George Street, Sydney", "Bob Bush", listP1);;
        Parcel P2 = new Parcel(ISAGENIX, "4 Parramatta Street, Parramatta", "Jerry Karn", listP2);
        Parcel P3 = new Parcel(NUTRIMETRICS, "105 Macquarie Street, North Ryde", "Sally Prudnyk", listP3);
        Parcel P4 = new Parcel(OTHER, "22 Portney Road, Kingwood", "Doctor K", listP4);
        Parcel P5 = new Parcel(AVON, "22 Portney Road, Kingwood", "Doctor K", listP5);
        Parcel P6 = new Parcel(OTHER, "22 Portney Road, Kingwood", "Doctor K", listP6);
        WH.addParcel(P1);
        WH.addParcel(P2);
        WH.addParcel(P3);
        WH.addParcel(P4);
        WH.addParcel(P5);
        WH.addParcel(P6);

        ArrayList<Parcel> list = new ArrayList<>();
        list.add(P1);
        list.add(P2);
        list.add(P3);
        list.add(P4);
        list.add(P5);

        System.out.println("----- start -----");
        WH.info();
        WH.listItems();

        WH.sendParcels(list);
        System.out.println("----- sent list of parcels -----");
        WH.listItems();
        WH.info();

        WH.sendParcels(WH.getParcels());
        System.out.println("----- sent all parcels -----");
        WH.info();
        WH.listItems();

    }
}
