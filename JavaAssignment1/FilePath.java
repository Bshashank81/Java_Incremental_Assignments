import java.io.File;
import java.util.Scanner;

public class FilePath
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String filename = "";
        System.out.println("Enter a pattern: ");
        filename = sc.next();
        while(!filename .equals("quit"))
        {
            File file = new File("/home/shashank");
            File[] allFiles = file.listFiles();
            PatternMatcher pM = new PatternMatcher();
            pM.searchFiles(allFiles, filename);
            System.out.println("If you want to stop searching file pattern, enter \"quit\" or Enter another file name");
            filename = sc.next();
        }
    }
}