package game;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class FindReplaceTest {
    @Test
    public void findWord_replaceWord_word() throws Exception {
        FindReplace testFindWord = new FindReplace();
        String expected = "stay";
        assertEquals(expected, testFindWord.findWord("stay"));

    }




}