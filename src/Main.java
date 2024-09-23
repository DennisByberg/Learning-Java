public class Main {
    public static void main(String[] args) {
        // Variables();
        PrimitiveTypes();
    }

    private static void Variables() {
        // 1. Declare an integer variable (whole number)
        int number = 10;

        // 2. Declare a float variable (decimal number)
        float number2 = 10.5f;

        // 2.1 Declare a double variable
        double number3 = 10.5;

        // 3. Declare a boolean variable (true or false)
        boolean isHere = true;

        // 4. Declare a char variable (single character)
        char firstLetter = 'd';

        // 5. Declare a String variable (sequence of characters)
        String name = "Dennis";

        // Print all the variables:
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(isHere);
        System.out.println(firstLetter);
        System.out.println(name);
    }

    private static void PrimitiveTypes() {
        // Declare a variable of each primitive type (int, float, double, boolean, char, byte, short, long),
        int a = 300_000;
        float b = 137.1f;
        double c = 138.1;
        boolean d = true;
        char e = 'A';
        byte f = 10;
        short g = 3000;
        long h = 3_000_000;
    }
}