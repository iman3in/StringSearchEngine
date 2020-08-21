import java.io.File;
import java.io.IOException;

public class SearchEngine {
    private TextFile [] textFiles;

    public SearchEngine(String dir) throws IOException {
        File folder = new File(dir);
        File [] files = folder.listFiles();
        this.textFiles = new TextFile[files.length];
        for (int i = 0; i < files.length; i++) {
            textFiles[i] = new TextFile(files[i].getPath(), files[i].getName());
        }
    }

    public void search(String searchString){
        System.out.println("Results:");
        searchString.toLowerCase();
        String [] orList = searchString.split(" or ");
        for (TextFile textFile : textFiles){
            for (String string : orList){
                String [] andList = string.split(" and ");
                boolean hasAllWords = true;
                for (String word: andList){
                    if (!textFile.has(word))
                        hasAllWords = false;
                }
                if (hasAllWords){
                    System.out.println(textFile.getName());
                    break;
                }
            }
        }
    }
}
