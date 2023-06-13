package HW_4;

public class task_1 {
    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        Integer intElement = 420;
        String strElement = "Привет! Это Мария!";
        Double doubleElement = 3.14;

        printElement(intElement);
        printElement(strElement);
        printElement(doubleElement);
    }
}
