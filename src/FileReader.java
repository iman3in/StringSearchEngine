import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    private static FileReader fileReader = null;

    public static FileReader getFileReader(){
        if (fileReader == null){
            fileReader = new FileReader();
        }
        return fileReader;
    }

    public String [] getWords(String url) throws IOException {
        String fileText = getString(url);
        fileText.replace("\n", " ");
        String [] words = fileText.split(" ");
        return words;
    }

    public String getString(String url) throws IOException {
        String string = "";
        byte[] allBytes = Files.readAllBytes(Paths.get(url));
        for (byte temp : allBytes){
            string += (char)temp;
        }
        string.toLowerCase();
        return string;
    }
}
