import game.FindReplace;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FindReplace game = new FindReplace();

        try {

            System.out.println("Enter your word:");
            String userWord = bufferedReader.readLine();
            List<String> userWords = new ArrayList<String>();
            userWords.add(userWord);
            System.out.println(userWords);

            System.out.println("Choose a word from the list to find.");
            String word = bufferedReader.readLine();

        }
        catch(IOException e)
        { e.printStackTrace();
        }
    }
}


