import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Unit tests for the StockReader class.
 */
public class StockReaderTest {
    private static final String TEST_FILE = "test_data.tsv";
    private StockReader reader;

    /**
     * Sets up a temporary test file and initializes the StockReader.
     * @throws IOException if file creation fails
     */
    @BeforeEach
    public void setUp() throws IOException {
        File file = new File(TEST_FILE);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("12/26/25\t6936.02\t6945.77\t6921.6\t6929.94\n");
            writer.write("12/1/25\t6812.3\t6843.65\t6799.94\t6812.63\n");
        }
        reader = new StockReader(TEST_FILE);
        file.deleteOnExit(); // Clean up after test
    }

    /**
     * Tests retrieving a valid stock date.
     */
    @Test
    public void testGetValidStock() {
        Stock stock = reader.getStock("12/26/25");
        assertNotNull(stock, "Stock should not be null");
        assertEquals("12/26/25", stock.getDate());
        assertEquals(6936.02, stock.getOpen());
    }

    /**
     * Tests retrieving an invalid stock date.
     */
    @Test
    public void testGetInvalidStock() {
        Stock stock = reader.getStock("01/01/99");
        assertNull(stock, "Stock should be null for a missing date");
    }
}