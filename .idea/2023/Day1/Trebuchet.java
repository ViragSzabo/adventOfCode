import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Trebuchet {
    public static void main(String[] args) throws FileNotFoundException {
        // Parameter: get the path of the file
        File trebuchetFile = new File("C:\\Users\\szabo\\Downloads\\Coding\\adventOfCode\\.idea\\2023\\Day1\\trebuchet.txt");
        Scanner scanner = new Scanner(trebuchetFile);

        // Read the number of lines from the file
        int numberOfLines = scanner.nextInt();
        scanner.nextLine();
        String[] trebuchet = new String[numberOfLines];

        // Read lines from the file and store them in the array
        for(int i = 0; i < numberOfLines; i++) {
            trebuchet[i] = scanner.nextLine();
        }

        int total = 0;
        int firstDigit = 0;
        int lastDigit = 0;

        // Iterates through each line
        for(String line : trebuchet) {
            firstDigit = Character.getNumericValue(line.charAt(0));
            lastDigit = Character.getNumericValue(line.charAt(line.length() - 1));

            // Combine the first- and last digits
            int sumOfDigits = (firstDigit * 10) + lastDigit;

            // Add the calculation to the total
            total += sumOfDigits;
        }

        System.out.println(total);
    }
}