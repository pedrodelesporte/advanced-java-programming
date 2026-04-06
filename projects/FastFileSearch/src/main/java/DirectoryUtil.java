import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility class to identify files within a directory
 */
public class DirectoryUtil {
    private File rootDir;

    /**
     * Constructor for directoryUtil.
     * @param rootDir The root directory to search
     */
    public DirectoryUtil(File rootDir) {
        this.rootDir = rootDir;
    }

    /**
     * Retrieves an array of files from the root directory
     * @return array of files
     */
    public File[] getFileList() {
        if (rootDir.isDirectory()) {
            return rootDir.listFiles();
        }
        return new File[0];
    }
}