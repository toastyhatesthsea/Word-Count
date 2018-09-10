import java.util.HashMap;
import java.util.Map;

public class WordCount
{

    public HashMap<String, Integer> count;

    public WordCount()
    {
        count = new HashMap<>();
    }


    public Map<String, Integer> phrase(String aString)
    {
        String[] newString = aString.split(" ");
        String aWord;

        for (String word : newString)
        {
            newWord = word.split("\'", 3);

            aString.matches("[a-zA-Z]+")
        }

        return count;
    }
}


class WordTesters
{
    public static void main(String[] argsgsgs)
    {
        WordCount words = new WordCount();

        words.phrase("\'can\'t\'");
    }
}