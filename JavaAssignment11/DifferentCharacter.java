
import java.io.*;
import java.util.HashMap;

public class DifferentCharacter
{

    public HashMap<Character,Integer> putDifferentCharactersIntoMap(File f) throws IOException
    {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        String outputFile = "result.txt";
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String entireString = br.readLine();
        for(int i=0;i<entireString.length();i++)
        {
            char ch = entireString.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                int value = map.get(ch);
                map.put(ch,value+1);
            }
        }
        return map;
    }

}
