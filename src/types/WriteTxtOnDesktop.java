package types;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTxtOnDesktop {
    public static void generateTxtFile() {
        try {
            // 1. Get the desktop path using string concatenation
            String desktopPath = System.getProperty("user.home") + "/OneDrive/Skrivbord";

            // 2. Define the file name and create the file object
            File file = new File(desktopPath, "hello.txt");

            // 3. Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 4. Write to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello");
            writer.close(); // Close the writer to save the file
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
