import java.io.File;
import java.util.List;

/**
 * Runnable task that performs a search on a single  file
 */
public class FileSearch implements Runnable {
    private File file;
    private String term;
    private List<String> allMatches;

    /**
     * Constructor for fileSearch
     * @param file Target file to search
     * @param term Search term
     * @param allMatches Shared list to store results
     */
    public FileSearch(File file, String term, List<String> allMatches) {
        this.file = file;
        this.term = term;
        this.allMatches = allMatches;
    }

    @Override
    public void run() {
        try {
            List<String> results = FileSearchUtil.searchFile(file, term);
            synchronized (allMatches) {
                allMatches.addAll(results);
            }
        } catch (Exception e) {
            System.err.println("Eror searching file: " + file.getName());
        }
    }
}