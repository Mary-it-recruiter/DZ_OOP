package HW_4;

public class task_3 {
    public static <T extends Comparable<T>> T getMax(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Integer int1 = 10, int2 = 20;
        Double double1 = 15.5, double2 = 12.8;
        String str1 = "Hello", str2 = "World";

        System.out.println("Max of " + int1 + " and " + int2 + " is " + getMax(int1, int2));
        System.out.println("Max of " + double1 + " and " + double2 + " is " + getMax(double1, double2));
        System.out.println("Max of " + str1 + " and " + str2 + " is " + getMax(str1, str2));
    }
}
