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
        String[] newString = aString.split("[ ,\n]+");
        String aWord;

        for (String word : newString)
        {
            word = cleanWord(word.toLowerCase());

            if (!word.isEmpty())
            {
                int total = count.getOrDefault(word, 0);
                count.put(word, total + 1);
            }
        }

        return count;
    }

    public String cleanWord(String aWord)
    {
        boolean isValid = true;
        String answer = "";
        for (int i = 0; i < aWord.length() && isValid; i++)
        {
            String aCharacter = aWord.substring(i, i + 1);

            if ((i == 0 || i == aWord.length() - 1) && aCharacter.matches("[0-9a-zA-Z]+"))
            {
                answer = answer.concat(aCharacter);
            } else if ((i != 0 && i != aWord.length() - 1) && (aCharacter.matches("[0-9a-zA-Z]+") || aCharacter.matches("\'")))
            {
                answer = answer.concat(aCharacter);
            } else if (i != 0 && i != aWord.length() - 1)
            {
                isValid = false;
            }
        }
        return answer;
    }
}


class WordTesters
{
    public static void main(String[] argsgsgs)
    {
        WordCount words = new WordCount();

        words.cleanWord("'can\'t\'");
    }
}