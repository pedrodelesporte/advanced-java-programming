import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.List;
import java.io.IOException;

/**
 * Basic test for FileSearchUtil.
 */
public class FileSearchUtilTest {

    @Test
    public void testSearchFile() throws IOException {

        File file = new File("test_data/Hamlet.md");
        List<String> results = FileSearchUtil.searchFile(file, "fantasy");

        assertNotNull(results);
        // Hamlet contains the word 'fantasy' more times
        assertTrue(results.size() > 0);
    }

    @Test
    public void testCaseInsensitive() throws IOException {
        File file = new File("test_data/Hamlet.md");
        // Should find 'FANTASY' even if its uppercase
        List<String> results = FileSearchUtil.searchFile(file, "FANTASY");

        assertTrue(results.size() > 0);
    }
}