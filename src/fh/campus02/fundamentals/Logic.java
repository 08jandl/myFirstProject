package fh.campus02.fundamentals;

public class Logic {

    public static void main(String[] args) {

        boolean sunIsShining;
        boolean isRaining;

        sunIsShining = true;
        isRaining = false;

        boolean result;
        result = sunIsShining && isRaining;

        System.out.println("The sun is shining AND it is raining: " + result);

        //---------------------------------------------------------------------------------

        boolean itIsConfusing;
        boolean iKnowWhatsGoingOn;

        itIsConfusing = false;
        iKnowWhatsGoingOn = true;

        boolean result2 = itIsConfusing || iKnowWhatsGoingOn;
        System.out.println("It is confusing OR I know what's going on: " + result2);

        //-------------------------------------------------------------------------------
        // (1 > 3 UND NICHT 3-1 < 5) ODER 2==4*4
        // (1 > 3 && ! 3 - 1 < 5) || 2 == 4*4

        boolean part1;
        boolean part2;
        boolean result3;

        part2 = 2 == 4 * 4;
        part1 = 1 > 3 && !(3 - 1 < 5);

        result3 = part1 || part2;

        System.out.println("Result 3: " + result3);

        //--------------------------------------------------------------------------------
        // (6 >= 2 * 3 || 2 - 3 < 0) && (1 * 1 == 1 && 1 != 1+1)

        boolean partOne = 6 >= 2 * 3 || 2 - 3 < 0;
        boolean partTwo = 1 * 1 == 1 && 1 != 1 + 1;
        boolean result4 = partOne && partTwo;

        System.out.println("Result 4: " + result4);
    }
}
