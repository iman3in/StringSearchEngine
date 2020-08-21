import java.io.IOException;

public class TextFile {
    private String name;
    private String [] words;

    public TextFile(String url, String name) throws IOException {
        this.name = name;
        this.words = FileReader.getFileReader().getWords(url);
    }

    public String getName() {
        return name;
    }

    public String[] getWords() {
        return words;
    }

    public boolean has(String word){
        for (String tempWord : words){
            if (tempWord.equals(word))
                return true;
        }
        return false;
    }


}
