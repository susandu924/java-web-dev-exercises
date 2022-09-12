package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
//       Positive integer if 01 is greater than 02
//       Negative integer if 01 is less than 02
//        Zero if 01 and 02 are equal
        if(o1.getCost() >  o2.getCost()){
            return 1;
        } else if (o1.getCost() < o2.getCost()){
            return -1;
        } else
        return 0;
    }
}
