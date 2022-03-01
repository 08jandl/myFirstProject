package fh.campus02.readingCode;

public class Swap {
    public static void main(String[] args) {
        float first = 2.3f;
        float second = 3.2f;
        float temporaryStorage;

        System.out.println("----------------------------");
        System.out.println("Before");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        temporaryStorage = first;
        first = second;
        second = temporaryStorage;

        System.out.println("----------------------------");
        System.out.println("After");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("----------------------------");
    }
}
