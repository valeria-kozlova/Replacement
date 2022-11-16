import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MinimumNumber2 {
    public String search(String text, String regexp) {
        Word2 result = new Word2 (text);
        Matcher m = Pattern.compile(regexp).matcher(text);
        while (m.find()) {
            Word2 currentWord = new Word2 (text.substring(m.start(), m.end()));
            if (result.getUniqueCharsNumber() == 1) {
                return result.getWord();
            } else if (currentWord.getUniqueCharsNumber() < result.getUniqueCharsNumber()) {
                result = currentWord;
            }
        }
        return result.getWord();
    }
}