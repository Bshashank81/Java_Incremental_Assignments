import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class TesterClass
{
    public static void main(String[] args)
    {
        File file=new File(args[0]);
        DifferentCharacter dc = new DifferentCharacter();
        try
        {
            HashMap<Character,Integer> map = dc.putDifferentCharactersIntoMap(file);
            PrintCharacterOccurrence pco = new PrintCharacterOccurrence();
            pco.writeCharacterOccurrencesToFile(map);
        }
        catch (IOException e)
        {
            System.out.println("the exception is" +e);
        }
    }
}
