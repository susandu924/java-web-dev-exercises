package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName());

//        sort allergens from highest to lowest
//        Negative integer if 01 is greater than 02
//        Positive integer if 01 is less than 02
//        Zero if 01 and 02 are equal
        if(o1.getAllergens().size() > o2.getAllergens().size()){
            return -1;
        } else if (o1.getAllergens().size() < o2.getAllergens().size()){
            return 1;
        } else
            return 0;

    }
}
