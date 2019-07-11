package com.company;
import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse { 
    ArrayList<Parcel> parcels;

    public Warehouse() {
        parcels = new ArrayList<Parcel>();
    }

    public void sendParcels(ArrayList<Parcel> p) {
        for(Parcel i : p) {
            if(parcels.contains(i)) {
                i.setInFactory(false);
                parcels.remove(p);
            } else {
                System.out.println("A parcel for "+i.getName() + "is not in Warehouse");
            }

        }
    }

    public ArrayList<Parcel> getParcels() {
        return parcels;
    }

    public void addParcel(Parcel P) {
            parcels.add(P);
    }

    public void listItems() {
        System.out.println("Warehouse inventory: ");
        for(Parcel p : parcels) {
            System.out.println("Parcel for " + p.getName() + " contains:");
            if(p.getItems().size() != 0) {
                p.listItems();
            } else { System.out.println("    nothing"); }
        }
        System.out.println("");
    }

    public void info() {
        int totalParcels = 0;
        int totalWeight = 0;
        int totalValue = 0;
        // AVON, ISAGENIX, AMWAY, NUTRIMETRICS, TUPPERWARE, OTHER;
        int totalAVON = 0;
        int totalISAGENIX = 0;
        int totalAMWAY = 0;
        int totalNUTRIMETRICS = 0;
        int totalTUPPERWARE = 0;
        int totalOTHER = 0;

        for(Parcel p : parcels) {
            totalParcels += 1;
            totalWeight += p.getWeight();
            totalValue += p.getValue();

            switch(p.getCompany()) {
                case AVON:
                    totalAVON += 1;
                    break;
                case AMWAY:
                    totalAMWAY += 1;
                    break;
                case ISAGENIX:
                    totalISAGENIX += 1;
                    break;
                case NUTRIMETRICS:
                    totalNUTRIMETRICS += 1;
                    break;
                case TUPPERWARE:
                    totalTUPPERWARE += 1;
                    break;
                case OTHER:
                    totalOTHER += 1;
                    break;

            }
        }
        int sum = totalAVON + totalISAGENIX + totalAMWAY + totalNUTRIMETRICS + totalTUPPERWARE + totalOTHER;
        System.out.println("The warehouse holds "  + totalParcels + " parcels comprising of " + totalWeight + " kg and $" + totalValue + " worth of items.");
        System.out.println("Percentage of each brand comprising of all parcels: ");
        System.out.println("AVON    "+100*(float)totalAVON/sum + "%");
        System.out.println("AMWAY    "+100*(float)totalAMWAY/sum + "%");
        System.out.println("ISAGENIX    "+100*(float)totalISAGENIX/sum + "%");
        System.out.println("NUTRIMETRICS    "+100*(float)totalNUTRIMETRICS/sum + "%");
        System.out.println("TUPPERWARE    "+100*(float)totalTUPPERWARE/sum + "%");
        System.out.println("OTHER    "+100*(float)totalOTHER/sum + "%");


    }

}
