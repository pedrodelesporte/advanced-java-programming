import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility for searching text within a specific file
 */
public class FileSearchUtil {

    /**
     * Searches for a term in a file and returns match details
     * @param file The file to search
     * @param term The search term
     * @return A list of strings containing the file infos
     * @throws IOException If a file reading error occurs
     */
    public static List<String> searchFile(File file, String term) throws IOException {
        List<String> matches = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(term.toLowerCase())) {
                    matches.add(file.getPath() + ", Line " + lineNumber + ": " + line.trim());
                }
                lineNumber++;
            }
        }
        return matches;
    }
}