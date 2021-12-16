package arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int [] studentsID = new int[5];
        studentsID[0] = 21;
        studentsID[1] = 31;
        studentsID[2] = 41;
        //studentsID[3] = 51;
        //studentsID[4] = 51;
       // System.out.println(studentsID); in will print out memory location in array [I@4617c264
        System.out.println(studentsID[0]);
        System.out.println(studentsID[1]);
        System.out.println(studentsID[2]);
        System.out.println(studentsID[3]);
        System.out.println(studentsID[4]);

        studentsID[1] = 99;
        System.out.println(studentsID[1]); //99

       // studentsID[5] = 51;  // Index 5 out of bounds for length 5
       //  System.out.println(studentsID[5]); //Index 5 out of bounds for length 5

        System.out.println("========================");
        for (int i = 0; i<studentsID.length; i++) {
            System.out.println(studentsID[i]);
        }
        System.out.println(Arrays.toString(studentsID)); //it will print out all element as array from array
    }
}
