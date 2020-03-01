import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Token
{
    private String text;
    Token(String text)
    {
        this.text = text;
    }

    public boolean patternMatch(String pattern)
    {
        Pattern tokSplitter = Pattern.compile(pattern);
        Matcher m = tokSplitter.matcher(text);
        if (m.find()) {
            return true;
        }
        else
            return false;
    }
}
