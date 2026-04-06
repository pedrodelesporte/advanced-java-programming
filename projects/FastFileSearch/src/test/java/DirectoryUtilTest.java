import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;

/**
 * Basic test for DirectoryUtil.
 */
public class DirectoryUtilTest {

    @Test
    public void testGetFileList() {
        File dir = new File("test_data");
        DirectoryUtil util = new DirectoryUtil(dir);
        File[] files = util.getFileList();

        assertNotNull(files);
        assertEquals(30, files.length);
    }
}