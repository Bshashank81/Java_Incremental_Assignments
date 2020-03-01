import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class PrintCharacterOccurrence
{
    public void writeCharacterOccurrencesToFile(HashMap<Character,Integer> map) throws IOException {
        String outputFile = "output.txt";
        BufferedWriter out = new BufferedWriter(new FileWriter(outputFile,true));
        for(char ch : map.keySet())
        {
            out.write("The character "+ch+" contains "+map.get(ch)+" characters"+"\n");
        }
        out.close();
    }
}
