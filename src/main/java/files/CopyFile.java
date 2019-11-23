package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

    /* Driver Code */
    public static void main(String[] args) {
        copyFile("pom.xml", "newPom.xml");
    }

    /**
     * Copy specified file to destination
     *
     * @param src  the path of src file
     * @param dest the path of destination file
     */
    public static void copyFile(String src, String dest) {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader(src);
            writer = new FileWriter(dest);
            char[] buffer = new char[1024];
            int len = 0;

            while ((len = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, len);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert writer != null;
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
