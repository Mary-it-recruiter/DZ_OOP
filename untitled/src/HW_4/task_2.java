package HW_4;

public class task_2 {
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"apple", "banana", "orange"};

        System.out.print("Integer Array: ");
        printArray(intArr);

        System.out.print("String Array: ");
        printArray(strArr);
    }
}
