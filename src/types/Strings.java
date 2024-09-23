package types;

public class Strings {
    public static void getStringsExercise() {
        // Create a string containing your favorite quote.
        String quote = "Hello World";

        // Convert the quote to uppercase and print it.
        System.out.println(quote.toUpperCase());

        // Find the length of the quote and print it.
        System.out.println(quote.length());

        // Check if the quote contains a specific word (e.g., "life").
        System.out.println(quote.contains("life"));

        // Replace a word in the quote with another word.
        System.out.println(quote.replace("World", "Sweden"));
    }
}
