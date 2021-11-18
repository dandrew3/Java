package practiceDataType;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("------------------------------------------");
        System.out.println("Integer has a width of 32 (occupies 32 bites");
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue+1));
        System.out.println("Busted Min value = " + (myMinIntValue-1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        System.out.println("------------------------------------------");
        System.out.println("Byte has a width of 8 (occupies 8 bits)");
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My minimum Byte value =" + myMinByteValue);
        System.out.println("My maximum Byte value = " + myMaxByteValue);

        System.out.println("------------------------------------------");
        System.out.println("Short has a width of 16 (occupies 16 bits)");
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My minimum Short value =" + myMinShortValue);
        System.out.println("My maximum Short value = " + myMaxShortValue);

        long myLongValue = 100;
        long bigLongLiteralValue = 21474836472345l;
        System.out.println("------------------------------------------");
        System.out.println("Long has a width of 64 (occupies 64 bits)");
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My minimum Long value =" + myMinLongValue);
        System.out.println("My maximum Long value = " + myMaxLongValue);
        System.out.println(myLongValue);



    }
}
