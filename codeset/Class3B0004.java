import java.io.*;

public class Class3B0004 {
    private int value;

    public Class3B0004(int value) {
        this.value = value;
    }

    // Pattern: try-with-resources
    public int func3B0004(String filename) {
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sum += Integer.parseInt(line.trim());
            }
            return sum * value;
        } catch (IOException | NumberFormatException e) {
            return -1;  // Return -1 on error
        }
    }
}