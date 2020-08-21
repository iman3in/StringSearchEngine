import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        SearchEngine searchEngine = new SearchEngine("C:\\Users\\imans\\Desktop\\StringSearchEngine\\src\\dir");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter your search Phrase: ");
            searchEngine.search(scanner.nextLine());
        }
    }
}
