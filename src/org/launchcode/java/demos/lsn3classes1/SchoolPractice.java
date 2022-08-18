package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static ArrayList main(String[] args) {

      Student student = new Student();
        student.setName("Susan");
        student.setNumberOfCredits(1);
        student.setGpa(4.0);

//        return student; ??????
        System.out.println(student);
        // Instantiate your Student class for part 2 here!
    }
}
